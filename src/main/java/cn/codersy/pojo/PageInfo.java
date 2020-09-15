package cn.codersy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo<T> implements Serializable {
    // 页码
    private Integer pageIndex = 1;
    // 每页显示条数，默认为5条
    private Integer pageSize = 5;
    // 总条数
    private Integer totalCount = 0;
    // 总页数
    private Integer pageTotalCount = 0;
    // 每页显示的数据集合
    private List<T> list = new ArrayList<T>();

    // 设置页面大小
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (pageSize == null || pageSize < 1) {
            this.pageSize = 5;
        }
    }

    // 计算总页数
    public Integer getPageTotalCount() {
        this.pageTotalCount = totalCount / pageSize;
        if (totalCount % pageSize != 0) {
            this.pageTotalCount++;
        }
        return pageTotalCount;
    }
}
