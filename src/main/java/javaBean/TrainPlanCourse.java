package javaBean;

import java.util.List;

public class TrainPlanCourse {
    private int plan_id;
    private String course_code;
    private String tp_term;
    private List<TrainPlan> trainPlans;

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
