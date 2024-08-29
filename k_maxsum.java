import java.util.*;
class k_maxsum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        System.out.println ("Enter the number of elements as k");
        int k=in.nextInt();
        int f=0,l=k-1,sum=0,s=0;
        for(int i=0;i<n-1;i++)
        {   
            for(int j=i;j<i+k;j++)
                sum+=a[j];
            s=s>=sum?s:sum;
            sum=0;
        }
        System.out.println("Maximum sum="+s);
    }
}