public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Gümüş");
        car1.setModel("Renault Megane");
        car1.setEngine(1.6);
        car1.setDoors(4);

        System.out.println("Arabanın Rengi:" + car1.getColor());
        System.out.println("Arabanın Modeli:" + car1.getModel());
        System.out.println("Arabanın Motor Hacmi" + car1.getEngine());
        System.out.println("Arabanın Kapı Sayısı:" + car1.getDoors());
        car1.start();

    }
}