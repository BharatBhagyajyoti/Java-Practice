package nareshit.lab.dt05_02_25_Collection;



import java.util.ArrayList;

public class CabCustomerService {
    private static ArrayList<CabCustomer> custList = new ArrayList<>();

    public void addCabCustomer(CabCustomer c) {
        if (checkNew(c)) {

        custList.add(c);

        } else {
            System.out.println("Customer is already exist!");
        }
    }

    public boolean checkNew(CabCustomer c) {
        for (CabCustomer tempC : custList) {
            if (c.getPhone().equals(tempC.getPhone())) {

                return false;
            }
        }
        return true;
    }

    public boolean isFirstCustomer(CabCustomer c) {
        if(checkNew(c))
        {
            return true;
        }
        return false;
    }

    public double calculateBill(CabCustomer c) {
        if (isFirstCustomer(c)) {
            addCabCustomer(c);
            return 0.0;
        }
        if (c.getDistance() <= 4) {
            return 80.0;
        } else {
            return 80.0 + ((c.getDistance() - 4) * 6);
        }
    }

    public void printBill(CabCustomer c) {
        double bill = calculateBill(c);
        System.out.println(c.getCustomerName() + " Please pay your bill of Rs." + bill);
    }



}