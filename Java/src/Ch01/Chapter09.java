package Ch01;

public class Chapter09 {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "test";
        // var는 추론해 줌

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "hello";
        // str = 3; [불가능하다] 데이터값에 맞게 써야함

    }
}
