package cn.codersy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 宿舍卫生实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DormitoryClean {
    private Integer g_id;
    private Integer d_id;
    private String  d_dormbuilding;
    private Integer d_grade;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
}
