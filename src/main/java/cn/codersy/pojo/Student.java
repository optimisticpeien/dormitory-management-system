package cn.codersy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer s_id;
    private Integer s_studentid;
    private String s_name;
    private String s_sex;
    private Integer s_age;
    private Integer s_phone;
    private Integer s_classid;
    private String s_classname;
    private Integer s_dormitoryid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
