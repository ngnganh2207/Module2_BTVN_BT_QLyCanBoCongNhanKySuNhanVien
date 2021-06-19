package quanlycanbo;

public class CanBo {
    private String name;
    private String yearOfBirth;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String yearOfBirth, String gender, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " Thông tin Cán Bộ { " +
                "name='" + name + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
