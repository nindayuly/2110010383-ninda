/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenjualanSembako;

/**
 *
 * @author Aspire ES14
 */
public class User {
    private String Id_User;
    private String Username;
    private String Password;
    
     public User() {}
    
    public User(String a){
        setId_User(a);
        
     }
    public User(String a, String b ){
        setId_User(a);
        setUsername(b);           
    }
     public User (String a, String b, String c){
        setId_User (a);
        setUsername(b);
        setPassword(c);
        
    }
     public void setId_User(String a){
        this.Id_User=a;
    }
    
    public String getId_User(){
        return this.Id_User;
    }
    
    public void setUsername(String b){
        this.Username=b;
    }
    
    public String getUsername(){
        return this.Username;
    }
    
    public void setPassword(String c){
        this.Password=c;
    }
    
    public String getPassword(){
        return this.Password;
    
        }
    public String dataUser(){
        return getId_User()+getUsername()+getPassword();
    }
    public String dataUser(String a,String b,String c){
        setId_User(a);
        setUsername(b);
        setPassword(c);  
       return getId_User()+getUsername()+getPassword();
    }
}
