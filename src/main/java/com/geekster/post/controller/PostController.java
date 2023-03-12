package com.geekster.post.controller;

import com.geekster.post.model.Post;
import com.geekster.post.service.PostService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {
    @Autowired
    public PostService postService;
    @PostMapping("/add-post")
    public ResponseEntity<String> addPost(@RequestBody String newPost){
        Post member = setPost(newPost);
        postService.addPost(member);
        return new ResponseEntity<>("Post Created", HttpStatus.CREATED);
    }

    private Post setPost(String newPost) {
        JSONObject jsonObj = new JSONObject(newPost);
        Post post = new Post();
        post.setTitle(jsonObj.getString("title"));
        post.setDescription(jsonObj.getString("description"));
        return post;
    }
    @GetMapping("/get-post")
    public List<Post> getPost(){
        return postService.getPost();
    }

}
