import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2}, {2,3}, {3,1}};
        int ans = solution(arr);
        System.out.println(ans);
    }

    public static int solution(int[][] boxes) {
        int answer = 0;

        Arrays.sort(boxes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
                return Integer.compare(o1[0], o2[0]);
            }
        });
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        for(int i = 0 ; i< boxes.length; i++) {
            if(!list.contains(boxes[i][0]))
                list.add(boxes[i][0]);
            else {
                cnt++;
                list.remove((Integer)boxes[i][0]);
            }

            if(!list.contains(boxes[i][1]))
                list.add(boxes[i][1]);
            else {
                cnt++;
                list.remove((Integer)boxes[i][1]);
            }
        }

        answer = boxes.length - cnt;
        return answer;
    }
}
