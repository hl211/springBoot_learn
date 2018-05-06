package com.hl.mapper;

import com.hl.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> findByName(@Param("name") String name);
//      @Select("SELECT * FROM USER WHERE NAME = #{name}")
//      List<User> findByName(@Param("name") String name);
//
//     @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
//     int insert(@Param("name") String name, @Param("age") Integer age);

}
