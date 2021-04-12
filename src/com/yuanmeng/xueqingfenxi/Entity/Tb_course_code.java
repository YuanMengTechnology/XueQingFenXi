package com.yuanmeng.xueqingfenxi.Entity;

import java.math.BigDecimal;

/*课程代码表*/
public class Tb_course_code {
    private int course_code_id;
    private String course_code;//课程代码
    private String course_name;//课程名称
    private BigDecimal credit;
    private String course_type;//课程性质
    private String test_way;//考核方式

    public int getCourse_code_id() {
        return course_code_id;
    }

    public void setCourse_code_id(int course_code_id) {
        this.course_code_id = course_code_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getTest_way() {
        return test_way;
    }

    public void setTest_way(String test_way) {
        this.test_way = test_way;
    }
}
