public class AccountApp {
   
    public static void main (String[] args){
        Account a1 = new Account ();
        Account a2 = new Account ();

        a1.setId ("101");
        a1.setName ("Aniqa");
        a1.setBalance(5000);
        a1.setType ("Current");

        System.out.println(a1.getId());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        System.out.println(a1.getType());

        a2.setId ("252");
        a2.setName ("Tonne");
        a2.setBalance(10000);
        a2.setType ("Saving");

        System.out.println(a2.getId());
        System.out.println(a2.getName());
        System.out.println(a2.getBalance());
        System.out.println(a2.getType());

    }
}