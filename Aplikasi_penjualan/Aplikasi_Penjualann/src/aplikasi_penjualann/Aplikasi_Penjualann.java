/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_penjualann;

/**
 *
 * @author domm
 */
public class Aplikasi_Penjualann {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new tampilan.Pelanggan().setVisible(true);
        new tampilan.Data_Barang().setVisible(true);
    });
}
    
}
