/*
    이름 : 이호민
    학번 : 201735030
    문제 : J4

 */

import java.util.Scanner;

public class AirplaneEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Airplane[] planes = new Airplane[3];
        System.out.println("[비행기 정보 입력]");
        for (int i = 0; i < planes.length; i++){
            String[] input = new String[3];
            System.out.print("비행기 모델 : ");
            input[0] = sc.nextLine();
            System.out.print("비행기 회사 : ");
            input[1] = sc.nextLine();
            System.out.print("탑승 인원수 : ");
            input[2] = sc.nextLine();
            planes[i] = new Airplane(input[0], input[1], Integer.parseInt(input[2]));
            System.out.println();
        }

        System.out.println("[주입할 연료 및 비행할 거리 입력]");
        for (Airplane plane : planes) {
            double[] input = new double[2];
            System.out.print(plane.getModel() + "(" + plane.getCompany() + ") 주입할 연료 : ");
            input[0] = sc.nextDouble();
            System.out.print(plane.getModel() + "(" + plane.getCompany() + ") 비행할 거리 : ");
            input[1] = sc.nextDouble();

            plane.flight(input[0], input[1]);
        }

        System.out.println("[비행기 정보 출력]");
        for (Airplane plane : planes){
            plane.showAirplane();
        }

        System.out.println("[누적 승객 인원수 정보 출력]");
        System.out.println("누적 승객 인원수 : " + Airplane.getAccNumber() + "명");
    }
}
