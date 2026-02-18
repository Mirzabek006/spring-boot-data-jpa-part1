package uz.pdp.springboot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.pdp.springboot_demo.entity.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    /// 1 yaratganim bu JPQL query hisoblanadi
    /// /@Query("select p from Post p")
    //Men hozir native query yarataman.Bunisi nativequery tasdiqlash uchun
//@Query(
//        nativeQuery = true, value = "select*from posts"
//)

//3 Zadaniyada Post ENTITY ichida yaratib berish yani query orqali bajaraladi
    @Query(name = "Post.getAllPosts")
    /// named query
    List<Post> getAllPosts();
    @Query("select p from Post  p where p.userId=?1") //JPQL
    List<Post> getPostsByUserId(Integer userId);

}
