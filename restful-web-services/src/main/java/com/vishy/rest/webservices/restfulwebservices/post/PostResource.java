package com.vishy.rest.webservices.restfulwebservices.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostResource {

    @Autowired
    private PostDaoService postDaoService;

    @GetMapping(path = "/posts")
    public List<Post> retrieveAllPosts(){
        return postDaoService.findAll();
    }

    @GetMapping(path = "/posts/{id}")
    public Post retrievePost(@PathVariable int id){
        Post post = postDaoService.findOne(id);
        if(post == null)
            throw new PostNotFoundException("id-"+id);
        return post;
    }

    @GetMapping(path = "users/{user_id}/posts")
    public List<Post> retrieveUserPost(@PathVariable int user_id){
        List<Post> post = new ArrayList<>();
        post = postDaoService.findByUsers(user_id);
        if(post.size() <= 0)
            throw new PostNotFoundException("user_id-"+user_id);
        return post;

    }
}
