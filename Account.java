
public  class Account {

private String id;
private String name;
private double balance;
private String type;

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