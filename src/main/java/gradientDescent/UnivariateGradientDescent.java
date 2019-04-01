package gradientDescent;

import neuralNetwork.activations.UnivariateActivation;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;

public class UnivariateGradientDescent {

    private UnivariateActivation activation;
    private Double[] weigths;
    private Double[] xi;
    private Double[] yi;
    private Double epsilon;
    private Double tolerance;
    private UnivariateFunction df;

    public static class Builder{

        private UnivariateActivation activation;
        private Double[] weigths;
        private Double[] xi;
        private Double[] yi;
        private Double epsilon;
        private Double tolerance;

        public Builder setWeights(Double[] weights){
            this.weigths = weights;
            return this;
        }

        public Builder setXi(Double[] xi){
            this.xi = xi;
            return this;
        }

        public Builder setYi(Double[] yi){
            this.yi = yi;
            return this;
        }

        public Builder setActivation(UnivariateActivation activation){
            this.activation = activation;
            return this;
        }

        public Builder setEpsilon(Double epsilon){
            this.epsilon = epsilon;
            return this;
        }

        public Builder setTolerance(Double tolerance){
            this.tolerance = tolerance;
            return this;
        }

        public UnivariateGradientDescent build(){
            UnivariateGradientDescent gradientDescent = new UnivariateGradientDescent();
            gradientDescent.activation = this.activation;
            gradientDescent.weigths = this.weigths;
            gradientDescent.xi = this.xi;
            gradientDescent.yi = this.yi;
            gradientDescent.tolerance = this.tolerance;
            return gradientDescent;
        }

    }

    public void compute(){

        Double tol = 10.0; ///juste en attendant

        while(tol>tolerance){

            for(int i=0; i<this.weigths.length; i++){
                weigths[i] = weigths[i] + this.epsilon;
            }

        }

    }
}
