package MaineCoine;

abstract class USD extends Coin {
    private final double value = 3.52;
    double Usdvalue;
    @Override
    public double getUsdValu() {
        double Usdvalue=value;
        return Usdvalue;
    }

@Override
    public double calculate(double input, double getUsdValu){
        return input*getUsdValu();

}


}


