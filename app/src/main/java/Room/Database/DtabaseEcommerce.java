package Room.Database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import Room.Dao.customer_Dao;
import Room.Entity.E_customer;


@Database(entities = {E_customer.class},version = 1)
public abstract class DtabaseEcommerce extends RoomDatabase {
    private static  DtabaseEcommerce instance;
    public  static  synchronized  DtabaseEcommerce getInstance(Context context){
        if (instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(),DtabaseEcommerce.class,"DatabaseEccommmerce")
                    .fallbackToDestructiveMigration()
                    .build();
        }
      return  instance;
    }
    //for entitis add Entity  to class abstract
    public abstract customer_Dao customer_dao();




}
