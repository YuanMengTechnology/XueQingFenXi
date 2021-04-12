package entity;

public class Tb_course_code {
    private int pk_course_code_id;
    private String course_code;
    private String course_name;
    private int credit;
    private String course_type;
    private String test_way;

    public int getPk_course_code_id() {
        return pk_course_code_id;
    }

    public void setPk_course_code_id(int pk_course_code_id) {
        this.pk_course_code_id = pk_course_code_id;
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
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
