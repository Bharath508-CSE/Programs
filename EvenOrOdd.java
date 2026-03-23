//Tricky question Evene or Odd
public class EvenOrOdd {

    public static void main(String[] args) {
        int number = 5; // You can change this number to test with different values

<<<<<<< HEAD
        // if ((number & 1)== 0) {
        //     System.out.println(number + " is Odd.");
        // } else {
        //     System.out.println(number + " is Even.");
        // }

        if(isEven(number))
        {
            System.out.println("Is Even");
        }
        else
        {
            System.out.println("Is Odd");
        }
    }
    static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
=======
        if ((number & 1)== 0) {   //Here i used Bitwise and operator if both bits are equal it will return 1 other wise it will return 0
            System.out.println(number + " is Odd.");
        } else {
            System.out.println(number + " is Even.");
        }
    }
}
>>>>>>> 81795ee399b0684dd51a8135bf357c7d0ec33d9f
