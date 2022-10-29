import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.AsyncSubject;

public class SecoundExample {

    public static void main(String[] args) {
//        Observable<String> source = Observable.just("Hello Single");
//        Single.fromObservable(source)
//                .subscribe(System.out::println);

        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 -> " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 -> " + data));
        subject.onNext("5");
        subject.onComplete();
    }
}
