package MaineCoine;

class EUR extends Coine{
    private final double value=4.23;
    @Override
    public double getValue(){
        return value;
    }

    @Override
    void getvalue() {

    }

    @Override
    public double calculate(double imput){
        return imput* getValue();
}
}