interface Suahil {
    public void call();
}

class Java implements Suahil {
    public void call() {
        System.out.println("you can call");
    }

    public static void main(String[] args) {
        Java myCall = new Java();
        myCall.call();
    }
}
