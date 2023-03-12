package com.geekster.post.service;

import com.geekster.post.model.Post;
import com.geekster.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    public PostRepository postRepository;
    public void addPost(Post newPost){
        postRepository.save(newPost);
    }
    public List<Post> getPost(){
        return postRepository.findAll();
    }
}
