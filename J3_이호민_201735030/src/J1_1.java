/*
    이름 : 이호민
    학번 : 201735030
    문제 : J3_1

    Airplane 클래스는 비행기 번호, 비행기 회사, 최대 승객수를 나타내는 세 개의 필드를 갖는다.
    Account 클래스는 main() 메소드 이외에 아래의 메소드를 갖고, 매개변수 이름은 필드 이름과 동일하게 설정한다.
        setModel(): 비행기 모델을 설정하는 메소드
        setCompany(): 비행기 회사를 설정하는 메소드
        setNumber(): 최대 승객수를 설정하는 메소드
        getModel(): 비행기 모델을 반환하는 메소드
        getCompany(): 비행기 회사를 반환하는 메소드
        getNumber(): 최대 승객수를 반환하는 메소드
        showAirplane(): 위에 정의한 메소드를 활용하여 비행기 번호, 비행기 회사, 최대 승객수 정보를 출력하는 메소드
    Airplane 클래스는 아래와 같이 세 개의 생성자를 갖는다.
        Airplane(): 비행기 모델과 비행기 회사를 빈 문자열("")로, 최대 승객수를 0으로 초기화하는 생성자
        Airplane(String model, String company): 비행기 모델을 model로, 비행기 회사를 company로 초기화하는 생성자
        Airplane(String model, String company, int number): 비행기 모델을 model로, 비행기 회사를 company로, 최대 승객수를 number로 초기화하는 생성자
    Airplane 클래스로부터 아래 세 개의 비행기 객체를 생성하고 showAirplane() 메소드로 비행기 정보를 출력한다.
        plane1 객체: Airplane() 생성자를 호출하여 생성
        plane2 객체: Airplane(String model, String company) 생성자를 호출하여 생성
        plane3 객체: Airplane(String model, String company, int number) 생성자를 호출하여 생성

 */

public class J1_1 {
    private static class Airplane{
        int number;
        String model;
        String company;

        public Airplane(){
            this.number = 0;
            this.model = "";
            this.company = "";
        }

        public Airplane(String model, String company){
            this.number = 0;
            this.model = model;
            this.company = company;
        }

        public Airplane(String model, String company,int number){
            this.number = number;
            this.model = model;
            this.company = company;
        }

        void showAirplane(){
            System.out.println("비행기 번호 : " + getModel());
            System.out.println("비행기 회사 : " + getCompany());
            System.out.println("최대 승객 수 : " + getNumber() + "\n");
        }

        void setNumber(int number){ this.number = number; }

        void setModel(String model){ this.model = model; }

        void setCompany(String company){ this.company = company; }

        int getNumber(){ return this.number; }

        String getModel(){ return this.model; }

        String getCompany(){ return this.company; }
    }

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("K300", "코리아나");
        Airplane plane3 = new Airplane("S200", "성공회에어", 500);

        plane1.setModel("A100");
        plane1.setCompany("아시아나");
        plane1.setNumber(300);

        plane2.setNumber(400);

        plane1.showAirplane();
        plane2.showAirplane();
        plane3.showAirplane();
    }
}
