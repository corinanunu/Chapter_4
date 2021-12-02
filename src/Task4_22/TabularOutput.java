package Task4_22;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N    10*N    100*N    1000*N");
        for(int i = 1; i<=5; i++){
            System.out.printf("%d    %d      %d      %d", i, i*10, i*100, i*1000);
            System.out.println();
        }
    }
}