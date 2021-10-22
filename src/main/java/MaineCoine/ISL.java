package MaineCoine;

    class ISL extends Coine {
        private final double value = 0.28;

        @Override
        public double getValue() {
            return value;
        }

        @Override
        void getvalue() {

        }

        @Override
        public double calculate(double imput) {
            return imput * getValue();
        }
    }
