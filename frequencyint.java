public class Main {
    public static void main(String[] args) {
        int[] a = {1, 5, 5, 4, 1, 4, 9}; 
        int n = a.length;              

        for (int i = 0; i < n; i++) {
            int count = 0;             
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {     
                    count++;
                }
            }
            System.out.println(a[i] + " = " + count);
        }
    }
}
