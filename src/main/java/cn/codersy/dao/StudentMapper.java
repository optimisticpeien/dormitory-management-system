package cn.codersy.dao;

import cn.codersy.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    Integer totalCount(@Param("s_studentid") Integer s_studentid,
                       @Param("s_name") String s_name,
                       @Param("s_sex") String s_sex,
                       @Param("s_age") Integer s_age,
                       @Param("s_phone") Integer s_phone,
                       @Param("s_classid") Integer s_classid,
                       @Param("s_classname") String s_classname,
                       @Param("s_dormitoryid") Integer s_dormitoryid);

    List<Student> getStudentList(@Param("s_studentid") Integer s_studentid,
                                 @Param("s_name") String s_name,
                                 @Param("s_sex") String s_sex,
                                 @Param("s_age") Integer s_age,
                                 @Param("s_phone") Integer s_phone,
                                 @Param("s_classid") Integer s_classid,
                                 @Param("s_classname") String s_classname,
                                 @Param("s_dormitoryid") Integer s_dormitoryid,
                                 @Param("startIndex") Integer startIndex,
                                 @Param("pageSize") Integer pageSize);

    int addStudent(Student student);

    int deleteStudentById(@Param("s_id") Integer s_id);

    int updateStudent(Student student);

    Student findStudentById(@Param("s_id") Integer s_id);

    List<Student> getAllStudent();
}
