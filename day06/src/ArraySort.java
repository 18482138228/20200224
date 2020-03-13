public class ArraySort {
    public static void main(String[] args) {
        int []a = new int[]{1,3,5,6,4,2};
        for (int i=0;i<a.length;i++){
            for (int j=a.length-1;j>i;j--){
                if(a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
