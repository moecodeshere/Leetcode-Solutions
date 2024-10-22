Binary Search is an efficient searching algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search space in half.
Key Features

Works only on sorted arrays
Time Complexity: O(log n)
Space Complexity: O(1)
Returns index of target element (-1 if not found)

Algorithm Steps

Initialize two pointers:

low at start of array
high at end of array


While low <= high:

Find middle element mid = (low + high) / 2
If target found at mid → return mid
If target > mid element → search right half
If target < mid element → search left half


If element not found, return -1

Code Example
javaCopypublic int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    
    while(low <= high) {
        int mid = (low + high) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}
Complexity Analysis

Time: O(log n)

Search space halves each iteration
n elements → log₂(n) steps


Space: O(1)

Only uses three variables regardless of input size



Common Pitfalls

Using on unsorted array
Incorrect calculation of mid point
Wrong comparison operators in while loop
Incorrect updating of low/high bounds

Use Cases

Searching in large sorted datasets
Dictionary/Phone book lookups
Finding insertion points
Base for more complex algorithms

Advantages

Very efficient for large datasets
Predictable performance
Minimal space requirements