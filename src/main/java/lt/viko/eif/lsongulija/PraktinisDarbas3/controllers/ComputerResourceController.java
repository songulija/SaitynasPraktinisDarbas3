package lt.viko.eif.lsongulija.PraktinisDarbas3.controllers;

import lt.viko.eif.lsongulija.PraktinisDarbas3.model.Computer;
import lt.viko.eif.lsongulija.PraktinisDarbas3.repo.ComputerRepository;
import org.apache.coyote.Response;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Computers API controller
 * @author lukas
 * version 1.0
 */
@RestController
@RequestMapping(value = "/computers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComputerResourceController {
    private ComputerRepository computerRepository = new ComputerRepository();

    /**
     * When making get request to "/computers" route it will return all computers
     * @return ResponseEntity<CollectionModel<EntityModel<Computer>>> Computer resource list
     */
    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<Computer>>> getAll(){
        List<EntityModel<Computer>> computers = computerRepository.getComputers().stream()
                .map(computer -> EntityModel.of(computer,
                        linkTo(methodOn(ComputerResourceController.class).getOneComputer((int)computer.getId())).withSelfRel(),
                        linkTo(methodOn(ComputerResourceController.class).getAll()).withRel("get-all"))).collect(Collectors.toList());
        return ResponseEntity.ok(CollectionModel.of(computers, linkTo(methodOn(ComputerResourceController.class).getAll()).withSelfRel()));
    }

    /**
     * Method to get one computer by id. When making GET request to
     * /computers/{id} route. Have to provide id for that request after /computers/....
     * @param id
     * @return ResponseEntity<EntityModel<Computer>> computer object
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Computer>> getOneComputer(@PathVariable int id){
        /**
         * Setting EntityModel of computer to. Filtering through computer list by id.
         * finding computer object with specified id
         */
        EntityModel<Computer> model = EntityModel.of(computerRepository.getComputers().stream()
        .filter(c -> c.getId() == id).findAny().get());
        /**
         * uriString is identifier that links to self and to getAll
         */
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerResourceController.class).getAll()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Method to update computer object when making PUT request to
     * "/computers/{id} route. Have to provide computer object and computer id
     * provide id as path variable
     * @param computer
     * @param id
     * @return ResponseEntity<EntityModel<Computer>> updated computer
     */
    @PutMapping(value = "/{id}",consumes = "application/json")
    public ResponseEntity<EntityModel<Computer>> putComputer(@RequestBody Computer computer, @PathVariable int id){
        /**
         * Setting entity model of Computer to computer that is provided
         */
        EntityModel<Computer> model = EntityModel.of(computer);
        /**
         * uriString is identifier that links to self and to getAll
         */
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerResourceController.class).getAll()).withRel("get-all"));
        computerRepository.updateComputer(computer, id);

        return ResponseEntity.ok(model);
    }

    /**
     * Method to add new computer to computers list when making POST request to
     * "computers/{id} route. Have to provide computer object
     * @param computer
     * @return ResponseEntity<EntityModel<Computer>> computer recourse
     */
    @PostMapping(consumes = "application/json")
    public ResponseEntity<EntityModel<Computer>> postComputer(@RequestBody Computer computer){
        /**
         * Setting entity model of Computer object to Entity model.of
         * provided computer object.
         */
        EntityModel<Computer> model = EntityModel.of(computer);
        /**
         * uriString is identifier that links to self and to getAll
         */
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerResourceController.class).getAll()).withRel("get-all"));
        /**
         * Check if computer with provided computer id exist or not.
         * If it doesnt exist then we can add one. Else throw exeption
         */
        if(!computerRepository.computerIdExist(computer.getId())){
            computerRepository.addComputer(computer);
            return ResponseEntity.ok(model);
        }else{
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    /**
     * Method to delete computer object from computers list
     * when making DELETE request to "/computers/{id} route
     * Have to provide computer id that you want to delete
     * @param id
     * @return computers
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<CollectionModel<EntityModel<Computer>>> deleteComputer(@PathVariable int id){
        /**
         * Check if computer with provided id exist in
         * computers list than you can delete it. And return all
         * computers with our method getAll. Else throw
         * exeption not found
         */
        if(computerRepository.computerIdExist(id)){
            computerRepository.deleteComputer(id);
            return getAll();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
