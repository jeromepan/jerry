package sorting;

public class insertionSort {

    public static void insertionSort(int[]list){
        for (int i = 1; i<list.length; i++){
            int currentElement = list[i];
            int k;
            for (k = i -1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+i ] = currentElement;
        }
    }

    public static void bubblesort(int []list){
        for(int k = 1; k<list.length; k++){
            for(int i =1; i<list.length-k; i++){
                if(list[i] > list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
    }
    public static void main(String []args){
    }
}
