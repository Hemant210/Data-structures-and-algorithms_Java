class Solution:
    def rotate(self, matrix):
        """
        Rotate the input matrix by 90 degrees clockwise in-place.
        :type matrix: List[List[int]]
        :rtype: None. The matrix is modified in place.
        """
        n = len(matrix)
        
        # Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for i in range(n):
            for j in range(i + 1, n):  # Only swap the elements above the diagonal
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        
        # Step 2: Reverse each row
        for i in range(n):
            matrix[i].reverse()

# Example usage
sol = Solution()

# Example 1
matrix1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
sol.rotate(matrix1)
print("Output:", matrix1)  # Output: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

# Example 2
matrix2 = [[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]]
sol.rotate(matrix2)
print("Output:", matrix2)  # Output: [[15, 13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7, 10, 11]]
