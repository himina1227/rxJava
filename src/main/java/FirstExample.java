import io.reactivex.rxjava3.core.Observable;

/**
 * Hot Observable과  Cold Observable의  개념 이해
 * 스케줄러의 의미를 배우고 subscribeOn()과 observeOn()함수의 차이 이해
 */
public class FirstExample {

    public void emit() {
        Observable.just("Hello", "RxJava 3!!")
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FirstExample demo = new FirstExample();
        demo.emit();
    }
}