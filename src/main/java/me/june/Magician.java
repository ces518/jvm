package me.june;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 16/10/2019
 * Time: 10:33 오후
 **/
public class Magician {

    public static void main(String[] args) {

        /* 이 둘은 동시에 사용될 수 없다.
            ByteBuddy로 전작업을 미리한뒤 pullOut메소드를 실행해야한다.
            ASM을 내부적으로 사용한다.
        * */
        try {
            // ByteBuddy를 사용해 Hat 클래스를 재 정의한다.
            new ByteBuddy().redefine(Hat.class)
                    // pullOut 메소드를 가르채어 Rabbit이라는 값을 리턴하도록 변경한다.
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit"))
                    // 해당 파일을 target/classes 하위로 지정한다. (해당 클래스의 패키지 경로를 따라가기 때문에 me.june은 생략한다.)
                    .make().saveIn(new File("/Users/june/jvm/target/classes"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 아무것도 출력되지 않는다. */
//        System.out.println(new Hat().pullOut());
    }
}
