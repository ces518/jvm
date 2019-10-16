package me.june;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        /* App 클래스를 로드한 클래스로더 */
        ClassLoader classLoader = App.class.getClassLoader();
        /* 애플리케이션 클래스로더 */
        System.out.println(classLoader);
        /* 플랫폼 클래스로더 */
        System.out.println(classLoader.getParent());
        /* 부트스트랩 클래스로더 (네이티브 코드로 되어있기때문에 자바로 참조를 할수 없음)*/
        System.out.println(classLoader.getParent().getParent());
    }
}
