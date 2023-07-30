import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main 
{
    static double average(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.println("The total sum of all the numbers is: "+sum);
        return (double)sum / n;
    }
     
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n; 
        System.out.println("Enter how many numbers there are in total: ");
        n=sc.nextInt(); 
        
        int arr[] = new int[n];   
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++)      
        {
            arr[i]=sc.nextInt();
        }
     
        System.out.println("The average of all the numbers is: "+average(arr, n));
    }
}