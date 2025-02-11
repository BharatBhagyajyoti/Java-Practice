package nareshit.lab.dt05_02_25_Collection;

public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();
        CabCustomer customer1 = new CabCustomer(1, "John", "Location A", "Location B", "1234567890", 5);
        CabCustomer customer2 = new CabCustomer(2, "Smith", "Location C", "Location D", "0987654321", 6);
        CabCustomer customer3 = new CabCustomer(3, "John", "Location E", "Location F", "1234567890", 3);

//        service.addCabCustomer(customer1);
//        service.addCabCustomer(customer2);
//        service.addCabCustomer(customer2);


//        service.addCabCustomer(new CabCustomer(1, "John", "Location A", "Location B", "1234567890", 5));
//        service.addCabCustomer(new CabCustomer(2, "Smith", "Location C", "Location D", "0987654321", 6));
//        service.addCabCustomer(new CabCustomer(3, "John", "Location E", "Location F", "1234567890", 3));
//
//
//        for (CabCustomer tempC : custList) {
//            if (c.getPhone().equals(tempC.getPhone())) {
//
//                return false;
//            }
//        }


        service.printBill(customer1);
        service.printBill(customer2);
        service.printBill(customer3);


    }

}
