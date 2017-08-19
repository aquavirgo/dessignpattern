package retrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UVService {

        @GET("uvi/{location}/current.json?appid=7ff6b5867b4336b380c2f5c87c47e00d")
        rx.Observable<UVData> getUVData (@Path("location") String pleaceLocation);
    }

