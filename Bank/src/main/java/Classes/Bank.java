package Classes;
import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name) {
        this.name = name;
        branches=new ArrayList<>();
    }
    public boolean addBranch(String name) {
        if(findBranch(name)!=null){
            return false;
        }else{
            branches.add(new Branch(name));

            return true;
        }
    }
    public boolean addCustomer(String nameBranch,String nameCostumer,double transaction){
        if(findBranch(nameBranch)!=null){
            if(!findBranch(nameBranch).newCustomer(nameCostumer, transaction)){
                return false;
            }else{

                return true;
            }
        }else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String nameBranch,String nameCostumer,double transaction) {
        if(findBranch(nameBranch)!=null){
            if(findBranch(nameBranch).addCustomerTransaction(nameCostumer, transaction)){

                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
    public Branch findBranch(String name) {
        for(Branch b:branches){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }
    public boolean listCustomers(String name,boolean printTransactions){
        if(findBranch(name)!=null){
            System.out.println("Customer details for branch "+name);
            Branch b=findBranch(name);
                int cont2=1;
                for(Customer c:b.getCustomers()){
                    System.out.println("Customer: "+c.getName()+"["+cont2+"]");
                    if(printTransactions){
                        System.out.println("Transactions");
                        int cont=1;
                        for(Double d:c.getTransactions()){
                            System.out.println("["+cont+"]"+" Amount "+d);
                            cont++;
                        }
                    }
                    cont2++;
                }

            return true;
        }
        return false;
    }


}
