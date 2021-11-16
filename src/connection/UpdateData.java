package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChuyenBay;
import model.DuongBay;
import model.KhachHang;
import model.MayBay;
import model.NhanVien;
import model.SanBay;
import model.TaiKhoan;

/**
 *
 * @author tuanbuiquoc
 */
public class UpdateData {

    public static boolean updateKhachHang(KhachHang khachHang) {
        String sqlCommand = "update dbo.KHACHHANG set TenKhachHang=?, Email=?, DiaChi=?, CMND=?, DiemTichLuy=?"
                + " where SoDienThoaiKhachHang=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, khachHang.getTenKhachHang());
            ps.setString(2, khachHang.getEmail());
            ps.setString(3, khachHang.getDiaChi());
            ps.setString(4, khachHang.getCmnd());
            ps.setInt(5, khachHang.getDiemTichLuy());
            ps.setString(6, khachHang.getSdtKhachHang());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa khách hàng thất bại");
        return false;
    }

    public static boolean updateDuongBay(DuongBay duongBay) {
        String sqlCommand = "update dbo.DUONGBAY set MaSanBay1=?, MaSanBay2=?, KhoangCach=?"
                + " where MaDuongBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, duongBay.getMaSanBay1());
            ps.setString(2, duongBay.getMaSanBay2());
            ps.setInt(3, duongBay.getKhoangCach());
            ps.setString(4, duongBay.getMaDuongBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa đường bay thất bại");
        return false;
    }

    public static boolean updateChuyenBay(ChuyenBay chuyenBay) {
        String sqlCommand = "update dbo.CHUYENBAY set MaMayBay=?, MaSanBayDi=?, MaSanBayDen=?, NgayBay=?, GioBay=?, GhiChu=?, KhoangCach=?"
                + " where MaChuyenBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, chuyenBay.getMaMayBay());
            ps.setString(2, chuyenBay.getMaSanBayDi());
            ps.setString(3, chuyenBay.getMaSanBayDen());
            ps.setDate(4, chuyenBay.getNgayBay());
            ps.setTime(5, chuyenBay.getGioBay());
            ps.setString(6, chuyenBay.getGhiChu());
            ps.setInt(7, chuyenBay.getKhoangCach());
            ps.setString(8, chuyenBay.getMaChuyenBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chuyến bay thất bại");
        return false;
    }

    public static boolean updateSanBay(SanBay sanBay) {
        String sqlCommand = "update dbo.SANBAY set TenSanBay=?"
                + " where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, sanBay.getTenSanBay());
            ps.setString(2, sanBay.getMaSanBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa sân bay thất bại");
        return false;
    }

    public static boolean updateMayBay(MayBay mayBay) {
        String sqlCommand = "update dbo.MAYBAY set TenMayBay=?, HangBay=?"
                + " where MaMayBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, mayBay.getTenMayBay());
            ps.setString(2, mayBay.getHangBay());
            ps.setString(3, mayBay.getMaMayBay());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa máy bay thất bại");
        return false;
    }

    public static boolean updateDiemTichLuyKhachHang(String sdtKhachHang, int diemTichLuy) {
        String sqlCommand = "update dbo.KHACHHANG set DiemTichLuy=?"
                + " where SoDienThoaiKhachHang=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, diemTichLuy);
            ps.setString(2, sdtKhachHang);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa điểm tích lũy khách hàng thất bại");
        return false;
    }

    public static boolean updateNhanVien(NhanVien nhanVien) {
        String sqlCommand = "update dbo.NHANVIEN set TenNhanVien=?, DiaChi=?, CMND=?"
                + " where SoDienThoaiNhanVien=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nhanVien.getTenNhanVien());
            ps.setString(2, nhanVien.getDiaChi());
            ps.setString(3, nhanVien.getCmnd());
            ps.setString(4, nhanVien.getSdtNhanVien());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sửa nhân viên thất bại");
        return false;
    }

    // đổi mật khẩu
    public static boolean updateTaiKhoan(TaiKhoan taiKhoan) {
        String sqlCommand = "update dbo.TAIKHOAN set MatKhau=?"
                + " where TenDangNhap=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan.getMatKhau());
            ps.setString(2, taiKhoan.getTenDangNhap());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa tài khoản thất bại");
        return false;
    }

    //đổi loại tk (nhanvien, quanly)
    public static boolean updateTaiKhoan(String soDienThoai, String phanQuyen) {// theo sdt
        String sqlCommand = "update dbo.TAIKHOAN set LoaiTaiKhoan=?"
                + " where SoDienThoai=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, phanQuyen);
            ps.setString(2, soDienThoai);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa tài khoản thất bại");
        return false;
    }

    public static boolean deleteTaiKhoan(String soDienThoai) {//xoa theo sdt
        String sqlCommand = "delete from dbo.TAIKHOAN where SoDienThoai=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, soDienThoai);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa tài khoản thất bại");
        return false;
    }

    public static boolean updateGhe(String maGhe, byte trangThaiGhe) {
        byte trong = trangThaiGhe;
        String sqlCommand = "update dbo.GHE set Trong=?"
                + " where MaGhe=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setByte(1, trong);
            ps.setString(2, maGhe);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa ghế thất bại");
        return false;
    }

    public static boolean updateHoaDon(String maHoaDon, int tongTien) {
        String sqlCommand = "update dbo.HOADON set TongTien=?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, tongTien);
            ps.setString(2, maHoaDon);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }

    public static boolean updateHoaDon(String maHoaDon, int tongTien, String sdtNhanVien) {
        String sqlCommand = "update dbo.HOADON set TongTien=?, SoDienThoaiNhanVien=?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, tongTien);
            ps.setString(2, sdtNhanVien);
            ps.setString(3, maHoaDon);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }

    public static boolean updateHoaDon(String maHoaDon, byte trangThaiThanhToan) {

        String sqlCommand = "update dbo.HOADON set TrangThaiThanhToan=?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, trangThaiThanhToan);
            ps.setString(2, maHoaDon);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }

    public static boolean updateHoaDon(String maHoaDon, byte trangThaiThanhToan, String sdtNhanVien) {

        String sqlCommand = "update dbo.HOADON set TrangThaiThanhToan=?, SoDienThoaiNhanVien = ?"
                + " where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, trangThaiThanhToan);
            ps.setString(2, sdtNhanVien);
            ps.setString(3, maHoaDon);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }

    public static boolean deleteVe(String maVe, String maHoaDon) {
        String sqlCommand = "delete from dbo.VE where MaVe=? and MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maVe);
            ps.setString(2, maHoaDon);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa vé thất bại");
        return false;
    }

    public static boolean deleteChuyenBay(String maChuyenBay) {
        String sqlCommand = "delete from dbo.CHUYENBAY where MaChuyenBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maChuyenBay);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chuyến bay thất bại");
        return false;
    }

    public static boolean deleteDuongBay(String maDuongBay) {
        String sqlCommand = "delete from dbo.DUONGBAY where MaDuongBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maDuongBay);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa đường bay thất bại");
        return false;
    }

    public static boolean deleteHoaDon(String maHoaDon) {
        String sqlCommand = "delete from dbo.HOADON where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maHoaDon);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa hóa đơn thất bại");
        return false;
    }

    public static boolean deleteNhanVien(String sdtNhanVien) {
        String sqlCommand = "delete from dbo.NHANVIEN where SoDienThoaiNhanVien=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sdtNhanVien);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa nhân viên thất bại");
        return false;
    }

    public static boolean deleteSanBay(String maSanBay) {
        String sqlCommand = "delete from dbo.SANBAY where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maSanBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa sân bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }

    public static boolean deleteMayBay(String maMayBay) {
        String sqlCommand = "delete from dbo.MAYBAY where MaMayBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maMayBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa may bay thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa sân bay thất bại");
        return false;
    }

    public static boolean deleteGhe(String maChuyenBay) {
        String sqlCommand = "delete from dbo.GHE where MaChuyenBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, maChuyenBay);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa ghế thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa ghế thất bại");
        return false;
    }

    public static boolean updateSanBay(String maSanBayCanSua, SanBay sanBay) {

        String sqlCommand = "update dbo.SANBAY set MaSanBay=?, TenSanBay=?"
                + " where MaSanBay=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, sanBay.getMaSanBay());
            ps.setString(2, sanBay.getTenSanBay());
            ps.setString(3, maSanBayCanSua);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa sân bay thất bại");
        return false;
    }
}
