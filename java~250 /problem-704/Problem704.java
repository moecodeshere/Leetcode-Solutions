public int search(int[] nums, int target) {             // O(1) space - just takes references
    int low = 0;                                        // O(1) space - single int
    int high = nums.length - 1;                         // O(1) space - single int
    while(low <= high){                                 // Time: O(log n) - divides search space by 2 each time
        int mid = (low + high) / 2;                     // O(1) space - single int, O(1) time - simple math
        if(nums[mid] == target){                        // O(1) time - single comparison
            return mid;                                 // O(1) time - simple return
        }
        else if(nums[mid] > target){                    // O(1) time - single comparison
            high = mid - 1;                            // O(1) time - simple math and assignment
        }
        else if(nums[mid] < target){                    // O(1) time - single comparison
            low = mid + 1;                             // O(1) time - simple math and assignment
        }
    }
    return -1;                                          // O(1) time - simple return
}