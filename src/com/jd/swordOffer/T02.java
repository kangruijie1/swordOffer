package com.jd.swordOffer;
/*
请实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
public class T02 {
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
    public static String replaceSpace(StringBuffer str) {
        int zeroCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                zeroCount++;
            }
        }
        int oldIndex = str.length() - 1;
        int newIndex = oldIndex + zeroCount * 2;
        str.setLength(newIndex + 1);
        for(int i = oldIndex; i > -1; i--){
            if(str.charAt(i) == ' '){
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }
            else{
                str.setCharAt(newIndex--, str.charAt(i));
            }
        }
        return str.toString();
    }
}
