package Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import Room.Dao.customer_Dao;
import Room.Database.DtabaseEcommerce;
import Room.Entity.E_customer;

public class Repository_Customer {
  private customer_Dao customer_dao;
  private LiveData<List<E_customer>> selectAllCustomer;

    public Repository_Customer(Application application) {
        DtabaseEcommerce databaseEcommerce= DtabaseEcommerce.getInstance(application);
        this.customer_dao=databaseEcommerce.customer_dao();
        this.selectAllCustomer=customer_dao.slectAllCustomer();

    }
}
