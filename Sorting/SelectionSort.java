import java.util.*;
public class Solution {
    public static void selectionSort(int arr[],int n){
           for(int i=0;i<n-1;i++){
              int mp=i;
              for(int j=i+1;j<n;j++){
                  if(arr[j]<arr[mp]){
                    mp=j;
                  }
              }
              int temp=arr[i];
              arr[i]=arr[mp];
              arr[mp]=temp;
           }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        printArray(arr,n);
        selectionSort(arr,n);
        System.out.print("Sorted Array : ");
        printArray(arr,n);
    }
}
