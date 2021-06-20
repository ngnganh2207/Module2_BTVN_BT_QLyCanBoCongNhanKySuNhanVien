package quanlycanbo;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Manage {
    static Scanner scanner= new Scanner(System.in);
    static CanBo[] arrCB= new CanBo[0];
    static void themNhanVien(String name, String yearOfBirth, String gender, String address){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        NhanVien nhanVien= new NhanVien(name,yearOfBirth,gender,address);
        for(int i=0;i< arrCB.length;i++){
            canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]= nhanVien;
        arrCB=canBoNew;
    }
    static void themCongNhan(String name, String yearOfBirth, String gender, String address, String level, String major){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        CongNhan congNhan= new CongNhan(name,yearOfBirth,gender,address,level,major);
        for(int i=0;i< arrCB.length;i++){
           canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]= congNhan;
        arrCB=canBoNew;
    }
    static void themKySu(String name, String yearOfBirth, String gender, String address, String major){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        KySu kySu= new KySu(name,yearOfBirth,gender,address,major);
        for(int i=0;i< arrCB.length;i++){
            canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]=kySu;
        arrCB=canBoNew;
    }
    static void show(){
        for(CanBo element: arrCB){
            System.out.println(element);
        }
    }
    static void find(String name){
        for(CanBo cb: arrCB){
            if(cb.getName().equals(name)){
                System.out.println(cb);
                return;
            }
        }
    }
    static void delete(String name){
        if(arrCB.length>0) {
            CanBo[] canBoNew = new CanBo[arrCB.length - 1];
            int index= -1;
            for(int i=0; i<arrCB.length; i++){
                if(arrCB[i].getName().equals(name)){
                    index=i;
                    break;
                }
            }
            for (int j=0;j<index;j++){
                canBoNew[j]=arrCB[j];
            }
            for(int k=index;k< canBoNew.length;k++){
                canBoNew[k]= arrCB[k+1];
            }
            arrCB=canBoNew;
        }
    }
    static void Edit(String name){

        for(int i=0;i< arrCB.length;i++){
            if(arrCB[i].getName().equals(name)){
                if(arrCB[i] instanceof NhanVien){
                    System.out.println("Nhập Address");
                    String address= scanner.nextLine();
                    System.out.println("Nhập yearOfBirth");
                    String yearOfBirth= scanner.nextLine();
                    System.out.println("Nhập gender");
                    String gender= scanner.nextLine();
                    ( (NhanVien) arrCB[i]).setAddress(address);
                    ( (NhanVien) arrCB[i]).setGender(gender);
                    ( (NhanVien) arrCB[i]).setYearOfBirth(yearOfBirth);
                }else if(arrCB[i] instanceof CongNhan){
                    System.out.println("Nhập Address");
                    String addressCN= scanner.nextLine();
                    System.out.println("Nhập yearOfBirth");
                    String yearOfBirthCN= scanner.nextLine();
                    System.out.println("Nhập gender");
                    String genderCn= scanner.nextLine();
                    System.out.println("Nhập level");
                    String levelCN= scanner.nextLine();
                    System.out.println("Nhập major");
                    String majorCN= scanner.nextLine();
                    ((CongNhan) arrCB[i]).setMajor(majorCN);
                    ((CongNhan) arrCB[i]).setLevel(levelCN);
                    ((CongNhan) arrCB[i]).setAddress(addressCN);
                    ((CongNhan) arrCB[i]).setYearOfBirth(yearOfBirthCN);
                    ((CongNhan) arrCB[i]).setGender(genderCn);
                }else if(arrCB[i] instanceof KySu){
                    System.out.println("Nhập Address");
                    String addressKs= scanner.nextLine();
                    System.out.println("Nhập yearOfBirth");
                    String yearOfBirthKs= scanner.nextLine();
                    System.out.println("Nhập gender");
                    String genderKs= scanner.nextLine();
                    System.out.println("Nhập major");
                    String majorKs= scanner.nextLine();
                    ((KySu) arrCB[i]).setMajor(majorKs);
                    ((KySu) arrCB[i]).setAddress(addressKs);
                    ((KySu) arrCB[i]).setYearOfBirth(yearOfBirthKs);
                    ((KySu) arrCB[i]).setGender(genderKs);
                }
            }else{
                System.out.println("k có tên này trong ds");
            }
        }
    }
    static void sort(){ Arrays.sort(arrCB);}
    static void findMajor(String major){
        for(CanBo cb: arrCB){
            if(cb instanceof KySu && (((KySu) cb).getMajor().equals(major))){
                System.out.println(cb);
            }
            if(cb instanceof CongNhan && (((CongNhan) cb).getMajor().equals(major))){
                System.out.println(cb);
            }
        }
    }
}
