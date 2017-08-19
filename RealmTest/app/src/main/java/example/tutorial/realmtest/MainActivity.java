package example.tutorial.realmtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.UUID;

import example.tutorial.realmtest.model.Dog;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();


        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(1);

        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
// Get a Realm instance for this thread

        Realm realm = Realm.getInstance(realmConfiguration);


        realm.beginTransaction();

        Dog u = realm.createObject(Dog.class);

        u.setId(1);
        u.setName("Franek");
        u.setAge(20);
        realm.commitTransaction();

// Query Realm for all dogs younger than 2 years old
      final RealmResults<Dog> puppies = realm.where(Dog.class).findAll();
        //puppies.size(); // => 0 because no dogs have been added to the Realm yet
        for(int i =0;i<puppies.size();i++){
            Log.d("TEST", String.valueOf(puppies.size()));
            Log.d("TEST", String.valueOf(puppies.get(i).getName()));
        }

        // Asynchronously update objects on a background thread
     /*   realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                Dog dog = bgRealm.where(Dog.class).equalTo("age", 1).findFirst();
                dog.setAge(3);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                // Original queries and Realm objects are automatically updated.
                puppies.size(); // => 0 because there are no more puppies younger than 2 years old
                 puppies.get(1).getAge();   // => 3 the dogs age is updated

            }
        });

        */


        final RealmResults<Dog> puppies2 = realm.where(Dog.class).findAll();
        //puppies.size(); // => 0 because no dogs have been added to the Realm yet
        for(int i =0;i<puppies2.size();i++){
            Log.d("TEST", String.valueOf(puppies2.size()));
            Log.d("TEST", String.valueOf(puppies2.get(i).getName()));
            Log.d("TEST", String.valueOf(puppies2.get(i).getAge()));
        }



    }
}
