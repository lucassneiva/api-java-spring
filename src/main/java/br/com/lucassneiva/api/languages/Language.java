package br.com.lucassneiva.api.languages;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {
    @Id
    private String id;
    private String title;
    private String img;
    private Integer ranking;

    public Language() {}
    
    public Language(String title, String img, Integer ranking) {
        this.title = title;
        this.img = img;
        this.ranking = ranking;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImg() {
        return img;
    }
    public Integer getRanking() {
        return ranking;
    }
    
}
