package br.com.lucassneiva.api.languages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
    @Autowired
    private RepositoryLanguage repository;

    @GetMapping("/languages")
    public List<Language> getLangs() {
        List<Language> langs = repository.findAll();
        return langs;
    }

    @PostMapping("/languages")
    public Language addLanguage(@RequestBody Language lang) {
        Language saveLang = repository.save(lang);
        return saveLang;
    }

    
}
