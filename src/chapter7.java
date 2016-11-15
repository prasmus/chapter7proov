/**
 * Created by opilane on 15.11.2016.
 */
/*public class chapter7 {
    public static void main(String[] args) {
        countDown(10);
    }
    public static void countDown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }
}
*/



/*public class chapter7 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            printrow();
            i++;
        }//while
        System.out.println();
    }//main
    public static void printrow(int n, int tulbad){
        int i = 1;
        while (i <= tulbad) {
        System.out.printf("%4d", n * i);
        i = i + 1;
    }//while
        System.out.println();}
}//end of class
*/
public class chapter7 {
    public static void main(String[] args) {
    printTable();
    }
    public static void printRow(int n, int tulbad) {
        int i = 1;
        while (i <= tulbad) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
        public static void printTable(int read) {
            int i = 1;
            while (i <= read) {
                printRida(i, read);
                i++;
            }//while
            System.out.println();
        }//printTable
        public static void printRidafor(int n, int tulbad){
            for(int i = 1;i <= tulbad;i=i+1){
                System.out.printf("%4d", n * i);
                i = i + 1;
            }//for
            System.out.println();
        }
        public static void printRidaDo(int n, int tulbad){
            int i = 1;//ALGVÄÄRTUS
            do{
                System.out.printf("%4d", n * i); //TSÜKLISISU
                i++;
            } while(i <= tulbad);//TINGIMUS
        }
    }
