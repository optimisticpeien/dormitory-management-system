package cn.codersy.dao;

import cn.codersy.pojo.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VisitorMapper {
    Integer totalCount(@Param("v_name") String v_name,
                       @Param("v_phone") Integer v_phone,
                       @Param("v_dormitoryid") Integer v_dormitoryid,
                       @Param("v_dormbuilding") String v_dormbuilding);

    List<Visitor> getVisitorList(@Param("v_name") String v_name,
                                 @Param("v_phone") Integer v_phone,
                                 @Param("v_dormitoryid") Integer v_dormitoryid,
                                 @Param("v_dormbuilding") String v_dormbuilding,
                                 @Param("startIndex") Integer startIndex,
                                 @Param("pageSize") Integer pageSize);

    int addVisitor(Visitor visitor);

    List<Visitor> getAllVisitor();
}
