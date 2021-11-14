package cn.edu.sdust.service.impl;

import cn.edu.sdust.pojo.Student;
import cn.edu.sdust.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private StudentService studentService;

    public void setBookMapper(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public int addStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentById(int id) {
        return 0;
    }

    @Override
    public Student queryStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> queryAllStudent() {
        return null;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

}
