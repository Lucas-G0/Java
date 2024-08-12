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

    public int getValuesSum(int i) {
        return valuesSum[i];
    }

    public int getValuesMult(int i) {
        return valuesMult[i];
    }

    public int[] calcValuesSum(){
        int[] sum = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            sum[i] = values[i] + values[values.length - i];
        }

        return sum;
    }

//    public int[] calcValuesMult(){
//        int[] valuesMult = new int[]{this.value1 * this.value2, this.value1 * this.value3,
//                this.value1 * this.value4, this.value2 * this.value3,
//                this.value2 * this.value4, this.value3 * this.value4};
//        return valuesMult;
//    }
}
