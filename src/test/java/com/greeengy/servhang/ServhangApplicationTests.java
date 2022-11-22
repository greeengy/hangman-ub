package com.greeengy.servhang;

import com.greeengy.servhang.model.words.Words;
import com.greeengy.servhang.model.words.WordsDao;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class ServhangApplicationTests {
    @Autowired
    private WordsDao wordsDao;



    // @Test
    void addWordsTest() {
        Words words = new Words();
        words.setWord("схемотехника");
        wordsDao.save(words);
    }
}
