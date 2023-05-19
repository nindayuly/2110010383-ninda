/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author Aspire ES14
 */
public class Piutang {
    private String No_Piutang;
    private String Tgl_Piutang;
    private String Total_Piutang;
    
     public Piutang() {}
    
    public Piutang(String a){
        setNo_Piutang(a);
        
     }
    public Piutang(String a, String b ){
        setNo_Piutang(a);
        setTgl_Piutang(b);           
    }
     public Piutang (String a, String b, String c){
        setNo_Piutang (a);
        setTgl_Piutang(b);
        setTotal_Piutang(c);
        
    }
     public void setNo_Piutang(String a){
        this.No_Piutang=a;
    }
    
    public String getNo_Piutang(){
        return this.No_Piutang;
    }
    
    public void setTgl_Piutang(String b){
        this.Tgl_Piutang=b;
    }
    
    public String getTgl_Piutang(){
        return this.Tgl_Piutang;
    }
    
    public void setTotal_Piutang(String c){
        this.Total_Piutang=c;
    }
    
    public String getTotal_Piutang(){
        return this.Total_Piutang;
    
        }
    public String dataPiutang(){
        return getNo_Piutang()+getTgl_Piutang()+getTotal_Piutang();
    }
    public String dataPiutang(String a,String b,String c){
        setNo_Piutang(a);
        setTgl_Piutang(b);
        setTotal_Piutang(c);  
       return getNo_Piutang()+getTgl_Piutang()+getTotal_Piutang();
    }   
}
