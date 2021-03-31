/*
    이름 : 이호민
    학번 : 201735030
    문제 : J2_1

    사용자로부터 x, y, z 3개 정수 입력 받아, 다음 문제 해결
    - x부터 y까지 z의 배수에 속하는 수들의 합
    - x부터 y까지 z의 배수를 제외한 수들의 합
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class J2_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] _input = new int[3]; // 0 = 시작, 1 = 종료, 2 = 배수

        try {
            System.out.print("시작 : ");
            _input[0] = sc.nextInt();
            System.out.print("종료 : ");
            _input[1] = sc.nextInt();
            System.out.print("배수 : ");
            _input[2] = sc.nextInt();
        }
        catch (InputMismatchException e){
            callExit("정수만 입력 가능");
        }
        catch (Exception e){
            callExit(e.toString());
        }
        finally {
            if ((_input[1] - _input[0]) <= 0 || _input[2] == 0) {
                callExit("입력 값 오류");
            }
        }

        int sumMulti = 0;
        int sumNormal = 0;
        for (int i = _input[0]; i <= _input[1]; i++){
            if (i % _input[2] == 0){
                sumMulti += i;
            }
            else{
                sumNormal += i;
            }
        }

        System.out.println( _input[0] + "부터 " + _input[1] + "까지 " + _input[2] + "의 배수에 속하는 수들의 합: " + sumMulti);
        System.out.println( _input[0] + "부터 " + _input[1] + "까지 " + _input[2] + "의 배수를 제외한 수들의 합: " + sumNormal);
    }

    private static void callExit(String str){

        System.out.println("정상적이지 않은 값 : " + str);
        System.exit(1);

    }
}
