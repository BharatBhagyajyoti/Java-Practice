package nareshit.lab.dt12_12_24_LooselyCoupleEX.q1;

import java.util.Scanner;

public class MobilePhone implements MobilePhoneInterface{
    String pNumber;
    String nw;
    boolean status;
    SIMCardInterface sim=null;
    @Override
    public SIMCardInterface insertSIM() {
        System.out.println("Choose SIM card:\n1. Airtel\n2. Jio\n3. BSNL");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        switch (s) {
            case 1:
                sim = new Airtel();
                break;
            case 2:
                sim = new Jio();
                break;
            case 3:
                sim = new BSNL();
                break;
            default:
                System.out.println("Choose correct option!");
                return null;
        }
        nw = sim.networkProvider();
        pNumber = sim.getPhoneNumber();
        status = sim.activate();

        System.out.println("SIM card inserted!");
        System.out.println("Network: " + nw);
        System.out.println("Phone number: " + pNumber);
        System.out.println("Status: " + (status ? "Activated" : "Deactivated"));
        return sim;
    }

    @Override
    public void removeSIM(SIMCardInterface sim) {
        if (this.sim == null) {
            System.out.println("No SIM card to remove!");
            return;
        }
        this.sim.deactivate();
        this.sim = null;
        pNumber = null;
        nw = null;
        status = false;
        System.out.println("SIM card removed!");
    }


    @Override
    public void makeCall() {
        System.out.println("Calling....");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending Message !");
    }
}
