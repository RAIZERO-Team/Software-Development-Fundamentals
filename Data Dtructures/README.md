### Data Structure Topics:

### 1. **Introduction to Data Structures**
   - What are Data Structures?
   - Importance of Data Structures
   - Algorithmic Complexity
      - Time vs Space Complexity
      - How to Calculate Complexity?

      - Asymptotic Notation
        - Big O Notation
        - Big-θ Notation
        - Big-Ω Notation

      - Common Runtimes
        - Constant
        - Logarithmic
        - Linear
        - Polynomial
        - Exponential
        - Factorial

### Linear Data Structures

### 2. **Arrays**

  - **Description:** A collection of elements stored in contiguous memory locations. Each element is accessed using an index.

  - **Key Concepts:**
    - One-dimensional and Multi-dimensional Arrays
    - Dynamic Arrays
    - Array Operations (Insertion, Deletion, Searching, Traversal)
    - Applications of Arrays

### 3. **Linked Lists**
   - **Description:** A sequence of nodes where each node contains data and a reference (or link) to the next node.

   - **Key Concepts:**
      - Singly Linked List
      - Doubly Linked List
      - Circular Linked List
      - Operations on Linked Lists (Insertion, Deletion, Searching, Traversal)
      - Applications of Linked Lists

### 4. **Stacks**
   - **Description:** A collection of elements with Last-In-First-Out (LIFO) access. Elements can only be added or removed from the top of the stack.

   - **Key Concepts:**
      - Concept of LIFO (Last In, First Out)
      - Stack Operations (Push, Pop, Peek)
      - Implementation using Arrays and Linked Lists
      - Applications (Expression Evaluation, Undo Mechanism)

### 5. **Queues**
   - **Description:** A collection of elements with First-In-First-Out (FIFO) access. Elements are added at the rear and removed from the front.

   - **Key Concepts:**
      - Concept of FIFO (First In, First Out)
      - Queue Operations (Enqueue, Dequeue, Front, Rear)
      - Circular Queue
      - Deque (Double-ended Queue)
      - Priority Queue
      - Applications (CPU Scheduling, Print Queue)

### Non-Linear Data Structures

### 6. **Trees**
   - **Description:** A hierarchical data structure consisting of nodes, where each node has a value and a list of references to other nodes (children).

   - **Key Concepts:**
     - **Binary Tree:** A tree where each node has at most two children.
     - **Binary Search Tree (BST):** A binary tree where the left child is less than the parent node, and the right child is greater.
     - **AVL Tree:** A self-balancing binary search tree.
     - **B-Trees:** A self-balancing tree data structure that maintains sorted data and allows searches, sequential access, insertions, and deletions.
     - **Tree Traversals:** In-order, Pre-order, Post-order
     - **Trie:** A tree-like data structure used to store dynamic sets of strings.
     - **Segment Tree:** A tree used for storing information about intervals, or segments, and allows querying which segment a point belongs to.

### 7. **Hashing**
   - **Description:** A data structure that maps keys to values using a hash function. It provides average O(1) time complexity for search, insert, and delete operations.
  
   - **Key Concepts:**
      - Hash Function
      - Collision Handling (Chaining, Open Addressing)
      - Hash Map and Hash Set
      - Applications (Efficient Searching, Caching)

### 8. **Graphs**
   - **Description:** A collection of nodes (vertices) and edges (lines or arcs) that connect pairs of nodes. Graphs can represent many real-world problems.

   - **Key Concepts:**
      - Graph Representation (Adjacency Matrix, Adjacency List)
      - Graph Traversal (BFS, DFS)
      - Directed and Undirected Graphs
      - Weighted and Unweighted Graphs
      - Shortest Path Algorithms (Dijkstra, Bellman-Ford)
      - Minimum Spanning Tree (Kruskal, Prim)
      - Applications (Social Networks, Network Routing)

### 9. **Heaps**
   - **Description:** A specialized tree-based data structure that satisfies the heap property. In a max heap, for any given node I, the value of I is greater than or equal to the values of its children. In a min heap, the value of I is less than or equal to the values of its children.

   - **Key Concepts:**
      - Min Heap and Max Heap
      - Heap Operations (Insertion, Deletion, Heapify)
      - Priority Queue using Heaps
      - Applications (Heap Sort, Priority Scheduling)
