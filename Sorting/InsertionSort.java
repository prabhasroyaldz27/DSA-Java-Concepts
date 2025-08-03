import java.util.*;
public class Solution {
    public static void insertionSort(int arr[],int n){
           for(int i=1;i<n;i++){
              int curr=arr[i];
              int prev=i-1;
              while(prev>=0 && arr[prev]>curr){
              arr[prev+1]=arr[prev];
              prev--;
           }
           arr[prev+1]=curr;
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
        insertionSort(arr,n);
        System.out.print("Sorted Array : ");
        printArray(arr,n);
    }
}
