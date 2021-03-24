/*
    이름 : 이호민
    학번 : 201735030
    문제 : J1_2

    Scanner 객체를 이용하여 세 개의 실수를 입력 받아, if~else 를 사용하여 가장 작은 실수 출력
 */

import java.util.Scanner;

public class J1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] arg = new double[3]; // 세 실수를 받을 배열 생성
        for (int i = 0; i < 3; i++){
            System.out.print((i + 1) + "번째 실수를 입력 : ");
            arg[i] = sc.nextDouble();
        }

        double min;
        if (arg[0] < arg[1]){ // 1, 2번째 실수를 비교 후 3번째 실수와 비교
            min = (arg[0] < arg[2]) ? arg[0] : arg[2];
        }
        else {
            min = (arg[1] < arg[2]) ? arg[1] : arg[2];

        }

        System.out.println("세 실수 중 가장 작은 수는 " + min + " 입니다.");
    }
}
