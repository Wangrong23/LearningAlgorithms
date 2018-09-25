public class Equal{
    public static void main(String[] args) {
        //三个整数相等打印”equal“，不相等打印”not equal“
        if(Integer.parseInt(args[0])==Integer.parseInt(args[1])&&Integer.parseInt(args[1])==Integer.parseInt(args[2])){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
    }
}