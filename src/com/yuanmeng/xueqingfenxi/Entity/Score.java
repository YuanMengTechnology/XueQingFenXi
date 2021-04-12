package com.yuanmeng.xueqingfenxi.Entity;

/*成绩表*/
public class Score {
    private int score_id;
    private String stu_id;//对应学生学号fk
    private String course_id;//对应课号fk
    private String score;//成绩
    private String test_type;
    private String grade_type;

    public int getScore_id() {
        return score_id;
    }

    public void setScore_id(int score_id) {
        this.score_id = score_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public String getGrade_type() {
        return grade_type;
    }

    public void setGrade_type(String grade_type) {
        this.grade_type = grade_type;
    }
}
