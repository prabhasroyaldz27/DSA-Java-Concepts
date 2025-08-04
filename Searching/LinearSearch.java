import java.util.*;
class Solution {
    public static int linearSearch(int arr[],int n,int key){
           for(int i=0;i<n;i++){
              if(arr[i]==key){
                return i;
              }
           }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int idx=linearSearch(arr,n,key);
        if(idx!=-1){
            System.out.print(key+" is at index "+idx);
        }else{
            System.out.print(key+" is not present in the array");
        }
    }
}
