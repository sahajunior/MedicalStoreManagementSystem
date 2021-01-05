public class Customer implements CustomerOperations {

    private String customerName;
    private String customerID;
    private String customerBillID;

    public Customer() {

    }

    public Customer(String customerName, String customerID, String customerBillID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerBillID = customerBillID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerBillID(String customerBillID) {
        this.customerBillID = customerBillID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerBillID() {
        return customerBillID;
    }
    List<Customer> customers = new ArrayList<>();

    @Override
    public void insertCustomer(Customer c) {
        customers.add(c);
    }

    //@Override
    public void deleteCustomer(String c) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerID() == c) {
                customers.remove(i);
                System.out.println("Customer Deleted");
                break;
            }
        }
    }

    public void showAllCustomer() {
        if (customers.isEmpty()) {
            System.out.println("No Customer Found!");
        }
        for (int i = 0; i < customers.size(); i++) {
            if (customers.size() > 0) {
                System.out.println("Customer");
                System.out.println("Name: " + customers.get(i).getCustomerName());
                System.out.println("ID: " + customers.get(i).getCustomerID());
                System.out.println("Customer Bill ID: " + customers.get(i).getCustomerBillID());
            }
        }
    }

    @Override
    public void deleteCustomer(Customer c) {
        throw new UnsupportedOperationException();
    }

}
