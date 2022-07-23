package br.com.lucassneiva.api.languages;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    private List<Language> langs =
        List.of(
            new Language("JAVA", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
            new Language("PYTHON", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 2)
        );

    @GetMapping("/fav-lang")
    public String favLangProcessment() {
        return "Hello, JAVA!";
    }

    @GetMapping("/languages")
    public List<Language> getLangs() {
        return langs;
    }
    
}
