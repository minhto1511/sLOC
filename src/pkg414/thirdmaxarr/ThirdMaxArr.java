/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg414.thirdmaxarr;

import java.util.Arrays;

/**
 *
 * @author minht
 */
public class ThirdMaxArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = {2, 3, 3};
        Solution solution = new Solution();
        int max = solution.thirdMax(nums);
        System.out.println(max);

    }

}

class Solution {

    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer num : nums) {
            if (num.equals(third) || num.equals(second)
                    || num.equals(first)) {
                continue;
            }
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }
        return third == null ? first : third;
    }
        public int thirdMax(int[] nums) {
        Arrays.sort(nums); // Sắp xếp mảng tăng dần
        int distinctCount = 1; // Đếm giá trị duy nhất
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                return nums[i];
            }
        }
        // Nếu không đủ 3 giá trị duy nhất, trả về giá trị thứ hai
        return nums[nums.length - 1];
    }
}
