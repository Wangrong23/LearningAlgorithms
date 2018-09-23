public class StandardIO{
    //打印n个（lo,hi）之间的随机值
    public static void main(String[] args) {
        // String in = args[0];
        int n = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i=0;i<n;i++){
            double out = Math.random()*(hi-lo)+lo;
            System.out.printf("%.2f\n",out);
        }
    }
}