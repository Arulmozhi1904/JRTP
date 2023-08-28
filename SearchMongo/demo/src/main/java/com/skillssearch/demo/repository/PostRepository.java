package com.skillssearch.demo.repository;

import com.skillssearch.demo.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post,String> {

}
