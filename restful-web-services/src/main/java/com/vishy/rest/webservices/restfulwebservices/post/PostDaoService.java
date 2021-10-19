package com.vishy.rest.webservices.restfulwebservices.post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostDaoService {
    static List<Post> posts = new ArrayList<>();


    private static int postsCount = 8;

    static {
        posts.add(new Post(11,1,"HTML","Hyper Text Markup language"));
        posts.add(new Post(12,1,"CSS","Cascading Style Sheets"));
        posts.add(new Post(21,2,"Java","Machine independent language"));
        posts.add(new Post(22,2,"JRE","Java Runtime Environment"));
        posts.add(new Post(23,2,"JDK","Java Development kit"));
        posts.add(new Post(31,3,"Javascript","Water,Tide and Javascript wont wait"));
        posts.add(new Post(32,3,"React JS","I have a little bit of experience in ReactJs"));
        posts.add(new Post(33,3,"Angular JS","I worked on Angular JS but not fully on"));
    }

    public List<Post> findAll(){
        return posts;
    }

    public Post save(Post post){
        if(post.getId() == null)
        {
            post.setId(++postsCount);
        }
        posts.add(post);
        return post;
    }

    public Post findOne(int id){
        for(Post post:posts){
            if(post.getId() == id){
                return post;
            }
        }
        return null;
    }

    public List<Post> findByUsers(int user_id){
        List<Post> user_posts = new ArrayList<>();
        for(Post post:posts){
            if(post.getUser_id() == user_id){
                user_posts.add(post);
            }
        }
        if(user_posts.size()>=0)
            return user_posts;
        return null;
    }
}
