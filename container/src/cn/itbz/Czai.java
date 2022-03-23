package cn.itbz;

public class Czai {
    int id;
    int name;
    int password;

    public Czai(int id, int name, int password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


public static void main(String[] args) {
    Czai czai = new Czai(12, 214, 12334);
    czai.id = 21;
    System.out.println(czai.id);
    System.gc();
    }

}