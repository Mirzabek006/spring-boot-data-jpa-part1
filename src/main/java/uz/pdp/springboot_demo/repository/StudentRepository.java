package uz.pdp.springboot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.springboot_demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
