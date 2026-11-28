import java.util.*;

public class Binary_to_decimal {

    public int binaryToDecimal(String b) {
        int decimal = 0;

        for (int i = 0; i < b.length(); i++) {
            int digit = b.charAt(i) - '0';
            decimal = decimal * 2 + digit;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Binary_to_decimal obj = new Binary_to_decimal();

        System.out.println(obj.binaryToDecimal("1011"));
    }
}