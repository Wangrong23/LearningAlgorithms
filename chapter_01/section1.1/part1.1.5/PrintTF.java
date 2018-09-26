public class PrintTF{
    public static void main(String[] args) {
        //如果x和y的值都在0与1之间打印“true”，否则打印“false”
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        System.out.println((x>0&&x<1)&&(y>0&&y<1));
    }
}