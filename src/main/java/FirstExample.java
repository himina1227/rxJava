import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Hot Observable과  Cold Observable의  개념 이해
 * -> Hot Observable 은 국독한 시점부터 Observable에서 발행한 값을 받으며, Cold Observable은 구독하면 준비된 데이터를 처음부터 발행.
 * 스케줄러의 의미를 배우고 subscribeOn()과 observeOn()함수의 차이 이해
 */
public class FirstExample {

    public void emit() {
//        Observable.just("Hello", "RxJava 3!!")
//                .subscribe(System.out::println);
//        Observable<Integer> source = Observable.create(
//                (ObservableEmitter<Integer> emitter) -> {
//                    emitter.onNext(100);
//                    emitter.onNext(200);
//                    emitter.onNext(300);
//                    emitter.onComplete();
//                }
//        );
//        source.subscribe(System.out::println);
//        Integer[] arr = {100, 200, 300};
//        Observable<Integer> source = Observable.fromArray(arr);
//        source.subscribe(System.out::println);
//        Set<String> cities = new HashSet<>();
//        cities.add("Seoul");
//        cities.add("London");
//        cities.add("Paris");
//
//        Observable<String> source = Observable.fromIterable(cities);

//        Callable<String> callable = () -> {
//            Thread.sleep(100);
//            return "Hello Callable";
//        };
//
//        Observable<String> source = Observable.fromCallable(callable);
//        source.subscribe(System.out::println);
//        Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {
//            Thread.sleep(1000);
//            return "Hello Future";
//        });
//        Observable<String> source = Observable.fromFuture(future);
//        source.subscribe(System.out::println);

        Publisher<String> publisher = (Subscriber<? super String> s) -> {
            s.onNext("Hello Observable.fromPublisher()");
            s.onComplete();
        };
        Observable<String> source = Observable.fromPublisher(publisher);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FirstExample demo = new FirstExample();
        demo.emit();
    }
}