package com.greeengy.servhang.model.words;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsRepository extends CrudRepository<Words, Integer> {

}