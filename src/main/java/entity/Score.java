package entity;

public class Score {
    private int pk_score_id;
    private String stu_id;
    private String course_id;
    private String score;
    private String test_type;
    private String grade_type;

    public int getPk_score_id() {
        return pk_score_id;
    }

    public void setPk_score_id(int pk_score_id) {
        this.pk_score_id = pk_score_id;
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
