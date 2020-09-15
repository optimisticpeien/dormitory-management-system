package cn.codersy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 宿舍实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dormitory implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer d_id;
    private Integer d_dormitoryid;
    private Integer d_dormbuilding;
    private String d_bedtotal;
    private String d_bed;
    private String a_name;
    // 一个宿舍住多个学生
    private List<Student> students;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
