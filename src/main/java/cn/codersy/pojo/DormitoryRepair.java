package cn.codersy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 宿舍维修登记实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DormitoryRepair {
    private int r_id;
    private int d_id;
    private int d_dormbuilding;
    private String r_name;
    private String reason;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date update_time;
}
