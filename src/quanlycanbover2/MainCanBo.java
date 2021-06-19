//package quanlycanbover2;
//
//import quanlycanbo.CanBo;
//import quanlycanbo.Manage;
//
//import java.util.Scanner;
//
//public class MainCanBo {
//    quanlycanbo.CanBo[] arrCB= new quanlycanbo.CanBo[0];
//    public static void main(String[] args) {
//        quanlycanbo.CanBo[] arrCB= new quanlycanbo.CanBo[0];
//        Scanner scanner= new Scanner(System.in);
//        do{
//            System.out.println("Menu");
//            System.out.println("0. Exit");
//            System.out.println("1. Thêm cán bộ");
//            System.out.println("5. Hiển thị thông tin cán bộ");
//            int choice= Integer.parseInt(scanner.nextLine());
//            switch(choice){
//                case 0: System.exit(0);
//                case 1:
//                    quanlycanbo.Manage manage= new Manage();
//                    System.out.println("Menu chọn loại nhân viên muốn thêm");
//                    System.out.println("1. Thêm Nhân Viên");
//                    System.out.println("2. Thêm Công Nhân");
//                    System.out.println("3. Thêm Kỹ Sư");
//                    int choice1= Integer.parseInt(scanner.nextLine());
//                    switch (choice1){
//                        case 1:
//                            System.out.println("Nhập name");
//                            String name1= scanner.nextLine();
//                            System.out.println("Nhập năm sinh");
//                            String yearOfBirth1= scanner.nextLine();
//                            System.out.println("Nhập giới tính");
//                            String gender1= scanner.nextLine();
//                            System.out.println("Nhập địa chỉ");
//                            String address1= scanner.nextLine();
//                            manage.themNhanVien(arrCB,name1,yearOfBirth1,gender1,address1);
//                            break;
//                        case 2:
//                            System.out.println("Nhập name");
//                            String name2= scanner.nextLine();
//                            System.out.println("Nhập năm sinh");
//                            String yearOfBirth2= scanner.nextLine();
//                            System.out.println("Nhập giới tính");
//                            String gender2= scanner.nextLine();
//                            System.out.println("Nhập địa chỉ");
//                            String address2= scanner.nextLine();
//                            System.out.println("Nhập level/ cấp bậc");
//                            String level2= scanner.nextLine();
//                            System.out.println("Nhập major/ ngành");
//                            String major2= scanner.nextLine();
//                            manage.themCongNhan(arrCB,name2,yearOfBirth2,gender2,address2,level2,major2);
//                            break;
//                        case 3:
//                            System.out.println("Nhập name");
//                            String name3= scanner.nextLine();
//                            System.out.println("Nhập năm sinh");
//                            String yearOfBirth3= scanner.nextLine();
//                            System.out.println("Nhập giới tính");
//                            String gender3= scanner.nextLine();
//                            System.out.println("Nhập địa chỉ");
//                            String address3= scanner.nextLine();
//                            System.out.println("Nhập major/ ngành");
//                            String major3= scanner.nextLine();
//                            manage.themKySu(arrCB,name3,yearOfBirth3,gender3,address3,major3);
//                            break;
//                        default:
//                            break;
//                    }
//                case 5:
//                    for(CanBo element: arrCB){
//                        System.out.println(element);
//                    }
//                    break;
//            }
//
//        }while(true);
//    }
//}
