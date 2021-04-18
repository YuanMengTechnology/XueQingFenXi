package javaBean;

import java.util.List;

public class Student {
    private int pk_student_id;
    private String stu_id;
    private String stu_name;
    private int major_id;
    private String class_id;
    private Classes classes;
    private List<CourseId> courseIds;
    private Major major;
    private List<Score> scores;

    public int getPk_student_id() {
        return pk_student_id;
    }

    public void setPk_student_id(int pk_student_id) {
        this.pk_student_id = pk_student_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }
}
