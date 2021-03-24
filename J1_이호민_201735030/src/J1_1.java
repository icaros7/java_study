/*
    이름 : 이호민
    학번 : 201735030
    문제 : J1_1

    Scanner 객체를 이용하여 이름과 한국 나이 계산을 위한 생년을 입력 받아 출력
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class J1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String _name = sc.nextLine(); // 이름을 입력 받아 _name 에 저장

        int _born; // 생년 저장용 int 생성
        while (true){
            System.out.print("생년 : ");
            _born = sc.nextInt();
            if (2021 >= _born) { break; }
            System.out.println("올바르지 않은 나이 입니다. 다시 입력 해 주세요!");
        } // 2021 이하 값을 받기 위한 반복문

        System.out.println("이름은 " + _name + "이고 나이는 " + (2021 - _born + 1) + "입니다.");
    }
}
