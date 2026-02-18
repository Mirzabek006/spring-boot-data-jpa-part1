package uz.pdp.springboot_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.springboot_demo.entity.Post;
import uz.pdp.springboot_demo.repository.PostRepository;
import uz.pdp.springboot_demo.service.PostService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postReository;
    private final PostService postService;

    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @Override
    public List<Post> findPostsByUserId(Integer userId) {
        return postService.getPostsByUserId(userId);
    }

    @Override
    public List<Post> getPostsByUserId(Integer userId) {
        return postService.getPostsByUserId(userId);
    }
}
