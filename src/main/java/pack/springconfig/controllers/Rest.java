package pack.springconfig.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
    @GetMapping
    public String index() {
        return "Spring Config is running\n, the following update to check if pipeline is running";
    }
}
