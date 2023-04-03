package own.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import own.springframework.jokesapp.services.Joker;

@Controller
public class JokeController {

    private final Joker joker;

    public JokeController(Joker joker) {
        this.joker = joker;
    }

    @RequestMapping({"/", ""})
    public String theJoke(Model model) {
        model.addAttribute("joke", joker.sayJoke());
        return "index";
    }
}
