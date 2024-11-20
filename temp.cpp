#include <iostream>
#include <string>

using namespace std;



// Hàm giải mã bằng thuật toán Caesar
string decryptCaesar(string cipherText, int key) {
    string plainText = "";
    for (char c : cipherText) {
        // Giải mã ký tự
        if (isalpha(c)) {
            char offset = islower(c) ? 'a' : 'A';
            plainText += (c - offset - key + 26) % 26 + offset;
        } else {
            plainText += c; // Giữ nguyên ký tự không phải chữ cái
        }
    }
    return plainText;
}

int main() {
    string cipherText;
    cout << "Nhap chuoi cipher text: ";
    getline(cin, cipherText);

    // Thử tất cả các khóa từ 1 đến 25
    for (int key = 1; key < 26; key++) {
        string decryptedText = decryptCaesar(cipherText, key);
        cout << "Khoa K = " << key << ": " << decryptedText << endl;
    }

    return 0;
}
