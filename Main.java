public class a {
public static void m(int[] arr) {
int t;
for (int i=0;i<arr.length;i++){
for (int j=0;j<arr.length-1;j++){if (arr[j]>arr[j+1]){ t=arr[j+1];arr[j+1]=arr[j];arr[j]=t;}}}}}
