package entity;

public class Tb_courseId {
    private int pk_courseId_id;
    private String course_id;
    private String course_code;
    private String course_term;

    public int getPk_courseId_id() {
        return pk_courseId_id;
    }

    public void setPk_courseId_id(int pk_courseId_id) {
        this.pk_courseId_id = pk_courseId_id;
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