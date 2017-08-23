import java.math.BigDecimal;

/**
 * Created by benaissa on 8/22/17.
 */
public class Main {
    public static void main(String [] args)
    {
        double value =.012;
        double pSum=value+value+value;
        System.out.printf("Sum of primitives: "+pSum+"\n");
        String strValue= Double.toString(value);
        System.out.printf("strValue: "+strValue+"\n");

        BigDecimal bigValue=new BigDecimal(strValue);
        BigDecimal bigSum=bigValue.add(bigValue).add(bigValue);
        System.out.printf("Sum of big decimals "+ bigSum.toString()+"\n");

    }

}
