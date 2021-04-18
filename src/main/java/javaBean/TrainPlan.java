package javaBean;


import java.util.List;

public class TrainPlan {
    private int pk_train_plan_id;
    private int major_id;
    private int grade;
    private Major major;
    private List<TrainPlanCourse> trainPlanCourses;

    public int getPk_train_plan_id() {
        return pk_train_plan_id;
    }

    public void setPk_train_plan_id(int pk_train_plan_id) {
        this.pk_train_plan_id = pk_train_plan_id;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
