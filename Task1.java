  /**
   * Task1
   */
  public class Task1 {
  
    public static void main(String[] args) {
        
    }
  }
  
  private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }