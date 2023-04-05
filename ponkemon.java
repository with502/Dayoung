
import java.util.HashSet;

// 전달 받은 포켓몬 리스트에서 가져갈 수 있는 최대 포켓몬 수를 계산 n/2
// 전달 받은 포켓몬 리스트에서 고유한 종류의 포켓몬이 몇마리인지 계산
// 최대 포켓몬 수 < 고유한 포켓몬 종류 수 ==> 최대 포켓몬 수 반환
// 최대 포켓몬 수 > 고유한 포켓몬 종류 수 ==> 고유의 수 반환

public class ponkemon {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;

        // 중복을 제거하기 위해 해시셋에 넣기
        HashSet set = new HashSet();

        for(int i : nums) {
            set.add(i);
        }

        // 두 값중 최소값을 리턴
        if(set.size() > max) {
            answer = max;
        }
        else {
            answer = set.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new ponkemon().solution(new int[]{3,1,2,3}));
    }
}