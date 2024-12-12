package nareshit.lab.dt12_12_24_LooselyCoupleEX.q1;
public class TestPhone {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        SIMCardInterface sim = phone.insertSIM();
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }
        System.out.println("\nInserting a new SIM card...");
        sim = phone.insertSIM();
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }

        System.out.println("\nInserting a new SIM card...");
        sim = phone.insertSIM();
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }
    }
}

