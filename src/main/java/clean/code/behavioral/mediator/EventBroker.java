package clean.code.behavioral.mediator;


import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class EventBroker extends Observable<Integer> {
    private List<Observer<? super Integer>> observers= new ArrayList<>();
    @Override
    protected void subscribeActual(@NonNull Observer<? super Integer> observer) {
        observers.add(observer);
    }
    public void publish(int n)
    {
        for(Observer<? super Integer> obs:observers)
            obs.onNext(n);
    }
}
