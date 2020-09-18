package cn.codersy.dao;

import cn.codersy.pojo.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班级类DAO层接口
 */

public interface ClassMapper {
    // 分页查询符合条件的记录总数
    Integer totalCount(@Param("c_classid") Integer c_classid,
                       @Param("c_classname") String c_classname,
                       @Param("c_counsellor") String c_counsellor);

    // 分页查询获取班级列表
    List<Class> getClassList(@Param("c_classid") Integer c_classid,
                             @Param("c_classname") String c_classname,
                             @Param("c_counsellor") String c_counsellor,
                             @Param("startIndex") Integer startIndex,
                             @Param("pageSize") Integer pageSize);

    // 增加班级
    int addClass(Class newClass);

    // 根据id删除班级
    int deleteClassById(@Param("c_id") Integer c_id);

    // 修改班级信息
    int updateClass(Class newClass);

    // 根据id查找班级
    Class findClassById(@Param("c_id") Integer c_id);

    // 获取所有班级信息（不分页）
    List<Class> getAllClass();

    // 获取班级学生信息
    List<Class> findClassStudent(Class myclass);
}
