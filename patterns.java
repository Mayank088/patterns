package partern;

public class patterns {

    public static void p1(){
        for (int i=0 ; i<5 ; i++){
            for (int j=0 ; j<5 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p2(){
        for (int i=1 ; i<=5 ; i++){
            for (int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p3(){
        for (int i=1 ; i<=5 ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void p4(int n){
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n-i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p5(int n){
        for (int i=0; i<n ; i++){
            for (int j=1 ; j<=n-i ; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void p6(int n){
        for (int i=0 ;i<n ; i++)
        {
            for (int j=0 ; j<n-i ; j++)
            {
                System.out.print(" ");
            }
            for (int j=0 ; j<(2*i)+1 ; j++)
            {
                System.out.print("*");
            }
            for (int j=0 ; j<n-i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void p7(int n){
        for (int i=0 ; i<n ; i++)
        {

            for (int j=0 ; j<i ; j++)
            {
                System.out.print(" ");
            }

            for (int j=0 ; j<(2*n)-(2*i+1) ; j++)
            {
                System.out.print("*");
            }

            for (int j=0 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void p8(int n){
        for (int i=1 ; i<=2*n-1 ; i++)
        {
            int star = i;
            if (i>n) star = (2*n-i);
            for (int j=1 ; j<=star ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    public static void p9(int n){
        int k=1;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<i+1 ; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");
        }
    }
    public static void p10(int n){
        int start;
        for (int i=0 ; i<n ; i++)
        {
            if (i%2==0) start=1;
            else start = 0;
            for (int j=0 ; j<=i ; j++)
            {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println(" ");
        }
    }
    public static void p11(int n){
        for (int i=1 ; i<=n ;i++)
        {
            for (int j=1 ; j<=i ; j++)
            {
                System.out.print(j);
            }
            for (int j=1 ; j<(2*n)-2*i ; j++)
            {
                System.out.print(" ");
            }
            for (int j=i ; j>=1 ; j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void p12(int n){
        for (int i=0 ; i<n ; i++){
            for (char c='A' ; c <='A'+i ; c++){
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
    public static void p13(int n){
        for (int i=0 ; i<n ; i++)
        {
            for (char c='A' ; c<'A'+(n-i) ; c++)
            {
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
    public static void p14(int n){
        for (int i=0 ; i<n ; i++)
        {
            char ch = (char) ('A'+i);
            for (char j=0 ; j<=i; j++)
            {
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
    public static void p15(int n)   {
        for (int i=0 ; i<n ; i++)
        {
            for (int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j=0 ; j<2*i+1 ; j++)
            {
                System.out.print(c);
                if (j<breakPoint) c++;
                else c--;
            }
            for (int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void p16(int n){
        for (int i=0 ; i<n ; i++)
        {
           for (char c = (char) ('E'-i); c<='E' ; c++){
               System.out.print(c);
           }
            System.out.println(" ");
        }
    }
    public static void p17(int n){
        for (int i=0 ; i<n ; i++)
        {
            for (int j=0 ; j<=n-i-1 ; j++){
                System.out.print("*");
            }
            for (int j=0; j<2*i ; j++){
                System.out.print(" ");
            }
            for (int j=0 ; j<=n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0 ; i<n ; i++)
        {
            for (int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            for (int j=0 ; j<(2*n)-(2*i)-2 ; j++)
            {
                System.out.print(" ");
            }
            for (int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p18(int n){
        for (int i=0 ; i<n-1 ; i++)
        {
            for (int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            for (int j=0 ; j<(2*n)-(2*i)-2 ; j++)
            {
                System.out.print(" ");
            }
            for (int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0 ; i<n ; i++)
        {
            for (int j=0 ; j<=n-i-1 ; j++){
                System.out.print("*");
            }
            for (int j=0; j<2*i ; j++){
                System.out.print(" ");
            }
            for (int j=0 ; j<=n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p19(int n){
        for (int i=0 ; i<n ; i++)
        {
            String star;
            for (int j=0 ; j<n ; j++)
            {
                if (i==0 || j==0  || i == n-1 || j==n-1) star = "*";
                else star = " ";
                System.out.print(star);
            }
            System.out.println(" ");
        }
    }

    public static void p20(int n){

    }

    public static void main(String[] args) {
        p1();
        System.out.println("---------------------");
        p2();
        System.out.println("---------------------");
        p3();
        System.out.println("---------------------");
        p4(5);
        System.out.println("---------------------");
        p5(5);
        System.out.println("---------------------");
        p6(5);
        System.out.println("---------------------");
        p7(5);
        System.out.println("---------------------");
        p6(5);
        p7(5);
        System.out.println("---------------------");
        p8(5);
        System.out.println("---------------------");
        p9(5);
        System.out.println("---------------------");
        p10(5);
        System.out.println("---------------------");
        p11(4);
        System.out.println("---------------------");
        p12(5);
        System.out.println("---------------------");
        p13(5);
        System.out.println("---------------------");
        p14(5);
        System.out.println("---------------------");
        p15(4);
        System.out.println("---------------------");
        p16(5);
        System.out.println("---------------------");
        p17(5);
        System.out.println("---------------------");
        p18(5);
        System.out.println("---------------------");
        p19(4);
        System.out.println("---------------------");
        p20(4);

    }
}
