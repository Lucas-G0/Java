package Exc004;

public class Values {
    private int[] values;
    private int[] valuesSum;
    private int[] valuesMult;

    public void setValuesMult(int[] valuesMult) {
        this.valuesMult = valuesMult;
    }

    public void setValuesSum(int[] valuesSum) {
        this.valuesSum = valuesSum;
    }

   public void setValues(int[] values) {
        this.values = values;
   }

   public int[] getValues() {
        return values;
   }

    public int[] getValuesSum() {
        return valuesSum;
    }

    public int[] getValuesMult() {
        return valuesMult;
    }

    public int[] calcValuesSum(){
        int[] sum = new int[6];
        int cont = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length; j++){
                sum[cont] = values[i] + values[j];
                cont++;
            }
        }

        return sum;
    }

    public int[] calcValuesMult(){
        int[] mult = new int[6];
        int cont = 0;

        for (int i =0; i< values.length; i++){
            for (int j = i+1; j < values.length; j++){
                mult[cont] = values[i] * values[j];
                cont++;
            }
        }

        return mult;
    }
}
