public class Arry {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

#two sum 
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}


public class MaxValue {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int max = findMax(arr);
        System.out.println("Maximum value: " + max);
    }
}


public class total{
    public static int totalsum(int[] arr){
        int sum = 0;
        for(int num : arr){ 
            sum += num;
        }
        return sum; 
    }
}

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int result = totalsum (arr);
        System.out.println("Total sum: " + result);
    }
}



public class PlayerStats {
    public static void main(String[] args) {
        String playerName = "Virat Kohli";
        int[] scores = {135, 102, 65};
        
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        
        double average = (double) total / scores.length;
        
        System.out.println("Player: " + playerName);
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
    }
}
