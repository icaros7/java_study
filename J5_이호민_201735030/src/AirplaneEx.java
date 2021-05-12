/*
    이름 : 이호민
    학번 : 201735030
    문제 : J5

*/

public class AirplaneEx {
    public static void main(String[] args) {
        Airliner airliner1 = new Airliner("A100");
        airliner1.showInfo();
        System.out.println();

        Airliner airliner2 = new Airliner("A200", 500);
        airliner2.showInfo();
        System.out.println();

        Fighter fighter1 = new Fighter("F300");
        fighter1.showInfo();
        System.out.println();

        Fighter fighter2 = new Fighter("F400", true);
        fighter2.showInfo();
    }
}
