package quanlycanbo;
/*Vậy là cuối tuần cũng đến mọi người lại có quà cuối tuần này nhé.
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.Hãy viết chương trình quản lý cho đơn vị đó.
+ Mỗi cán bộ có các thuộc tính: Họ tên, năm sinh, giới tính, địa chỉ
+ Mỗi công nhân có các thuộc tính: Bậc (công nhân bậc 3/7, bậc 4/7 …),Ngành
+ kỹ sư có các thuộc tính: Ngành.
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các thuộc tính của các lớp.
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
 1. Thêm cán bộ => 1. Thêm nhân viên
                   2. thêm công nhân.
                   3. thêm kỹ sư.
 2. Tìm kiếm theo họ tên
 3. Xoá nhân viên theo tên.
 4. Edit nhân viên theo tên.
 5. Hiển thị thông tin về danh sách các cán bộ
 6. Sắp xếp nhân viên theo tên.
 7. tìm kiếm toàn bộ cán bộ theo ngành(cả nhân viên và kỹ sư)
 8. Thoát khỏi chương trình.
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainCanBo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("0. Exit");//ok
            System.out.println("1. Thêm cán bộ");//ok
            System.out.println("2. Tìm kiếm theo họ tên");//ok
            System.out.println("3. Xóa nhân viên theo tên");//ok
            System.out.println("4. Edit nhân viên theo tên");//ok
            System.out.println("5. Hiển thị thông tin cán bộ");//ok
            System.out.println("6. Sắp xếp nhân viên theo tên");// ok
            System.out.println("7. Tìm kiếm cán bộ theo ngành");// Chưa làm dc, đang bị lỗi
            int choice= Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Menu chọn loại nhân viên muốn thêm");
                    System.out.println("1. Thêm Nhân Viên");
                    System.out.println("2. Thêm Công Nhân");
                    System.out.println("3. Thêm Kỹ Sư");
                    int choice1= Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1:
                            System.out.println("Nhập name");
                            String name1= scanner.nextLine();
                            System.out.println("Nhập năm sinh");
                            String yearOfBirth1= scanner.nextLine();
                            System.out.println("Nhập giới tính");
                            String gender1= scanner.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String address1= scanner.nextLine();
                            Manage.themNhanVien(name1,yearOfBirth1,gender1,address1);
                            break;
                        case 2:
                            System.out.println("Nhập name");
                            String name2= scanner.nextLine();
                            System.out.println("Nhập năm sinh");
                            String yearOfBirth2= scanner.nextLine();
                            System.out.println("Nhập giới tính");
                            String gender2= scanner.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String address2= scanner.nextLine();
                            System.out.println("Nhập level/ cấp bậc");
                            String level2= scanner.nextLine();
                            System.out.println("Nhập major/ ngành");
                            String major2= scanner.nextLine();
                            Manage.themCongNhan(name2,yearOfBirth2,gender2,address2,level2,major2);
                            break;
                        case 3:
                            System.out.println("Nhập name");
                            String name3= scanner.nextLine();
                            System.out.println("Nhập năm sinh");
                            String yearOfBirth3= scanner.nextLine();
                            System.out.println("Nhập giới tính");
                            String gender3= scanner.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String address3= scanner.nextLine();
                            System.out.println("Nhập major/ ngành");
                            String major3= scanner.nextLine();
                            Manage.themKySu(name3,yearOfBirth3,gender3,address3,major3);
                            break;
                        default:
                            System.out.println("Nằm ngoài menu");
                            break;
                    }
                    break;
                case 5:
                   Manage.show();
                   break;
                case 2:
                    System.out.println("Nhập name tìm kiếm");
                    String name2= scanner.nextLine();
                    Manage.find(name2);
                    break;
                case 3:
                    System.out.println("Nhập tên cần xóa");
                    String name3= scanner.nextLine();
                    Manage.delete(name3);
                    break;
                case 4:
                    System.out.println("Nhập tên cần edit");
                    String name4= scanner.nextLine();
                    Manage.Edit(name4);
                    break;
                case 6:
                    Manage.sort();
                    break;
                case 7:
                    System.out.println(" Nhập ngành cần tìm kiếm");
                    String major= scanner.nextLine();
                    Manage.findMajor(major);
                    break;
            }
        }while(true);
    }
}
