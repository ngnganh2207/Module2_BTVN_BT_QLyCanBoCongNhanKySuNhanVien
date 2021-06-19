package quanlycanbover2;

public class KySu extends CanBo {
    private String major;

    public KySu() {
    }

    public KySu(String name, String yearOfBirth, String gender, String address, String major) {
        super(name, yearOfBirth, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return " Thông tin Kỹ Sư {" +
                "major='" + major + '\'' + super.toString()+
                '}';
    }
}
