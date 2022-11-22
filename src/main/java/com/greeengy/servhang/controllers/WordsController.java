package com.greeengy.servhang.controllers;

import com.greeengy.servhang.model.words.Words;
import com.greeengy.servhang.model.words.WordsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WordsController {
    @Autowired
    private WordsDao wordsDao;

    @GetMapping("/words/get-all")
    public List<Words> getAllWords(){
        return wordsDao.getAllWords();
    }

    @PostMapping("/words/save")
    public Words save(@RequestBody Words words){
        return wordsDao.save(words);
    }
}
