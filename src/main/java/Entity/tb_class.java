package Entity;

import java.text.DecimalFormat;

public class tb_class {
    private int id;
    private String class_id;
    private int grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        if (class_id.length()>20){
            this.class_id=class_id.substring(0,20);
            return;
        }
        this.class_id = class_id;
    }

    public void setClass_id(int class_id) {
        if ((class_id+"").length()>20){
            this.class_id =(class_id+"").substring(0,20);
            return;
        }
        this.class_id =class_id+"";
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
