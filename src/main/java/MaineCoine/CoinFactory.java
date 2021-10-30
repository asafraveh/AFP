package MaineCoine;
public class CoinFactory {

    public static Coin getConilnstance(Coins coins) {
        switch (coins) {
            case ILS:
                return new ILS() {
                    public double getUsdValu() {
                        return 0;
                    }

                    public double getEurvalue() {
                        return 0;
                    }

                    public double IlsValu() {
                        return Ilsvalue;

                    }
                };
            case EUR:
                return new EUR() {
                    @Override
                    protected double getEurValu() {
                        return Eurvalue;
                    }

                    @Override
                    public double getUsdValu() {
                        return 0;
                    }

                    @Override
                    public double getIlsValu() {
                        return 0;

                    }
                };
            case USD:
                return new USD() {
                    public double UsdValu() {
                        return Usdvalue();
                    }

                    public double getIlsValu() {
                        return 0;
                    }

                    public double getEurvalue() {
                        return 0;
                    }


                };
        }
        return null;

    }

    private static double Usdvalue() {
        return Usdvalue();
    }
}