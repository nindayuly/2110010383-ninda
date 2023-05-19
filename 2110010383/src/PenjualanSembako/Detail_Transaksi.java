/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author User
 */
public class Detail_Transaksi {
    private String No_transaksi;
    private String Kd_Sembako;
    private String Jumlah;
    
    public Detail_Transaksi() {}
    
    public Detail_Transaksi(String a){
        setNo_transaksi(a);
    }
    
    public Detail_Transaksi(String a, String b ){
        setNo_transaksi(a);
        setKd_Sembako(b);
            
    }
    
    public Detail_Transaksi(String a, String b, String c ){
        setNo_transaksi(a);
        setKd_Sembako(b);
        setJumlah(c);
            
    } 
     public void setNo_transaksi (String a){
        this.No_transaksi=a;
    }
    
    public String getNo_transaksi(){
        return this.No_transaksi;
    }
    
    public void setKd_Sembako(String b){
        this.Kd_Sembako=b;
    }
    
    public String getKd_Sembako(){
        return this.Kd_Sembako;
    }
    
    public void setJumlah(String c){
        this.Jumlah=c;
    }
    
    public String getJumlah(){
        return this.Jumlah;
    }
    public String dataDetail_Transaksi(){
        return getNo_transaksi()+getKd_Sembako()+getJumlah();
    }
    public String dataDetail_Transaksi(String a,String b,String c){
        setNo_transaksi(a);
        setKd_Sembako(b);
        setJumlah(c);
        
       return getNo_transaksi()+getKd_Sembako()+getJumlah();
    }
}
