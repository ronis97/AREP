package edu.escuelaing.arep;

public class HelloController {
    @RequestMapping("/")
    public static String index() {
        return "Greetings from Spring Boot!";
    }
}
