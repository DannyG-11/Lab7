public class ResidentialSite extends Site{
    double base;
    double tax;

    public ResidentialSite(){
        super();
    }

    public double getBillableAmount(double units, double rate){
        base = units * rate;
        tax = base * TAX_RATE;
        return base * tax;
    }

}
