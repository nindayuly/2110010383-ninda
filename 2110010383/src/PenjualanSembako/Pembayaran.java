/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author Aspire ES14
 */
    public class Pembayaran {
       
    private String No_Bayar;
    private String Tgl_Bayar;
    private String Jumlah_Piutang;
    private String No_Piutang;
    private String Tgl_Piutang;
    
    public Pembayaran() {}
    
    public Pembayaran(String a){
        setNo_Bayar(a);
    }
    
    public Pembayaran(String a, String b){
        setNo_Bayar(a);
        setTgl_Bayar(b);
    }
    
    public Pembayaran(String a, String b, String c){
        setNo_Bayar(a);
        setTgl_Bayar(b);
        setJumlah_Piutang(c);     
    }
    
    public Pembayaran (String a, String b, String c, String d){
        setNo_Bayar(a);
        setTgl_Bayar(b);
        setJumlah_Piutang(c);
        setNo_Piutang(d);
    }
    
    public Pembayaran (String a, String b, String c, String d, String e){
        setNo_Bayar(a);
        setTgl_Bayar(b);
        setJumlah_Piutang(c);
        setNo_Piutang(d);
        setTgl_Piutang(e);
    }
    public void setNo_Bayar(String a){
        this.No_Bayar=a;
    }
    
    public String getNo_Bayar(){
        return this.No_Bayar;
    }
    
    public void setTgl_Bayar (String b){
        this.Tgl_Bayar=b;
    }
    
    public String getTgl_Bayar(){
        return this.Tgl_Bayar;
    }
    
    public void setJumlah_Piutang (String c){
        this.Jumlah_Piutang=c;
    }
    
    public String getJumlah_Piutang(){
        return this.Jumlah_Piutang;
    }
    
    public void setNo_Piutang (String d){
        this.No_Piutang=d;
    }
    
    public String getNo_Piutang(){
        return this.No_Piutang;
    }
    
    public void setTgl_Piutang (String e){
        this.Tgl_Piutang=e;
    }
    
    public String getTgl_Piutang(){
        return this.Tgl_Piutang;
    }
    
    public String dataPembayaran(){
        return getNo_Bayar()+getTgl_Bayar()+getJumlah_Piutang()+getNo_Piutang();
    }
    public String dataPembayaran(String a,String b,String c, String d, String e){
        setNo_Bayar(a);
        setTgl_Bayar(b);
        setJumlah_Piutang(c);
        setNo_Piutang(d);
        
       return getNo_Bayar()+getTgl_Bayar()+getJumlah_Piutang()+getNo_Piutang();
    }
 }
       
    

    
