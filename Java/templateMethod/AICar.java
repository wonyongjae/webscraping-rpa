package design_pattern.templateMethod;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");

    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");

    }

    @Override
    public void washCar() {
        System.out.println("자동으로 새차합니다.");
    }

}
