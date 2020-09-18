package cn.codersy.dao;

import cn.codersy.pojo.DormitoryRepair;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormRepairMapper {
    Integer totalCount(@Param("d_id") Integer d_id,
                       @Param("d_dormbuilding") String d_dormbuilding);

    //获取用户列表
    List<DormitoryRepair> getDormRepairList(@Param("d_id") Integer d_id,
                                            @Param("d_dormbuilding") String d_dormbuilding,
                                            @Param("startIndex") Integer startIndex,
                                            @Param("pageSize") Integer pageSize);

    int addDormRepair(DormitoryRepair dormitoryRepair);    //添加宿舍信息

    int deleteDormRepairById(@Param("r_id") Integer r_id);   //删除宿舍信息

    int updateDormRepair(DormitoryRepair dormitoryRepair); //修改宿舍信息

    DormitoryRepair findDormRepairById(@Param("r_id") Integer r_id);

    List<DormitoryRepair> getAllDormRepair();
}
