package com.yuanmeng.xueqingfenxi.Entity;

/*课号表*/
public class Tb_courseId {
    private int courseId_id;
    private String course_id;//课号
    private String course_code;//课程代码fk
    private String course_term;

    public int getCourseId_id() {
        return courseId_id;
    }

    public void setCourseId_id(int courseId_id) {
        this.courseId_id = courseId_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_term() {
        return course_term;
    }

    public void setCourse_term(String course_term) {
        this.course_term = course_term;
    }
}
