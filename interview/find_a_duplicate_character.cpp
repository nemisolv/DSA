/**
 * Write a C++ program to find and print all duplicate characters in a given string along with their frequencies. The program should consider all characters, including spaces and punctuation, and should be case-sensitive.

Input
A string s which can contain any characters including spaces and punctuation.
Output
For each character that appears more than once in the string, print the character and its frequency.
Example
Given the string:

The output should be:

Constraints
The string can contain any printable ASCII characters.
The length of the string will not exceed 1000 characters.
Solution
The provided solution initializes an array d of size 126 to count the frequency of each character in the string. It then iterates through the string to populate the frequency array and finally iterates through the array to print characters that appear more than once.
 * 
 */



#include<iostream>
using namespace std;



//v1
int d[126];

int main() {

    string s = "Hello World";

    for(int i = 0;i < s.size();i++) {
        d[s[i]]++;
    }

    for(int i=0; i < 126;i++) {
        if(d[i] >1) {
            cout << (char)i << " " << d[i] << endl;
        }
    }

}