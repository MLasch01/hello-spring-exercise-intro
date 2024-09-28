package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ResponseBody
//@RequestMapping(value = "hello", method = RequestMethod.POST)
public class HelloController {

    //Handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
//lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }
//lives at /hello/hello
   //Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

//    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form action= 'hello' method='post'>" + //submit a request to /hello
//                "<input type= 'text' name='name'>" +
//                "<input type= 'submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //hello
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method='post'>" + //submit a request to /hello
                "<input type= 'text' name='name'>" +

                "<label for = 'language-select'> Choose a language: </label>" +
                "<select name = 'language'>" +
                "<option value = 'english'> English </option>" +
                "<option value = 'french'> French </option>" +
                "<option value = 'spanish'> Spanish </option>" +
                "<option value = 'german'> German </option>" +
                "<option value = 'italian'> Italian </option>" +
                "</select>" +

                "<input type= 'submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloLanguage (@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "Anonymous";
        }
        return selectLanguage (name, language);
    }

    public String selectLanguage(String name, String language) {
        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello";
        }
        else if (language.equals("french")) {
            greeting = "Bonjour";
        }
        else if (language.equals("spanish")) {
            greeting = "Hola";
        }
        else if (language.equals("german")) {
            greeting = "Hallo";
        }
        else if (language.equals("italian")) {
            greeting = "Bonjourno!";
        }
        return greeting + " " + name;
    }
}
