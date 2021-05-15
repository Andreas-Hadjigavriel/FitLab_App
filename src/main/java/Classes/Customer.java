
package Classes;


public class Customer {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String member;
    
    public Customer(String name, String surname,String email, String password, String member){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.member = member;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
}

    
