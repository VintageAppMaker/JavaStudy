package 첫날;

// 문자열은 +로 연결해서 붙여서 만들 수도 있다.
// 아쉽게도 -같은 개념은 없다.
// ""안에 "를 넣으려면 \"와 같은 식으로 표기해주어야 한다.
public class if문예제3 {
    public static void main(String[] args) {
        String firstname   = "박";
        String Secondtname = "제임스";
        String fullname    = "제임스박";

        if (fullname == "제임스박"){
            System.out.println("fullname == \"제임스박\"이 맞습니다");
        } else {
            System.out.println("fullname == \"제임스박\"이 틀리다고요?");
        }

        if (fullname.equals("제임스박")){
            System.out.println("fullname == \"제임스박\"이 맞습니다");
        } else {
            System.out.println("fullname == \"제임스박\"이 틀리다고요?");
        }

    }
}
