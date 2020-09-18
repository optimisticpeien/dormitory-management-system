package cn.codersy.dao;

import cn.codersy.pojo.DormitoryClean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormCleanMapper {
    Integer totalCount(@Param("d_id") Integer d_id,
                       @Param("d_dormbuilding") String d_dormbuilding,
                       @Param("d_grade") Integer d_grade);

    List<DormitoryClean> getDormCleanList(@Param("d_id") Integer d_id,
                                          @Param("d_dormbuilding") String d_dormbuilding,
                                          @Param("d_grade") Integer d_grade,
                                          @Param("startIndex") Integer startIndex,
                                          @Param("pageSize") Integer pageSize);

    int addDormClean(DormitoryClean dormitoryClean);

    int deleteDormCleanById(@Param("g_id") Integer g_id);

    int updateDormClean(DormitoryClean dormitoryClean);

    DormitoryClean findDormCleanById(@Param("g_id") Integer g_id);

    List<DormitoryClean> getAllDormClean();
}
