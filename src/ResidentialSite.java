public class ResidentialSite extends Site{
    double base;
    double tax;

    public ResidentialSite(String units, double rate){
        this.units = units;
        this.rate = rate;
    }
    public double getBillableAmount(double units, double rate){
        base = units * rate;
        tax = base * TAX_RATE;
        return base * tax;
    }

}
