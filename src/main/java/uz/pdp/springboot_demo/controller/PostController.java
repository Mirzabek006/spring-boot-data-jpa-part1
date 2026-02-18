package uz.pdp.springboot_demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springboot_demo.entity.Post;
import uz.pdp.springboot_demo.repository.PostRepository;
import uz.pdp.springboot_demo.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postReository;
    private final PostService postService;

    @GetMapping("/getAllPosts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("findByUserId/{userId}")
    public List<Post> findPostsByUserId(Integer userId) {
        return postService.getPostsByUserId(userId);
    }
}
