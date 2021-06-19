package quanlycanbover2;

import quanlycanbo.CanBo;
import quanlycanbo.CongNhan;
import quanlycanbo.KySu;
import quanlycanbo.NhanVien;

public class Manage {
    void themNhanVien(CanBo[] arrCB,String name, String yearOfBirth, String gender, String address){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        NhanVien nhanVien= new NhanVien(name,yearOfBirth,gender,address);
        for(int i=0;i< arrCB.length;i++){
            canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]= nhanVien;
        arrCB=canBoNew;
    }
    void themCongNhan(CanBo[] arrCB,String name, String yearOfBirth, String gender, String address, String level, String major){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        CongNhan congNhan= new CongNhan(name,yearOfBirth,gender,address,level,major);
        for(int i=0;i< arrCB.length;i++){
            canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]= congNhan;
        arrCB=canBoNew;
    }
    void themKySu(CanBo[] arrCB,String name, String yearOfBirth, String gender, String address, String major){
        CanBo[] canBoNew= new CanBo[arrCB.length+1];
        KySu kySu= new KySu(name,yearOfBirth,gender,address,major);
        for(int i=0;i< arrCB.length;i++){
            canBoNew[i]= arrCB[i];
        }
        canBoNew[canBoNew.length-1]=kySu;
        arrCB=canBoNew;
    }
}
