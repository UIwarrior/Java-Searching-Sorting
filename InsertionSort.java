public class InsertionSort
{

    /*

    This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained which is always sorted. For example,
    the lower part of an array is maintained to be sorted. An element which is to be 'insert'ed in this sorted sub-list,
     has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.
     The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same array).
     This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2), where n is the number of items.
     */
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int j = i;

            while (j > 0 && arr[j-1] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1;
            }
        }
    }

    static void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {2, 7, 5, 21, 13};
        sort(arr);
        print(arr);
    }
}