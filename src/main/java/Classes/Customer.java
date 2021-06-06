
package Classes;


public class Customer {
    private String name;
    private String surname;
    private static String email;
    private String password;
    private String member;
   

    public  Customer(String Email) {
      this.email = Email;
   
    }

    public Customer() {
        
    }


    public static String getEmail(){
          
          System.out.println(email);
          return email; }
    
    public String getPassword(){
        return password;
    }

    
}

    
