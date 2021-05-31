package lt.viko.eif.lsongulija.PraktinisDarbas3.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * First controller
 * @author Lukas Songulija
 * version 1.0
 */
@RestController
public class FirstController {
    /**
     * When making get request to root route
     */
    @RequestMapping("/")
    public String index(){
        return "Computer service";
    }
}
