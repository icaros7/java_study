/*
    이름 : 이호민
    학번 : 201735030
    문제 : J2_2

    사용자로부터 돈의 액수를 입력받아 50000원, 10000원, 1000원, 500원, 100원, 10원, 1원 단위로 각각 몇 개씩 환산되는 지 계산
    만일 해당되는 화폐 단위를 사용하지 않을 경우 출력하지 않도록 한다.
    환산할 돈의 단위는 1차원 배열을 이용 및 반복문을 활용하여 작성한다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class J2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int _input = 0;
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        try{
            System.out.print("금액을 입력하시오 : ");
            _input = sc.nextInt();
        }
        catch (InputMismatchException e){
            callExit("Int 범위 내 정수만 입력 가능");
        }
        catch (Exception e){
            callExit(e.toString());
        }
        finally {
            if (_input <= 0){
                callExit("입력 값이 0 이하");
            }
        }

        for (int i : unit) {
            int tmp = _input / i;
            if (tmp > 0) {
                System.out.println(i + "원짜리 : " + tmp + "개");
                _input -= i * tmp;
            }
        }

    }

    private static void callExit(String str){
        System.out.println("정상적이지 않은 값 : " + str);
        System.exit(1);
    }

}
