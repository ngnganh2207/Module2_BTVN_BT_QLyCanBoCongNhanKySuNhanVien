package quanlycanbover2;

public class NhanVien extends CanBo{
    public NhanVien() {
    }

    public NhanVien(String name, String yearOfBirth, String gender, String address) {
        super(name, yearOfBirth, gender, address);
    }

    @Override
    public String toString() {
        return "Thông tin Nhân Viên là {" +super.toString()+ "}";
    }
}
