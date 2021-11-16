package model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author conghau
 */
public class ChuyenBay {

    private String maChuyenBay;
    private String maMayBay;
    private String maSanBayDi;
    private String maSanBayDen;
    private Date ngayBay;
    private Time gioBay;
    private String ghiChu;
    private int khoangCach;
    private ArrayList<Ghe> arrayListGhe = new ArrayList<Ghe>();

    public ChuyenBay() {
    }

    public ChuyenBay(String maChuyenBay, String maMayBay, String maSanBayDi, String maSanBayDen, Date ngayBay, Time gioBay, String ghiChu, int khoangCach) {
        this.maChuyenBay = maChuyenBay;
        this.maMayBay = maMayBay;
        this.maSanBayDi = maSanBayDi;
        this.maSanBayDen = maSanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.ghiChu = ghiChu;
        this.khoangCach = khoangCach;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public String getMaSanBayDi() {
        return maSanBayDi;
    }

    public String getMaSanBayDen() {
        return maSanBayDen;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public Time getGioBay() {
        return gioBay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public int getKhoangCach() {
        return khoangCach;
    }

    public ArrayList<Ghe> getArrayListGhe() {
        return arrayListGhe;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public void setMaSanBayDi(String maSanBayDi) {
        this.maSanBayDi = maSanBayDi;
    }

    public void setMaSanBayDen(String maSanBayDen) {
        this.maSanBayDen = maSanBayDen;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public void setGioBay(Time gioBay) {
        this.gioBay = gioBay;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setKhoangCach(int khoangCach) {
        this.khoangCach = khoangCach;
    }

    public void setArrayListGhe(ArrayList<Ghe> arrayListGhe) {
        this.arrayListGhe = arrayListGhe;
    }

}
