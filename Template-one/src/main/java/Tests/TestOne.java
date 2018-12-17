package Tests;

public class TestOne {
    public static void main(String[] args) {
        System.out.println(new Forest.Builder().setName("张三").setAge(12).setSex("男").get());
    }
}
