package br.com.lucassneiva.api.languages;

public class Language {
    public String title;
    public String img;
    public Integer ranking;
    
    public Language(String title, String img, int ranking) {
        this.title = title;
        this.img = img;
        this.ranking = ranking;
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
