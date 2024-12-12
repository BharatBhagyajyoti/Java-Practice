package nareshit.lab.dt12_12_24_LooselyCoupleEX.q1;
public class TestPhone {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        SIMCardInterface sim = phone.insertSIM();//take "Airtel"
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }
        System.out.println("\nInserting a new SIM card...");
        sim = phone.insertSIM();//take "Jio"
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }

        System.out.println("\nInserting a new SIM card...");
        sim = phone.insertSIM();//take "BSNL"
        if (sim != null) {
            phone.makeCall();
            phone.sendMessage();
            phone.removeSIM(sim);
        }
    }
}

