package koneksi;
import java.sql.*;

public class koneksi {
    private Connection koneksi;

    public Connection connect() {
    try {
        // Gunakan yang ada ".cj" nya karena kamu pakai driver versi 9.0.0
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        System.out.println("Driver Berhasil Dipanggil");
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver Tidak Ditemukan: " + ex);
    }
    
    // Pastikan localhost dan nama database-nya benar
    String url = "jdbc:mysql://localhost:3306/penjualan"; 

    try {
        koneksi = DriverManager.getConnection(url, "root", "");
        System.out.println("Berhasil koneksi database");
    } catch (SQLException ex) {
        System.out.println("Gagal koneksi database: " + ex);
    }
   
    return koneksi;
}
}