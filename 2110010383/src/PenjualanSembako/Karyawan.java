/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author User
 */
public class Karyawan {
    
    private String nik;
    private String namaKaryawan;
    private String subArea;
    private String subArea_text;
    private String dept;
    
    public Karyawan() {}
    
    public Karyawan(String a){
        setnik(a);
    }
    
    public Karyawan(String a, String b ){
        setnik(a);
        setnamaKaryawan(b);
            
    }
    
    public Karyawan (String a, String b, String c){
        setnik (a);
        setnamaKaryawan(b);
        setsubArea (c);
        
    }
    
    public Karyawan (String a, String b, String c, String d){
        setnik (a);
        setnamaKaryawan(b);
        setsubArea (c);
        setsubArea_text (d);
       
    }
    public Karyawan (String a, String b, String c, String d, String e){
        setnik (a);
        setnamaKaryawan(b);
        setsubArea (c);
        setsubArea_text (d);
        setdept (e);
    }
    
    public void setnik (String a){
        this.nik=a;
    }
    
    public String getnik(){
        return this.nik;
    }
    
    public void setnamaKaryawan (String b){
        this.namaKaryawan=b;
    }
    
    public String getnamaKaryawan(){
        return this.namaKaryawan;
    }
    
    public void setsubArea (String c){
        this.subArea=c;
    }
    
    public String getsubArea(){
        return this.subArea;
    }
    
    public void setsubArea_text (String d){
        this.subArea_text=d;
    }
    
    public String getsubArea_text(){
        return this.subArea_text;
    }
    public void setdept (String e){
        this.dept=e;
    }
    
    public String getdept(){
        return this.dept;
    }
    
    public String dataKaryawan(){
        return getnik()+getnamaKaryawan()+getsubArea()+getsubArea_text()+getdept();
    }
    public String dataKaryawan(String a,String b,String c, String d, String e){
        setnik(a);
        setnamaKaryawan(b);
        setsubArea(c);
        setsubArea_text(d);
        setdept(e);
        
       return getnik()+getnamaKaryawan()+getsubArea()+getsubArea_text()+getdept();
    }
    
    
    
    
}
