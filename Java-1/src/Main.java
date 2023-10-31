
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int i,j,k=0;
    Scanner userNumber = new Scanner(System.in);
    j = userNumber.nextInt();
    for (i=1 ; i <j;i++){
        if (j%i == 0){
            k +=i;
        }


    }
    if (k == j){
        System.out.println(k+"is perfect number");
    }else System.out.println("number is not perfect ");
    userNumber.close();
    }
}