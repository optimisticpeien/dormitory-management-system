package cn.codersy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 班级实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    private Integer c_id;
    private Integer c_classid;
    private String c_classname;
    // 负责人
    private String c_counsellor;
    // 班级与学生一对多关系
    private List<Student> students;
}
