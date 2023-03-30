import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String s) {
        String[] strArray = s.split(" ");
        int[] arrayInt = new int[strArray.length];

		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Integer.parseInt(strArray[i]);
		}

        Arrays.sort(arrayInt);
        //arrayInt[0] 최소값
        //arrayInt[arrayInt.length - 1] 최대값
        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

        return result;
    }


    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
