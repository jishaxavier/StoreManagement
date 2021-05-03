package manageStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import manageStore.Customer.GenderEnum;

public class CustomerOperations {
    private Map<String, Customer> customers = new HashMap<String, Customer>();
	
    public void addCustomer(Customer customer) {
    	//add customer to hashmap
    	///using customer id as the key 
    }
   
    public void updateCustomer(Customer customer) {
    	//add customer to hashmap
    	///using customer id as the key 
    }
   
    public double addCustomerBill(String customerId, Billing bill){
		   return 0;
	}
	
    public List<Customer> findByLocation(String location){
		   return null;
	}
	
	
/*
      
	public static void customersFrom(List<Customer> setOfCustomers, String location) {
		
		for(int i=0;i<setOfCustomers.size(); i++) {
			System.out.println("Customers from "+location);
			if (setOfCustomers.get(i).customerAddr.getCity().equalsIgnoreCase(location)) {
				System.out.println(setOfCustomers.get(i).getFname()+" "+setOfCustomers.get(i).getLname()+" , "+setOfCustomers.get(i).getCustID());
			}System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		List<Customer> setOfCustomers= new ArrayList<Customer>();
		//String fname, String lname, String custID, String date, GenderEnum gender, AddressClass customerAddr, BillingClass bill
		Customer cc1 = new Customer("Jish","Xavi", "c101", "April 21", GenderEnum.FEMALE);
		Customer cc2=new Customer("sandy", "joseph", "c102", "June 08", GenderEnum.MALE);
		Customer cc3 = new Customer("chinju", "goerge", "c103","July 03", GenderEnum.FEMALE);
		setOfCustomers.add(cc1);
		setOfCustomers.add(cc2);
		setOfCustomers.add(cc3);
		
		//int houseNum, String street, String city, String state, String country, String zip
		cc1.setCustomerAddr(new AddressClass(41, "Vedette Way", "Vaughan", "Ontario", "Canada", "L4H4K2"));
		cc2.setCustomerAddr(new AddressClass(1001, "Mabelle Ave", "Toronto", "Ontario", "Canada", "M9A4X9"));
		cc3.setCustomerAddr(new AddressClass(543, "Manzanillo", "Toronto", "Ontario", "Canada", "M4C6L3"));
		//String billID,double billAmt, String dateofPayment, Boolean paid
		cc1.setBill(new BillingClass("B123", 102.35, "4/13/21", false));
		cc1.setBill(new BillingClass("B124", 200.09, "4/22/21", false));
		
		cc1.listAllBills();
		//Get Customers from Toronto
		
		customersFrom(setOfCustomers,"Toronto");
		
		
		
		System.out.println();
		cc1.getCustomerAddr();
		
		//cc1.getCustomer();
		cc1.updateBill("B123", 20.0);
		cc2.getCustomerAddr();
		System.out.println();
		//cc2.update
		cc2.updateAddress(new AddressClass(10, "HoneyDew ave", "Vaughan", "Ontario", "Canada", "L4H5J0"));
		cc2.getCustomerAddr();

	}
	
	*/

}
