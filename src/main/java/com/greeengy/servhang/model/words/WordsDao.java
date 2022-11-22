package com.greeengy.servhang.model.words;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class WordsDao {

    @Autowired
    private WordsRepository repository;

    public Words save(Words words) {
        return repository.save(words);
    }

    public List<Words> getAllWords() {
        List<Words> Words = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Words::add);
        return Words;
    }

    public void delete(int wordsId) {
        repository.deleteById(wordsId);
    }
}