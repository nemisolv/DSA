/**Problem Statement
Write a C++ program to find and print all duplicate numbers in a given list of integers. The program should read the list of integers from the user and then identify and print the numbers that appear more than once.

Input
An integer n representing the number of elements in the list.
A list of n integers.
Output
Print all the numbers that appear more than once in the list.
Example
Given the input:

The output should be:

Constraints
The number of elements n will not exceed 1000.
The elements in the list are integers in the range [0,2^31−1].
Solution
The provided solution initializes an array withoutDup to count the frequency of each number in the list. It then iterates through the list to populate the frequency array and finally iterates through the array to print numbers that appear more than once.
 */

#include<iostream>

using namespace std;
int main() {
    int n; 
    cout << "Enter the numbers: ";
    cin >>n;

    int a[n];
    // range base for loop
    for(int &x: a) cin >>x;

    int withoutDup[n] = {0};

    for(int i = 0; i < n; i++) {
        withoutDup[a[i]]++;
    }

    cout << "Duplicate numbers are: ";
    for(int i = 0; i < n; i++) {
        if(withoutDup[a[i]] > 1) {
            cout << a[i] << " ";
            // to avoid printing the same number again, set the value to 0 -> ignore it
            withoutDup[a[i]] = 0;
        }
    }


    
}