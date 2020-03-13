public class Foreach {
    public static void main(String[] args){
        int []a = new int[]{1,-1,4,5,7};
        int min = a[0];
        for (int a1:a
             ) {
            if(a1<min){
                min = a1;
            }
        }
        System.out.println(min);
    }
}
