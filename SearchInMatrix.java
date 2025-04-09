import java.util.Scanner;

public class SearchInMatrix {
    public static boolean search(int[][] matrix,int target){
        int row=matrix.length;
        int column=matrix[0].length;

        int left=0;
        int right=row*column - 1;

        while(left<=right){
            int mid=(left+right)/2;

            int i=mid / column;
            int j=mid % column;

            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] matrix=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();

        if(search(matrix,target)){
            System.out.println("Target found in matrix");
        }
        else{
            System.out.println("No target found in matrix");
        }
    }
}
