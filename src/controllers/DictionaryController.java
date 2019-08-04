package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/translate")
    public String translate(@RequestParam String english, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("one", "mot");
        dictionary.put("two", "hai");
        dictionary.put("three", "ba");
        String vietnamese = dictionary.get(english);
        if (vietnamese != null) {
            model.addAttribute("english", english);
            model.addAttribute("vietnamese", vietnamese);
        } else {
            vietnamese = "Not Found";
            model.addAttribute("english", english);
            model.addAttribute("vietnamese", vietnamese);
        }
        return "dictionary";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}