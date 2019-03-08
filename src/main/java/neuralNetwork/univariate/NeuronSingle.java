package neuralNetwork.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;

public class NeuronSingle {

    private Double noise;
    private Double x;
    private Double omegaNoise;
    private Double omegaX;
    private UnivariateFunction activation;

    private Double result;

    public Double getResult() {
        return result;
    }

    public static class Builder{

        private Double[] xValues;
        private UnivariateFunction activation;

        public Builder setXValues(Double[] xValues){
            this.xValues = xValues;
            return this;
        }

        public Builder setActivation(UnivariateFunction activation){
            this.activation = activation;
            return this;
        }

        public NeuronSingle build(){
            NeuronSingle neuron = new NeuronSingle();
            return neuron;
        }

    }

}
