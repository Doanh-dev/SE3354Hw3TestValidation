### a. Write a bref functional description for the function. 
- The avarage function calculate the avarage of the array give the k elements
-  The function will find the min between k and the array length
-  if the k is is less than or equal to zero, the list is empty
-  if k is greater than the length of the array, the funciton considers only to the size of the array

### b. Identify and specify the partitions and generate partition test cases.
Functional Test Case: 
- Input: k = 3, array = [1,2,3,4,5]
- Expected Output: 2
- Reason: The funciton calculates the first 3 elemnts the sum is = 6 and the avarage is 6/3 =2
### c. Generate functional test case based on functional description.

Partition 1: k is less than or equal to 0
- Input: k = -1, array = [1,2,3,4,5]
- Expected Output: 0
- Reason: K is less than 0 so the avarage will be 0

Partition 2: k is more than the array length
- Input: k = 10, array = [1,2,3,4,5]
- Expected Output: 3
- Reason: k is greater tha nthe length of the list. The function should consider
the whole element in the array. The sum is 15 and the avarage is 15/5 = 3

Partition 3: k is in the range the array
- Input: k = 3, array = [1,2,3,4,5]
- Expected Output: 2
- Reason: k is within the length of the list. The function should consider the first 3 element
the sum is 6 and the avarage is 2

### d. Generate boundary value test cases.
1. Boundary 1: k = 0, array = [1,2,3,4,5]
- Expected output: 0
- Reason: since the k= 0 it doens't meet the conditon to the for loop, therefore, the avarage return 0
2. Boundary 2: k = 1, array = [1,2,3,4,5]
- Expected output: 1
- Reason: since k= 1 the for loop only iterate the first element
3. Boundary 3: k = 5, array = [1,2,3,4,5]
- Expected output: 3
- Reason: Since k = 5 it will iterate whole elements in the array. That will give the sum to 15 and 15/5 is 3
4. Boundary 4: k = 10, array = [1,2,3,4,5]
- Expected output: 3
- Reason: Since k = 5 the min value will be the length of the array, therefore it produce the results same as the boundary 3. 


