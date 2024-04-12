package Classes;
import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name){
        this.name=name;
        customers=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean newCustomer(String name,double transaction){
        if(findCustomer(name)!=null){
            return false;
        }else{
            customers.add(new Customer(name,transaction));
            return true;
        }

    }
    public boolean addCustomerTransaction(String name,double transaction){
        if(findCustomer(name)!=null){
            customers.get(customers.indexOf(findCustomer(name))).addTransaction(transaction);
            return true;
        }else{
            return false;
        }
    }
    private Customer findCustomer(String name){
        for(Customer aux : customers){
            if(aux.getName().equals(name)){
                return aux;
            }
        }
        return null;
    }
}
