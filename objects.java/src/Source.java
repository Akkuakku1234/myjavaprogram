import java.util.Scanner;
class Source{
    public static int sum(int n){
        //write the logic here
        if(n!=0){
            System.out.println(sum(n-1));
        return(n+sum(n-1));}
        else
            return n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = Source.sum(n);
           System.out.print("the value is"+value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}