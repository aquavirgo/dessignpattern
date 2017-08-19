package retrofit;

import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;

public class Download {

    public static void main(String[] args) {
        Retrofit retrofits = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.openweathermap.org/v3/")
                // .baseUrl("https://api.github.com/search/")
                .build();

        UVService weatherService = retrofits.create(UVService.class);


       rx.Observable<UVData> london = weatherService.getUVData("51,17");

        london.subscribe(new Observer<UVData>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(UVData uvData) {
System.out.println(uvData.getData());
            }
        });
    }

   Double getDoubleFromUVData(UVData uvData){
        return uvData.getData();
    }
}
