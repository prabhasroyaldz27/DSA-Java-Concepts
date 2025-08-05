import java.util.*;
class Solution {
    public static int binarySearch(int arr[],int n,int key){
            int si=0;
            int ei=n-1;
            while(si<=ei){
                int mid=si+(ei-si)/2;
                if(arr[mid]==key){
                    return mid;
                }else if(key<arr[mid]){
                      ei=mid-1;
                }else{
                     si=mid+1;
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
        int idx=binarySearch(arr,n,key);
        if(idx!=-1){
            System.out.print(key+" is at index "+idx);
        }else{
            System.out.print(key+" is not present in the array");
        }
    }
}
