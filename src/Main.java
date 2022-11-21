import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public  class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");



        String mainString = scanner.nextLine();
        char[] charArr = mainString.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> indexList =new ArrayList<>();
        ArrayList<String> words =new ArrayList<>();
        String tempForStr = "";


        for(char c : charArr){
        if(Character.isDigit(c)){
        charList.add(c);
        }else if(!Character.isLetter(c)){
        if(Character.isSpaceChar(c)){}
        else{
        charList.add(c);}
        }


        }

        for(int i = 0; i < charList.size(); i++)
        {
        int g = mainString.indexOf(charList.get(i));
        indexList.add(g);
        }
        String[] stringArr = mainString.split(" ");
        for(String t : stringArr){
        words.add(t);
        }

        char[] deleteNum = mainString.toCharArray();
        StringBuffer mainStringBuffer =new StringBuffer();
        for(char t : deleteNum){
        if(Character.isLowerCase(t)){
        if(Character.isLetter('t'))
        {
        mainStringBuffer.append(t);
        }

        else{

        }
        }else if(Character.isLetter(t)){

        mainStringBuffer.append(t);
        }else if(Character.isSpaceChar(t)) {
        mainStringBuffer.append(t);
        }

        }


//       System.out.println(mainStringBuffer);
//        System.out.println(indexList);
//        System.out.println(charList);

        String tempString = mainStringBuffer.toString();
        String[] tempStringArr = tempString.split(" ");
        mainStringBuffer.delete(0, 1000);
        for(String s : tempStringArr){
        mainStringBuffer.append(s);
        mainStringBuffer.reverse();
        tempForStr = tempForStr + mainStringBuffer + " ";
        mainStringBuffer.delete(0, 5);


        }
        char[] tempCharArr2 = tempForStr.toCharArray();
        List<char[]> asList = Arrays.asList(tempCharArr2); // because this DOES compile.

        List<Character> listC =new ArrayList<Character>();
        for(char c : tempCharArr2) {
        listC.add(c);
        }

        for(int i = 0; i < indexList.size(); i++){
        listC.add(indexList.get(i), charList.get(i));
        }

        StringBuffer result =new StringBuffer();

        for(int i = 0; i < listC.size(); i++){
        result.append(listC.get(i));
        }
        System.out.println(result);









        }
        }







