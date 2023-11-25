package freestyle;

public class HeapSort {

    public static void main(String[] args) {
        var arr1 = new int [] {5, 9, 1, 0, 1, 2};
        var arr2 = new int [] {234, 64, 23, 54, 876, 90, 12, 13, 45, 76, 21, 90};
        heapSort(arr1);
        printArray(arr1);
        heapSort(arr2);
        printArray(arr2);
    }

    private static void heapSort(int [] heap){
        if (heap.length <= 1) {
            return;
        }
        var mid = heap.length / 2;
        var arrA = new int [mid];
        var arrB = new int [heap.length - mid];
        for(int i = 0; i < mid; i++){
            arrA[i] = heap[i];
        }
        for(int i = mid; i < heap.length; i++){
            arrB[i - mid] = heap[i];
        }
        heapSort(arrA);
        heapSort(arrB);
        var heapIndex = 0;
        var indexA = 0;
        var indexB = 0;

        while(heapIndex < heap.length){
            if (indexA >= arrA.length){
                heap[heapIndex] = arrB[indexB];
                indexB++;
            } else if (indexB >= arrB.length){
                heap[heapIndex] = arrA[indexA];
                indexA++;
            } else if (arrA[indexA] > arrB[indexB]){
                heap[heapIndex] = arrB[indexB];
                    indexB++;
            } else {
                heap[heapIndex] = arrA[indexA];
                    indexA++;
            }
            heapIndex++;
        }
    }

    private static void printArray (int [] arr){
        var sb = new StringBuffer();
        sb.append('[');
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (i < arr.length - 1){
                sb.append(", ");
            }
        }
        sb.append(']');
        System.out.println(sb);
    }

}
