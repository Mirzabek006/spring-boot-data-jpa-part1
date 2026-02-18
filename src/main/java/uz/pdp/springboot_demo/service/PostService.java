package uz.pdp.springboot_demo.service;

import uz.pdp.springboot_demo.entity.Post;

import java.util.List;

public interface PostService {


    List<Post> getAllPosts();

    List<Post> findPostsByUserId(Integer userId);

    List<Post> getPostsByUserId(Integer userId);
}
