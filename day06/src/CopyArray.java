public class CopyArray {
    public static void main(String[] args){
        int []a = {1,4,6,9,0,1};
        int []b = new int[3];
        System.arraycopy(a,3,b,0,3);
        for (int b_each:b
             ) {
            System.out.println(b_each);

        }

    }
}
