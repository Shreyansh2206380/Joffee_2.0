class Account {
    public String name;           
    protected String email;        
    public String password;     

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Access_Specifiers {
    public static void main(String args[]) {
        Account a1 = new Account();

        a1.name = "KIIT";                           
        a1.setPassword("abcd");                     
        a1.email = "2206380@kiit.ac.in";            

        System.out.println("Name: " + a1.name);
        System.out.println("Email: " + a1.email);
        System.out.println("Password: " + a1.password);

    }
}
