package quanlycanbover2;

public class CongNhan extends CanBo{
    private String level;
    private String major;

    public CongNhan() {
    }

    public CongNhan(String name, String yearOfBirth, String gender, String address, String level, String major) {
        super(name, yearOfBirth, gender, address);
        this.level = level;
        this.major = major;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return " Thông Tin Công Nhân {" +
                "level='" + level + '\'' +
                ", major='" + major + '\'' + super.toString()+
                '}';
    }
}
