#include<iostream>
using namespace std;

// monoalphabetic cipher (encryption)
string monoalphabeticCipher(string plainText, string key) {
    string cipherText = "";
    for(int i = 0; i < plainText.length(); i++) {
        int index = plainText[i] - 'a';
        cipherText += key[index];
    }
    cout << "Cipher text: " << cipherText << endl;
    return cipherText;
}

// decryption
string monoalphabeticDecipher(string cipherText, string key) {
    string plainText = "";
    for(int i = 0; i < cipherText.length(); i++) {
        int index = key.find(cipherText[i]);
        plainText += 'a' + index;
    }
    cout << "Plain text: " << plainText << endl;
    return plainText;
}


int main() {
    string plainText;
    cout << "Enter the plain text: ";
    getline(cin, plainText);
    string key;
    cout << "Enter the key: ";
    getline(cin, key);
    string cipher = monoalphabeticCipher(plainText, key);
    monoalphabeticDecipher(cipher, key);
    return 0;
}