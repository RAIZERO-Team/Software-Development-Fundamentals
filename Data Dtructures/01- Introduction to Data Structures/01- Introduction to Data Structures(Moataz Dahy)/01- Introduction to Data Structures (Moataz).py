'''_______________________Moata Dahy___________________________ '''
# Example : 
i = 0  # O(1)
n = int(input()) # O(1)

# First loop
for i in range(n):  # O(n)
    print(i)  # O(1)

# Second loop
for j in range(n):  # O(n)
    for k in range(n):  # O(n)
        print(j + k)  # O(1)

# Time complexity:
# The first loop runs `n` times: O(n)
# The second nested loop runs `n` * `n` = O(n^2) times.
# Total time complexity = O(1 + n + n^2) = O(n^2)
