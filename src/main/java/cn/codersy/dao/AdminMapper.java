package cn.codersy.dao;

import cn.codersy.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员DAO层接口
 */

public interface AdminMapper {
    // 通过账号和密码查询管理员
    Admin findAdmin(Admin admin);

    // 分页查询符合条件的记录总数
    Integer totalCount(@Param("a_username") String a_username,
                       @Param("a_describe") String a_describe,
                       @Param("a_id") Integer a_id);
    // 分页查询获取管理员列表
    List<Admin> getAdminList(@Param("a_username") String a_username,
                             @Param("a_describe") String a_describe,
                             @Param("a_id") Integer a_id,
                             @Param("startIndex") Integer startIndex,
                             @Param("pageSize") Integer pageSize);

    // 添加管理员
    int addAdmin(Admin admin);

    // 根据id删除管理员
    int deleteAdminById(@Param("a_id") Integer a_id);

    // 修改管理员信息
    int updateAdmin(Admin admin);

    // 根据id查找管理员
    Admin findAdminById(@Param("a_id") Integer a_id);

    // 获取所有管理员信息（不分页）
    List<Admin> getAllAdmin();
}
