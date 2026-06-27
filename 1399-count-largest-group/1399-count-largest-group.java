class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {

            int sum = 0;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int max = 0;

        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        // Count how many groups have the maximum size
        int ans = 0;

        for (int freq : map.values()) {
            if (freq == max) {
                ans++;
            }
        }

        return ans;
    }
}