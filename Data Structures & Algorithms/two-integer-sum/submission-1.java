public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] a = Arrays.copyOf(nums, nums.length);

        Arrays.sort(a);

        int l = 0, r = a.length - 1;

        while (l < r) {
            int sum = a[l] + a[r];

            if (sum == target)
                break;
            else if (sum > target)
                r--;
            else
                l++;
        }

        int x = a[l];
        int y = a[r];

        int[] ans = new int[2];

        if (x == y) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == x) {
                    ans[count++] = i;
                    if (count == 2)
                        break;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == x) {
                    ans[0] = i;
                    break;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == y) {
                    ans[1] = i;
                    break;
                }
            }
        }

        if (ans[0] > ans[1]) {
            int temp = ans[0];
            ans[0] = ans[1];
            ans[1] = temp;
        }

        return ans;
    }
}