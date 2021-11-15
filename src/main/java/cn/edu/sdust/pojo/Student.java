package cn.edu.sdust.pojo;

import java.util.Date;

public class Student {

    private Integer id;
    private String stuId;
    private String name;
    private String pinyin;
    private String sex;
    private Date birthday;
    private String qq;
    private String phone;
    private String email;

    public Student(Integer id, String stuId, String name, String pinyin, String sex, Date birthday, String qq, String phone, String email) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.pinyin = pinyin;
        this.sex = sex;
        this.birthday = birthday;
        this.qq = qq;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
