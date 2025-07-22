public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is less than next element,
            // then peak lies on the right half
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Else, the peak is at mid or on the left half
                right = mid;
            }
        }

        // At the end, left == right will point to the peak element
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element is: " + nums[peakIndex]);
    }
}
