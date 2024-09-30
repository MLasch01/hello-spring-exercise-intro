package org.launchcode.skills.tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

//    handler corresponds to localhost:8080
    @GetMapping("/")
    public String welcome(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here is the list!</h2>" +

                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +

                "<p>Click <a href = '/form'>here</a> To select your favorite.</p>" +
                "</body>" +
                "</html>";
    }

    //    handler corresponds to localhost:8080/form to display form
    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action= '/form' method='POST'>" + //submit a request to /hello
                "<label for = 'name'> Name: </label> <br/>" +
                "<input type= 'text' name='name' /> <br/>" +

                "<label for = 'language-select1'> My favorite language: </label> <br/>" +
                "<select name = 'language1'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select> <br/>" +

                "<label for = 'language-select2'> My second favorite language: </label> <br/>" +
                "<select name = 'language2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select> <br/>" +

                "<label for = 'language-select3'> My third favorite language: </label> <br/>" +
                "<select name = 'language3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select> <br/>" +

                "<input type= 'submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    //    handler corresponds to localhost:8080/form to process the form and display results
    @PostMapping(value = "form")
    @ResponseBody
    public String skillsFormResult (@RequestParam String name, String language1, String language2, String language3) {

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +

                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +

                "</body>" +
                "</html>";

//        return "<html>" +
//                "<body>" +
//                "<h1>" + name + "</h1>" +
//
//                "<table>" +
//                "<tr>" +
//                "<td>1.</td>" +
//                "<td>" + language1 + "</td>" +
//                "</tr>" +
//                "<tr>" +
//                "<td>2.</td>" +
//                "<td>" + language2 + "</td>" +
//                "</tr>" +
//                "<tr>" +
//                "<td>3.</td>" +
//                "<td>" + language3 + "</td>" +
//                "</tr>" +
//                "</table>" +
//
//                "</body>" +
//                "</html>";

    }
}
