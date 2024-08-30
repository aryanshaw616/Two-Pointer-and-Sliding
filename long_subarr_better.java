import java.util.*;
public class long_subarr_better {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        System.out.println ("Enter the sum less or equals k");
        int k=in.nextInt();
        int l=0,r=0,s=0,max=0;
        while(r<n)
        {
            s+=a[r];
            if(s>k)
            {
                s-=a[l];
                l++;
            }
            else
            max=Math.max(max,r-l+1);
            r++;
        }
        System.out.println("Length of max subarray="+max);
    }
}
