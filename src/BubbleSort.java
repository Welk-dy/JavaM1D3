public class BubbleSort {
    // Method to perform bubble sort on an array
    public void sort(int[] bubArray) {
        int n = bubArray.length;
        for (int i = 0; i < n - 1; i++) { // Loop for each pass
            for (int j = 0; j < n - i - 1; j++) { // Compare adjacent elements
                if (bubArray[j] > bubArray[j + 1]) { // Swap if the element is greater
                    // Swap arr[j] and arr[j+1]
                    int temp = bubArray[j];
                    bubArray[j] = bubArray[j + 1];
                    bubArray[j + 1] = temp;
                }
            }
        }
    }
}