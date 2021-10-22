package MaineCoine;

class USD extends Coine{
    private final double value=3.52;
            @Override
    public double getValue(){
        return value;
            }

    @Override
    public double getValu() {
        return 0;
    }

    @Override
    public double calculate(double imput){
        return imput* getValue();
    }


}
