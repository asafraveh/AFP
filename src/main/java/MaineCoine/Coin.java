package MaineCoine;
public abstract class Coin implements ICalculte {


    public abstract double getUsdValu();

    public abstract double getIlsValu();


    public abstract double getEurvalue();

    public abstract double calculate(double input, double getUsdValu);
}


