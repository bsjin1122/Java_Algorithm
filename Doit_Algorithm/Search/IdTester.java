package Doit_Algorithm.Search;

class Id{
    private static int counter = 0; // 클래스
    private int id;

    //생성자
    public Id(){id = ++counter;}

    public int getId(){return id;}

    //counter를 반환하는 클래스 메서드
    public static int getCounter(){return counter;}

}
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디1
        Id b = new Id(); // 아이디2
        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());
        System.out.print("부여한 아이디의 개수 :" + Id.getCounter());
    }
}
