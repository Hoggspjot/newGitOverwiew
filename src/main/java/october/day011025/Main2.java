package october.day011025;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.trim();
        String[] strings = str.split(" +");
        StringBuilder sb = new StringBuilder(strings[0]);
        String checkWord = strings[0];
        char lastChar = checkWord.charAt(checkWord.length() - 1);

        for (int i = 1; i < strings.length; i++) {
            for (int j = 1; j < strings.length; j++) {
                if (lastChar == strings[j].charAt(0)) {
                    sb.append(" ").append(strings[j]);
                    checkWord = strings[j];
                }
            }
            lastChar = checkWord.charAt(checkWord.length() - 1);
        }
        System.out.println(sb);
    }
}


// if (checkWord.charAt(checkWord.length() - 1) == strings[i].charAt(0)) {
//        sb.append(" ").append(strings[i]);
//checkWord = strings[i];
//        }


//        char[] firstChars = new char[strings.length-1];
//        char[] lastChars = new char[strings.length];
//        for (int i = 1; i < strings.length; i++) {
//            firstChars[i-1] = strings[i].charAt(0);
//        }
//        System.out.println(Arrays.toString(firstChars));
//        for (int i = 0; i < strings.length; i++) {
//            lastChars[i] = strings[i].charAt(strings[i].length()-1);
//        }
//        System.out.println(Arrays.toString(lastChars));
//

//  for (int i = 1; i < strings.length + 1; i++) {
//char lastChar = strings[i - 1].charAt(strings[i - 1].length() - 1);
//            System.out.print(lastChar + " ");
//            for (int j = 1; j < strings.length; j++) {
//char firstChar = strings[j].charAt(0);
//                System.out.print(firstChar+ " ");
//                if (lastChar == firstChar) {
//        System.out.println(strings[j]);
//                    break;
//                            }
//                            }
//                            System.out.println();
//        }