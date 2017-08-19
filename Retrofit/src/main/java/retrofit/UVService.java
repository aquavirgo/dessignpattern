package retrofit;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UVService {

        @GET("uvi/{location}/current.json?appid=")
        rx.Observable<UVData> getUVData (@Path("location") String pleaceLocation);
    }

