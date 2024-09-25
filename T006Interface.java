public interface T006Interface {
    abstract void run();
    abstract String animalSound();
}


class Main2 implements T006Interface {
    public void run() {
        System.out.println("I'm running man");
    }

    public String animalSound() {
        return "Woof woof!";
    }


    public static void main(String[] args) {
        Main2 myMain = new Main2();
        myMain.run();
        System.out.println(myMain.animalSound());
    }
}