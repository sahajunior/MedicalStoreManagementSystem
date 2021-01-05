import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        System.out.println("Welcome to Medical Store Management System");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-");

        Scanner input = new Scanner(System.in);
        int i = 1;
        int j;
        Capsule cap = new Capsule();
        Customer cus = new Customer();
        FileOperation r = new FileOperation();

        while (i != 0) {
            System.out.println("1: Manage Capsule");
            System.out.println("2: Manage Customer");
            System.out.println("3: Exit");
            System.out.print("Click Here: ");

            i = input.nextInt();
            input.nextLine();

            if (i == 3) {
            break;
            }

            switch (i) {
                case 1:
                    System.out.println("1: Add Capsule");
                    System.out.println("2: Delete Capsule");
                    System.out.println("3: View Capsule");
                    System.out.print("Click Here: ");

                    j = input.nextInt();
                    input.nextLine();

                    while (j == 1) {
                        System.out.print("Enter Capsule Name: ");
                        String medicineName = input.nextLine();
                        cap.setName(medicineName);
                        System.out.print("Enter Capsule ID: ");
                        String medicineID = input.nextLine();
                        cap.setID(medicineID);
                        System.out.print("Enter Capsule Price: ");
                        double medicinePrice = Double.parseDouble(input.nextLine());
                        cap.setPrice(medicinePrice);
                        System.out.print("Enter Capsule Quantity: ");
                        int medicineQuantity = Integer.parseInt(input.nextLine());
                        cap.setQuantity(medicineQuantity);
                        cap.insertMedicine(cap);

                        // File Read Write
                        FileOperation rw = new FileOperation();
                        rw.insertMedicine(cap);
                        break;
                    }
                    while (j == 2) {
                        System.out.print("Enter Capsule ID: ");
                        String n = input.nextLine();
                        cap.setID(n);
                        cap.deleteMedicine(n);
                        break;
                    }
                    while (j == 3) {
                        cap.showAllMedicine();
                        break;
                    }
                    while (j < 0 || j > 3) {
                        System.out.println("Wrong Input!\nError 404");
                    }
                    break;
                case 2:
                    System.out.println("1: Add Customer");
                    System.out.println("2: Delete Customer");
                    System.out.println("3: View Customer");
                    System.out.print("Click Here: ");

                    j = input.nextInt();
                    input.nextLine();

                    while (j == 1) {
                        // CustomerOperations c = new Customer();
                        System.out.print("Enter Customer Name: ");
                        String customerName = input.nextLine();
                        cus.setCustomerName(customerName);
                        System.out.print("Enter Customer's ID: ");
                        String customerID = input.nextLine();
                        cus.setCustomerID(customerID);
                        System.out.print("Enter Customers Bill ID: ");
                        String customerBillID = input.nextLine();
                        cus.setCustomerBillID(customerBillID);
                        cus.insertCustomer(cus);
                        break;
                    }
                    while (j == 2) {
                        System.out.print("Enter Customer ID: ");
                        String n = input.nextLine();
                        cus.setCustomerID(n);
                        cus.deleteCustomer(n);
                        break;
                    }
                    while (j == 3) {
                        cus.showAllCustomer();
                        break;
                    }
                    while (j < 0 || j > 3) {
                        System.out.println("Wrong Input!\nError 404");
                    }
                    break;
            }
        }
    }

}
