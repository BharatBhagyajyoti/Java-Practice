package nareshit.lab.dt12_12_24_LooselyCoupleEX.q1;

public interface MobilePhoneInterface {

//    void insertSIM(SIMCardInterface sim);
    SIMCardInterface insertSIM();
    void removeSIM(SIMCardInterface sim);
    void makeCall();
    void sendMessage();

}
