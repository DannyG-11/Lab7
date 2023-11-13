public class LifelineSite extends Site{
    double base;
    double tax;
    public LifelineSite(){
        super();
    }
    public double getBillableAmount(double units, double rate){
        base = units * rate * 0.5;
        tax = base * TAX_RATE * 0.2;
        return base * tax;
    }
}
