/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author Aspire ES14
 */
public class Sembako {
    private String Kd_Sembako;
    private String Nm_Sembako;
    private String Harga;
    private String Satuan;
    private String Stok;
    
    public Sembako() {}
    
    public Sembako(String a){
        setKd_Sembako(a);
    }
    public Sembako(String a, String b ){
        setKd_Sembako(a);
        setNm_Sembako(b);
            
    }
    public Sembako (String a, String b, String c){
        setKd_Sembako (a);
        setNm_Sembako(b);
        setHarga (c);
        
    }
    public Sembako (String a, String b, String c, String d){
        setKd_Sembako(a);
        setNm_Sembako(b);
        setHarga(c);
        setSatuan (d);
        
       
    }
    public Sembako (String a, String b, String c, String d, String e){
        setKd_Sembako (a);
        setNm_Sembako(b);
        setHarga (c);
        setSatuan (d);
        setStok(e);
    }
     public void setKd_Sembako(String a){
        this.Kd_Sembako=a;
    }
    
    public String getKd_Sembako(){
        return this.Kd_Sembako;
    }
    
    public void setNm_Sembako (String b){
        this.Kd_Sembako=b;
    }
    
    public String getNm_Sembako(){
        return this.Nm_Sembako;
    }
    
    public void setHarga (String c){
        this.Harga=c;
    }
    
    public String getHarga(){
        return this.Harga;
    }
    
    public void setSatuan(String d){
        this.Satuan=d;
    }
    
    public String getSatuan(){
        return this.Satuan;
    }
    public void setStok(String e){
        this.Stok=e;
    }
    
    public String getStok(){
        return this.Stok;
    }
    public String dataSembako(){
        return getKd_Sembako()+getNm_Sembako()+getHarga()+getSatuan()+getStok();
    }
    public String dataSembako(String a,String b,String c, String d, String e){
        setKd_Sembako(a);
        setNm_Sembako(b);
        setHarga(c);
        setSatuan(d);
        setStok(e);
        
       return getKd_Sembako()+getNm_Sembako()+getHarga()+getSatuan()+getStok();
    }

}
