public class AverageValue{
    public static void main(String[] args) {
        double len = args.length;
        double sum = 0;
        for(int i=0;i<len;i++){
            double in = Double.parseDouble(args[i]);
            sum = sum+in;
        }
        double average = sum/len;
        System.out.printf("%.3f\n", average, args);
    }
}