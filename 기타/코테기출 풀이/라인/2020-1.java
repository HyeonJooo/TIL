import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,2,9,13,24};
        int[] ord = {9,2,13,24,11};
        int[] ans = solution(arr, ord);
        for(int i =0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solution(int[] ball, int[] order) {
        int[] answer = new int[ball.length];
        ArrayList<Integer> wait = new ArrayList<>();
        int left = 0;
        int right = ball.length-1;
        int idx = 0;

        for(int i = 0 ; i<ball.length; i++) {
            int num = order[i];

            while(true) { //왼쪽이나 오른쪽 공이 보류에 있으면 뺌
                if(wait.contains(ball[left])) {
                    answer[idx] = ball[left];
                    wait.remove((Integer) ball[left]);
                    left++;
                    idx++;
                }

                else if(wait.contains(ball[right])) {
                    answer[idx] = ball[right];
                    wait.remove((Integer) ball[right]);
                    right--;
                    idx++;
                }

                else
                    break;
            }

            if(ball[left] == num) { //왼쪽에 있으면 왼쪽에서 뻄
                answer[idx] = num;
                left++;
                idx++;
            }
            else if(ball[right] == num) { //오른쪽에 있으면 오른쪽에서 뺌
                answer[idx] = num;
                right--;
                idx++;
            }

            else { //사이에 있으면 보류
                wait.add(num);
            }
        }
        return answer;
    }
}
