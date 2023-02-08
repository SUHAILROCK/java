public class Co {
    private int number;
    private int date;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Co obj = new Co();

        obj.setNumber(10);
        obj.setDate(4);

        System.out.println("Number: " + obj.getNumber());
        System.out.println("Date: " + obj.getDate());
    }
}
