package nareshit.lab.dt12_12_24_LooselyCoupleEX.q1;
import java.util.Random;
public class Airtel implements SIMCardInterface{
    boolean status;
    String nw;
    @Override
    public String getPhoneNumber() {
        String num=generateNumber();
//        System.out.println("Phone no. : "+num);
        return num;
    }

    @Override
    public String networkProvider() {
        nw="Airtel";
//        System.out.println("Network: "+nw);
        return nw;
    }

    @Override
    public boolean activate() {
        status=true;
//        System.out.println("Status : Activated");
        return status;
    }

    @Override
    public boolean deactivate() {
        status=false;
//        System.out.println("Status : De-activated");
        return status;
    }


    public String generateNumber()
    {
        Random random = new Random();

        // Generate the first digit greater than 5
        int firstDigit = random.nextInt(4) + 6; // Generates a number in the range 6 to 9

        // Generate the next 9 digits
        long remainingDigits = (long)(random.nextDouble() * 1_000_000_000L);

        // Combine to form the 10-digit number
        String phoneNumber = firstDigit + String.format("%09d", remainingDigits);

        return phoneNumber;
    }

}
