
public class Triangle {

    public static void main(String[] args) {
        //三角形の各辺の長さを格納するint型の変数a, b, c　値は自由に設定
        int a = 4;
        int b = 4;
        int c = 5;

        if (a==b && b==c) {
            System.out.println("三角形abcは正三角形です");
        }else if(a==b || b==c || c==a) {
            System.out.println("三角形abcは二等辺三角形です");
        }else {
            System.out.println("三角形abcはただの三角形です");
        }

    }

}
