package Merge_Sort;

public class MergeSort {     
  public static int[] arr;
  public static int[] tmp;

  public static void main(String[] args) {
      arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
      tmp = new int[arr.length];
      printArray(arr);
      mergeSort(0, arr.length-1);
      printArray(arr);
  }

  public static void mergeSort(int start, int end) {
      if (start<end) {
          int mid = (start+end) / 2;
          mergeSort(start, mid);
          mergeSort(mid+1, end);
          int p = start;
          int q = mid + 1;
          int idx = p;          

          while (p<=mid || q<=end) {
              if (q>end || (p<=mid && arr[p]<arr[q])) {
                  tmp[idx++] = arr[p++];
              } else {
                  tmp[idx++] = arr[q++];
              }
          }

          for (int i=start;i<=end;i++) {
              arr[i]=tmp[i];
          }
      }
  }

  public static void printArray(int[] a) {
      for (int i=0;i<a.length;i++)
          System.out.print(a[i]+" ");
      System.out.println();
  }
}