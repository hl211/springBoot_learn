package com.hl.mapper;

import com.hl.pojo.StudentEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface StudentDao extends JpaRepository<StudentEntity, Integer> {


    List<StudentEntity> findAll();
    List<StudentEntity> findAll(Specification<StudentEntity> spc, Pageable pageable);
    /**
     * 根据年龄查询学生
     *
     * @param age
     * @return
     */
    List<StudentEntity> findStudentByAge(Integer age);

    /**
     * 根据年龄获取学生信息 <br>
     *
     * <@Query是用来配置自定义SQL的注解,后面参数nativeQuery =
     * true才是表明了使用原生的sql,如果不配置,默认是false,则使用HQL查询方式。>
     *
     * @param age
     * @return
     */
    @Query(value = "select id,name,age from student where age = ?1", nativeQuery = true)
    List<StudentEntity> getStudentByAge(Integer age);

}