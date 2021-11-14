package cn.edu.sdust.dao;

import cn.edu.sdust.pojo.Student;

import java.util.List;

public interface StudentDao {

    //增加一个学生
    int addStudent(Student student);
    //根据学号删除一个学生
    int deleteStudentById(int id);
    //通过学号查询学生
    Student queryStudentById(int id);
    //查询所有学生
    List<Student> queryAllStudent();
    //更改学生信息
    int updateStudent(Student student, int id);

}
