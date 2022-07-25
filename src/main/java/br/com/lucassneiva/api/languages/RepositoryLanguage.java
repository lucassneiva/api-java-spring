package br.com.lucassneiva.api.languages;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryLanguage extends MongoRepository<Language, String> {
    
}
