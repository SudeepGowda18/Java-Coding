arr = [1, 2, 3, 4, 5, 5, 4]
n = len(arr)
s = list(set(arr))
if len(s) < 2:
    print (0)
else:
    maxa = s[-2]
    cnt = 0
    for i in range(n):
        if maxa == arr[i]:
            cnt += 1
    print (cnt)