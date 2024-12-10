### Changing i = 1
When i = 1, it make the function fail there are 3 functions fails
1. testAvarageNormalCase()
- Expected: 2
- Acutal: 1
4. TestAverageEqualLength()
- Expected: 2
- Acutal: 1
3. TestAverageExceedsArraySize()
- Expected: 15
- Acutal: 10

The reason for this failure is becauseh when i = 1, the array skip the first element (array starts from 0).
To fix this we need to make i = 1
