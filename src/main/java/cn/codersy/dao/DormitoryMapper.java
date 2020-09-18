package cn.codersy.dao;

import cn.codersy.pojo.Dormitory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 宿舍实体类DAO层接口
 */

public interface DormitoryMapper {
    // 分页查询符合条件的记录总数
    Integer totalCount(@Param("s_dormitoryid") Integer s_dormitoryid,
                       @Param("d_dormbuilding") String d_dormbuilding,
                       @Param("a_name") String a_name);

    // 分页查询获取宿舍列表
    List<Dormitory> getDormitoryList(@Param("s_dormitoryid") Integer s_dormitoryid,
                                     @Param("d_dormbuilding") String d_dormbuilding,
                                     @Param("a_name") String a_name,
                                     @Param("startIndex") Integer startIndex,
                                     @Param("pageSize") Integer pageSize);

    // 根据id查找宿舍
    Dormitory findDormitoryById(@Param("d_id") Integer d_id);

    // 增加宿舍
    int addDormitory(Dormitory dormitory);

    // 根据id删除宿舍
    int deleteDormitoryById(@Param("d_id") Integer d_id);

    // 更新宿舍信息
    int updateDormitory(Dormitory dormitory);

    // 查询宿舍内人员信息（一对多）
    List<Dormitory> findDormitoryStudent(Dormitory dormitory);

    // 查询全部宿舍信息
    List<Dormitory> getAllDormitory();
}
