import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game {
    boolean isEnd;
    String title;
    Category category;
    String lettersFailed;
    char[] searchedLetters;
    int liveCount;
    String searchedWord;
    String actualLetter;

    public Game(){
        liveCount = 5;
        isEnd = false;
        lettersFailed = "";
    }

    public void play(){
        System.out.println("==============================\nWelcome to Hangman game!\nGame was created by Alicja Polanowska & Marcin Małek\n==============================\n");
        chooseCategory();
        getWord();
        getTitle();
        do {
            System.out.println("==============================");
            System.out.println("Title: " + title);
            System.out.println("Live count: " + liveCount);
            showLetters();
            getLetter();
            checkLetter();
            System.out.println("==============================");
            if(liveCount == 0){
                System.out.println("YOU LOSE..");
                System.out.println("Correct answer: "+searchedWord);
                return;
            }
            checkIfEnd();
        }while(!isEnd);
        System.out.println("==============================");
        System.out.println("Title: " + title);
        System.out.println("Live count: " + liveCount);
        showLetters();
        System.out.println("==============================");
        System.out.println("YOU WIN!");
        System.out.println("==============================");
    }

    void chooseCategory(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Choose category:\nFruits(1)\nWegetables(2)\nAnimals(3)");
            choice = sc.nextLine();
        }
        while(!Arrays.asList(new String[]{"1", "2", "3"}).contains(choice));
        switch(choice.charAt(0)){
            case '1': category = new Fruits();
                break;
            case '2': category = new Wegetables();
                break;
            case '3': category = new Animals();
                break;
            default:
                break;
        }
    }

    void getTitle(){
        title = category.getCategory();
    }

    void getWord() {
        searchedWord = category.randObject();
        searchedLetters = new char[searchedWord.length()];
        Arrays.fill(searchedLetters, '_');
    }

    void getLetter(){
        Scanner sc = new Scanner(System.in);
        String letter;
        do {
            letter = sc.nextLine();
        }while(letter.length() != 1);
        actualLetter = letter;
    }

    boolean checkLetter(){
        if(searchedWord.contains(actualLetter)){
            if(!Arrays.asList(searchedLetters).contains(actualLetter)){
                for(int index = searchedWord.indexOf(actualLetter); index >= 0; index = searchedWord.indexOf(actualLetter, index +1) ){
                    searchedLetters[index] = actualLetter.charAt(0);
                }
                return true;
            }else{
                liveCount --;
                return false;
            }
        }
        lettersFailed += actualLetter;
        liveCount --;
        return false;
    }

    void showLetters() {
        System.out.println("failed letters: ");
        for (int i=0; i< lettersFailed.length(); i++) {
            System.out.print(lettersFailed.charAt(i) + ", ");
        }
        System.out.println();
        for (int i=0; i< searchedWord.length(); i++) {
            System.out.print(searchedLetters[i]+" ");
        }
        System.out.println();
    }

    void checkIfEnd(){
        if(String.valueOf(searchedLetters).equals(searchedWord)){
            isEnd = true;
        }
    }

    void printWin(){

    }

    void PrintFail(){

    }
}
