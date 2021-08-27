package learning;

import vocabulary.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class readSaveFile {

    static LinkedList<Word> vocabSet;

    public static Word generateWord(String line) {
        String [] data = line.split("\\n");
        if (data[0].equalsIgnoreCase("FRE")) {
            French myWord = new French(data[1], data[2], Integer.valueOf(data[3]), Integer.valueOf(data[4]), data[5], data[6]);
            return myWord;
        } else { // the only case remaining is when Language code is KOR
            Korean myWord = new Korean(data[1], data[2], Integer.valueOf(data[3]), Integer.valueOf(data[4]), data[5]);
            return myWord;
        }
    }

    public static void readFile(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String thisLine = myScanner.nextLine();
                Word newWord = generateWord(thisLine);
                vocabSet.add(newWord);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}