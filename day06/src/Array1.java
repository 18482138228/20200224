public class Array1 {
    public static void main(String[] args) {
        int []a = new int[5];
        a[0] = (int) (Math.random()*100);
        a[1] = (int) (Math.random()*100);
        a[2] = (int) (Math.random()*100);
        a[3] = (int) (Math.random()*100);
        a[4] = (int) (Math.random()*100);
        int min = a[0];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i]<=min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
