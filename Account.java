
public  class Account {

private String id;
private String name;
private double balance;
private String type;

public Account (){
    balance=0;
    System.out.println("This is an account with banalce:" +getBalance());
}

public Account (float balance){
    this.balance=balance;
    System.out.println("This is an account with banalce:" +getBalance());
}

public Account (String accountId){
    this.id=accountId;
    System.out.println("Account number is :" +getId());
}
public Account (String accountId,float balance){
    this.id = accountId;
    this.balance=balance;
    System.out.println("Account number is:" +getId());
    System.out.println("This is an account with banalce:" +getBalance());
 
}

public void setId(String id){
    this.id= id ;

}
public void setName(String name){
    this.name = name ;
} 
public void setBalance (double balance){
    this.balance = balance;
}
public void setType (String type){
    this .type = type;
}
public String getId(){
    return id;
}
public String getName(){
    return name ;
}
public double getBalance(){
    return balance;
}
public String getType (){
    return type;
}

}