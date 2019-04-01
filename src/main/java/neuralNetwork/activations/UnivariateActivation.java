package neuralNetwork.activations;

import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;

public class UnivariateActivation {

    private UnivariateDifferentiableFunction f;
    private Double[] weigths;

    public Double[] getWeigths() {
        return weigths;
    }

    public void setWeigths(Double[] weigths) {
        this.weigths = weigths;
    }

    public static class Builder{

        private UnivariateDifferentiableFunction f;
        private Double[] weigths;

        public Builder setF(UnivariateDifferentiableFunction f){
            this.f = f;
            return this;
        }

        public Builder setWeigths(Double[] weigths){
            this.weigths = weigths;
            return this;
        }

        public UnivariateActivation build(){
            UnivariateActivation univariateActivation = new UnivariateActivation();
            univariateActivation.f = this.f;
            univariateActivation.weigths = this.weigths;
            return univariateActivation;
        }

    }

    public Double calculate(Double x){
        double value = weigths[0].doubleValue() + weigths[1].doubleValue()*x.doubleValue();
        Double result = f.value(value);
        return result;
    }


}
