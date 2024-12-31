
public class SevenNumber {

    public static void main(String[] args) {
        // 1から100までの数値を順番に出力する
        for( int i = 1; i < 101; i++) {
            //iの値が7で割り切れるとき
            if(i % 7 == 0) {
                //数字の代わりに「clap!」の文字を入れる
                System.out.println("clap!");

            }else {
                System.out.println(i);
            }
        }

    }

}
