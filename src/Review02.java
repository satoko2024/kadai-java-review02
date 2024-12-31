
public class Review02 {

    public static void main(String[] args) {

        //繰り返し条件（numが100までの間）
        for (int num = 1; num < 101; num++) {

            // if 5と3で割り切れるなら
            if ( num % 5 == 0 && num % 3 == 0 ) {
            // FizzBuzz と表示する
            System.out.println("FizzBuzz");

            } else if (num % 3 == 0) {
                System.out.println("Fizz");

            } else if (num % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(num);
            }

        }

    }

}
