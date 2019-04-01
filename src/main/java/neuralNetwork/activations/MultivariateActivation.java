package neuralNetwork.activations;

import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;

public class MultivariateActivation {

    private UnivariateDifferentiableFunction f;
    private Double[] weigths;

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

        public MultivariateActivation build(){
            MultivariateActivation multivariateActivation = new MultivariateActivation();
            multivariateActivation.f = this.f;
            multivariateActivation.weigths = this.weigths;
            return multivariateActivation;
        }

    }

    public Double calculate(Double[] x){

        double value = weigths[0].doubleValue();

        for(int i=1; i<weigths.length; i++){
            value = value + weigths[i].doubleValue()*x[i-1].doubleValue();
        }

        Double result = f.value(value);
        return result;
    }

}
