class Solution(object):
    def reverse(self, x):
        sign = -1 if x < 0 else 1
        x_abs = abs(x)
        reversed_x = int(str(x_abs)[::-1])
        result = sign * reversed_x

        # Check for 32-bit signed integer overflow
        if result < -2**31 or result > 2**31 - 1:
            return 0
        return result
