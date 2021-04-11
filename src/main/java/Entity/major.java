package Entity;

/*专业表*/
public class major {
    private int major_id;
    private String major_name;//专业名称

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        if (major_name.length()>20){
            this.major_name=major_name.substring(0,20);//VARCHAR(20)
            return;
        }
        this.major_name = major_name;
    }
}
