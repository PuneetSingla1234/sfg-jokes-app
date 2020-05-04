package guru.springframework.sfgjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        String joke=new guru.springframework.norris.chuck.ChuckNorrisQuotes().getRandomQuote();
        model.addAttribute("joke",joke);
        return "chucknorris";
    }
}
