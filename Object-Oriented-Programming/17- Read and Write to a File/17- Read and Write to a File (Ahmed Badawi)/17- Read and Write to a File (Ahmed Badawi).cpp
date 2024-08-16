#include <iostream>
#include <fstream>
#include <string>
using namespace std;

ofstream file("./input.txt");

void createFile(){
  if (file.is_open()) {
      file << "Hello, world!\n";
      // file.close();
      cout << "File created successfully." << endl;
  } else {
      cerr << "Failed to create the file." << endl;
  }
}

void readFromFile(){
  string line;
  ifstream myfile("./input.txt");
  if (myfile.is_open())
  {
    while ( getline (myfile,line) )
    {
      cout << line << '\n';
    }
    myfile.close();
  }

  else cout << "Unable to open file";
}

void writeInFile(){
  if (file.is_open())
  {
    file << "This is a new line.\n";
    file.close();
    cout << "Insert new line Successfully." << endl;
  }
  else cout << "Unable to open file";
}

int main(){
  createFile();
  writeInFile();
  readFromFile();
  return 0;
}