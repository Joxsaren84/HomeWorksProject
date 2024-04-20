package ru.Iam.palindrome;

public class Palindrome {

    static boolean isPalindrome(String string){

        StringBuilder stb = new StringBuilder();

        for(char c : string.toCharArray()){
            if(Character.isLetter(c)){
                stb.append(Character.toLowerCase(c)); //собираем строку только из букав в маленьком регистре
            }
            /* На случай если цифры тоже учитываем
            if(Character.isDigit(c)){
                stb.append(c);
            }
            */
        }

        return stb.toString().equals(stb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Haha/[](876%%% Hah!  "));
    }
}
