/*
    이름 : 이호민
    학번 : 201735030
    문제 : J4

 */

class Airplane {
    // Code from J3
    private String model;
    private String company;
    private int number;

    private final double fuel_avg = 36.5;
    private double fuel = 0.0;
    private double milege = 0.0;
    private static int accNumber = 0;

    // Code from J3
    void setNumber(int number) { this.number = number; }
    void setModel(String model) { this.model = model; }
    void setCompany(String company) { this.company = company; }
    int getNumber() { return this.number; }
    String getModel() { return this.model; }
    String getCompany() { return this.company; }

    static int getAccNumber() { return accNumber; }
    void addFuel(double fuel) { this.fuel += fuel; }
    double getFuel() { return this.fuel; }
    double getMilege() { return this.milege; }

    void showAirplane(){
        System.out.println("비행기 번호 : " + getModel());
        System.out.println("비행기 회사 : " + getCompany());
        System.out.println("탑승 인원수 : " + getNumber());
        System.out.println("총 비행거리 : " + getMilege());
        System.out.println("현재 연료량 : " + getFuel() + "L\n");
    }

    void flight(double inputFuel, double distance){
        addFuel(inputFuel);
        if ((getFuel() / this.fuel_avg) > distance){
            System.out.println("비행 가능\n");

            accNumber += this.number;
            milege += distance;
            this.fuel -= (distance * this.fuel_avg);
        }
        else { System.out.println("비행 불가\n"); }
    }

    public Airplane(String model, String company, int number){
        this.model = model;
        this.company = company;
        this.number = number;
    }
}
