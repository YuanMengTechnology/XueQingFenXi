package Entity;

/*培养方案表*/
public class train_plan {
    private int train_plan_id;
    private int major_id;//适用专业fk
    private int grade;//适用年级

    public int getTrain_plan_id() {
        return train_plan_id;
    }

    public void setTrain_plan_id(int train_plan_id) {
        this.train_plan_id = train_plan_id;
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
