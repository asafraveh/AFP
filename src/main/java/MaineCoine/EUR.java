package MaineCoine;


    abstract class EUR extends Coin {
        private final double value = 4.23;
        double Eurvalue;

        @Override
        public double getEurvalue() {
            double Eurvalue = value;
            return Eurvalue;
        }

        @Override
        public double calculate(double input, double getEurValu) {
            return input * getEurValu();
        }

        protected abstract double getEurValu();
    }
