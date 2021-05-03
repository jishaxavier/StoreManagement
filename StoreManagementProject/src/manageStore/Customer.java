package manageStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Customer {
	public enum GenderEnum{
		FEMALE,
		MALE
	}
	private String fname;
	private String lname;
	private String custID;
	private String date;
	private GenderEnum gender;
	private double newAmount;
	Address CustomerAddr;
	Billing bill;
	
	List<Billing> listOfBills = new ArrayList<Billing>();	//---List of Bills
	Set<String> custIDSet = new HashSet<String>();					//---List of customer id
	
	Customer customer;
	
	public Customer(String fname, String lname, String custID, String date, GenderEnum gender) {
		this.fname= fname;
		this.lname = lname;
		this.custID = custID;
		this.date = date;
		this.gender = gender;
		custIDSet.add(custID);
	}	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {			// ----Sets First Name---
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {			// ----Sets Last Name---
		this.lname = lname;
	}
	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {			// ----Sets Customer Id---
		this.custID = custID;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {		// ----Sets Gender---
		this.gender = gender;
	}
	public Address getCustomerAddr() {			//Get Customer address
		return customerAddr;
	}
	public void setCustomerAddr(Address customerAddr) {		// ----Sets Customer address---
		this.customerAddr = customerAddr;
	}
	public String getDate() {				//------get Date-----
		return date;
	}
	public void setDate(String date) {		//-----Set Date -------
		this.date = date;
	}
	public void getBill() {				//------get Bill details ------
		for(int i=0; i<listOfBills.size(); i++) {
			bill.getBill();
		}
	}
	public void listAllBills() {				///------Get List of Bill
		for(int k=0; k<listOfBills.size();k++) {
			listOfBills.get(k).getBill();
		}
	}
												
	public void setBill(Billing bill) {		//Add bills to existing customer
		this.bill = bill;
		listOfBills.add(this.bill);
	}
	
	

	public List<Billing> getListOfBills() {
		return listOfBills;
	}

	public void setListOfBills(List<Billing> listOfBills) {
		this.listOfBills = listOfBills;
	}

	public void updateBill(String checkbillID, double amountPaid) {		//Update bill amount
		for(int i=0;i<listOfBills.size();i++) {
			if(listOfBills.get(i).getBillD().contains(checkbillID)) {
				newAmount = listOfBills.get(i).getBillAmount()-amountPaid;
				if(newAmount==0) {
					listOfBills.get(i).setPaid(true);
				}else {
					listOfBills.get(i).setBillAmount(newAmount);
					System.out.println("New Amount for billId "+ listOfBills.get(i).getBillD()+"= "+listOfBills.get(i).getBillAmount());
				}
			break;
			}
		}
		
	}
	
	public void updateAddress(Address addr) {			//---Update Address
		setCustomerAddr(addr);
	}
	
	public void getCustomer() {			//---Get Customer
		
		System.out.println("Customer Id: "+custID);
		System.out.println("Customer Name: "+fname+" "+lname);
	}
	public void billPaidCust() {
		customer.getBill();;
	}
	
	public void printAllCustomers() {
		Iterator itr = custIDSet.iterator();
		while(itr.hasNext()) {
			System.out.println(custIDSet.toString());
		}	
		
	}
	
	
	
	
}
