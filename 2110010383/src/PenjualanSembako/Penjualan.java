/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author User
 */
public class Penjualan {
    private String No_transaksi;
    private String Tgl_transaksi;
    private String Total_transaksi;
    private String Nik;
    private String Id_user;
    
    public Penjualan() {}
    
    public Penjualan(String a){
        setNo_transaksi(a);
    }
    
    public Penjualan(String a, String b ){
        setNo_transaksi(a);
        setTgl_transaksi(b);
            
    }
    
    public Penjualan(String a, String b, String c ){
        setNo_transaksi(a);
        setTgl_transaksi(b);
        setTotal_transaksi(c);
            
    }
    
    public Penjualan (String a, String b, String c, String d){
        setNo_transaksi (a);
        setTgl_transaksi(b);
        setTotal_transaksi (c);
        setNik (d);
       
    }
    public Penjualan (String a, String b, String c, String d, String e){
        setNo_transaksi (a);
        setTgl_transaksi(b);
        setTotal_transaksi (c);
        setNik (d);
        setId_user (e);
    }
    
    public void setNo_transaksi (String a){
        this.No_transaksi=a;
    }
    
    public String getNo_transaksi(){
        return this.No_transaksi;
    }
    
    public void setTgl_transaksi (String b){
        this.Tgl_transaksi=b;
    }
    
    public String getTgl_transaksi(){
        return this.Tgl_transaksi;
    }
    
    public void setTotal_transaksi(String c){
        this.Total_transaksi=c;
    }
    
    public String getTotal_transaksi(){
        return this.Total_transaksi;
    }
    
    public void setNik(String d){
        this.Nik=d;
    }
    
    public String getNik(){
        return this.Nik;
    }
    public void setId_user(String e){
        this.Id_user=e;
    }
    
    public String getId_user(){
        return this.Id_user;
    }
    
    public String dataPenjualan(){
        return getNo_transaksi()+getTgl_transaksi()+getTotal_transaksi()+getNik()+getId_user();
    }
    public String dataPenjualan(String a, String b, String c, String d, String e){
        setNo_transaksi(a);
        setTgl_transaksi(b);
        setTotal_transaksi(c);
        setNik(d);
        setId_user(e);
        
       return getNo_transaksi()+getTgl_transaksi()+getTotal_transaksi()+getNik()+getId_user();
    }
    
}
