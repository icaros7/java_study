/*
    이름 : 이호민
    학번 : 201735030
    문제 : J6

*/
package airplane;

public class AirplaneEx {
    public static void main(String[] args) {
        Airliner airliner1 = new Airliner("A100", 300);
        airliner1.showInfo();
        System.out.println();

        airliner1.takeOff();
        airliner1.flight();
        airliner1.landing();
        System.out.println();

        Fighter fighter1 = new Fighter("F300");
        fighter1.showInfo();
        System.out.println();

        fighter1.loadWeapon();
        fighter1.takeOff();
        fighter1.flight();
        fighter1.selectWeapon();
        fighter1.landing();
    }
}