// **Arrays**

// - **Description:**
// A collection of elements stored in contiguous memory locations.
//Each element is accessed using an index.

// - **Key Concepts:**
void main() {
// - One-dimensional
  List<int> oneArray = [1, 2, 3, 4, 5];
  print('One Array:$oneArray'); // Time Complexity:O(1)

// - Multi-dimensional Arrays
  List<List<int>> multiArray = [
    [1, 2, 3],
    [20, 30, 40]
  ];
  print('Multi Array:$multiArray'); // Time Complexity:O(1)

// - Dynamic Arrays
  List<dynamic> dynamicArray = [1, 2.5, 3.896, 4, 5.1, 0, 'basmala'];
  print('Dynamic Array:$dynamicArray'); // Time Complexity: O(1)

// - Array Operations
// -Insertion
  List<int> array = [1, 2, 3, 4, 5];
  array.insert(2, 100);
  print('Insertion:$array'); // Time Complexity:O(n)

// -Deletion
  array.removeAt(3);
  print('Deletion:$array'); // Time Complexity:O(n)

// -Traversal
  for (int i = 0; i < array.length; i++) {
    print('Traversal:${array[i]}'); // Time Complexity:O(n)
  }

// -Searching
  List<int> numbers = [22, 9, 7, 3, 10, 2];
  print(numbers);

  // Linear Search
  int findNumberLinear(List<int> numbers, int number) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == number) {
        return i;
      }
    }
    return -1;
  }

  print('Linear: ${findNumberLinear(numbers, 7)}'); // Time Complexity:O(n)

  // Binary Search
  int findNumberBinary(List<int> numbers, int number) {
    int left = 0;
    int right = numbers.length - 1;

    while (left <= right) {
      int mid = left + (right - left) ~/ 2;

      if (numbers[mid] == number) {
        return mid;
      } else if (numbers[mid] < number) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
  numbers.sort();
  print('Binary: ${findNumberBinary(numbers, 10)}'); // Time Complexity:O(log n)

  // - Applications of Arrays
  // - Sorting
  numbers.sort();
  print('Sorted:$numbers'); //Time Complixty:O(n log n)
}
