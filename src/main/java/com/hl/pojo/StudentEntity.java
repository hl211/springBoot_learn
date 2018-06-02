package com.hl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
public class StudentEntity implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3967265553147264980L;

    /**
     * 学生id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生年龄
     */
    private Integer age;
}