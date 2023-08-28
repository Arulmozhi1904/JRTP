package com.skillssearch.demo.Controller;
import com.skillssearch.demo.entity.Post;
import com.skillssearch.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return postRepository.save(post);
    }
}
