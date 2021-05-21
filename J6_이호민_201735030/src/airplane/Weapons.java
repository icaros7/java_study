/*
    이름 : 이호민
    학번 : 201735030
    문제 : J6

*/
package airplane;

public interface Weapons {
    // 사용 가능한 무기 배열
    String[] weaponsList = { "미사일", "레이저", "폭탄" };

    // 무기 장착 메서드
    void loadWeapon();

    // 사용 가능한 무기 출력 메서드
    void showWeapon();

    // 무기 선택 메서드
    void selectWeapon();
}
