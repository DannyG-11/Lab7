public class LifelineSite extends Site{
    double base;
    double tax;
    public LifelineSite(){
        super();
    }
    public double getBaseAmount(double units, double rate){
        base = units * rate;
        return base;
    }
    public double getTaxAmount(double units, double rate){
        base = units * rate;
        tax = base * TAX_RATE;
        return tax;
    }
}
