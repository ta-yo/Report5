package jp.ac.uryukyu.ie.e165753;

public class Main {

    public static void main (String[] args){
        String str = "3．14" ;
        try {
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが発生!");
            e.printStackTrace();
        }
        double value = Double.parseDouble(str);
    }
}