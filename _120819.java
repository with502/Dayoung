public class _120819 {
    public int[] solution(int money) {
            int[] answer = new int[2];

            answer[0] = money/5500;
            answer[1] = money % 5500;

            return answer;
     }

    public static void main(String[] args) {
        System.out.println(new _120819().solution(new int[]{15000})); // 무슨 값을 넣어야 하나....
    }
}

