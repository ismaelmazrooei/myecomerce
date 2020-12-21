package Room.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Room.Entity.E_customer;


@Dao
public interface customer_Dao {
    @Insert
    void insertCustomer(E_customer customer);

    @Update
    void updateCustomer(E_customer customer);

    @Delete
    void deleteCustomer(E_customer customer);

    @Query("delete from customer_Table")
    void deleteAllCustomer();

    @Query("select * from customer_Table order by name desc ")
    LiveData<List<E_customer>> slectAllCustomer();
}
