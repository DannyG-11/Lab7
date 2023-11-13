public class Site {
    double units;
    double rate;
    double TAX_RATE = 0.13;

    public static void main(String[] args) {

    }
    public Site(){

    }
    public double getBillableAmount(){
        return getBaseAmount + getTaxAmount;
    }
    static public double getBaseAmount;
    static public double getTaxAmount;

}