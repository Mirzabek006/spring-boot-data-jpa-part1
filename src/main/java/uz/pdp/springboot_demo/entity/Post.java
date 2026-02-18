package uz.pdp.springboot_demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "posts")
@NamedQuery(name = "Post.getAllPosts", query = "select p from Post p")
/// Named native query orqali postgresqlda kiritib ya'ni postman orqali response javobni qaytaradi

@NamedNativeQuery(name = "Post.getAllPostsNative", query = "select*from posts", resultClass = Post.class)

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;

    private String title;
    private String body;


}
