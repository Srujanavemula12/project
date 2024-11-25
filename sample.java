public class Prime {
    public static void main(String[] args) {
        int num = 29, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        System.out.println(count == 2 ? "Prime" : "Not Prime");
    }
}
