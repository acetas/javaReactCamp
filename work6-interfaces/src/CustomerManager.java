
public class CustomerManager {
	
	private CustomerBranch customerBranch;
	
	public CustomerManager(CustomerBranch customerBranch) {
		this.customerBranch = customerBranch;
	}
	
	public void add() {
		customerBranch.add();
	}
}
