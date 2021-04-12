package com.yuanmeng.xueqingfenxi.Entity;

/*培养方案课程表*/
public class Train_plan_course {
    private int plan_id;//pk,fk
    private String course_code;//课程代码fk
    private String tp_term;

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getTp_term() {
        return tp_term;
    }

    public void setTp_term(String tp_term) {
        this.tp_term = tp_term;
    }
}
