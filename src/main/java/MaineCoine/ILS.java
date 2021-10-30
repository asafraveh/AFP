package MaineCoine;

 abstract class ILS extends Coin {
    private final double value=0.28;
     double Ilsvalue;

     @Override
     public double getIlsValu() {
    double Ilsvalue=value;
    return Ilsvalue;
     }
@Override
     public double calculate(double input, double getIlsValue){
        return input* getIlsValu();

    }
    }
