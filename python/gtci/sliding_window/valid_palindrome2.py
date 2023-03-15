def is_palindrome(s):
    left = 0
    right = len(s) - 1
    while left < right:
        if s[left] != s[right]:
            skipL, skipR = s[l + 1:r + 1], s[l:r]
            return (skipL == skipL[::-1] or skipR == skipR[::-1])

    return True
