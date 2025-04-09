import java.util.Scanner;

public class PeakElement {
    public static int peakElement(int[] arr){
        int left=1;
        int right=arr.length-2;

        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                right=mid-1;
            }
            else{   // arr[mid] > arr[mid-1]
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Peak element: "+peakElement(arr));
    }
}
