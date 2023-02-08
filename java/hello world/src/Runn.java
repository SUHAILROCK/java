class Encp {
    private String name;
    private int age;
    private String language;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getlanguage() {
        return language;
    }

    public void setlanguage(String language) {
        this.language = language;
    }
}

public class Runn {
    public static void main(String[] args) {
        Encp e = new Encp();
        e.setname("suhail");
        e.setage(20);
        e.setlanguage("java");
        System.out.println("this is name:" + " " + e.getname());
        System.out.println("this is my age:" + " " + e.getage());
        System.out.println("this is programing language:" + " " + e.getlanguage());
    }
}
