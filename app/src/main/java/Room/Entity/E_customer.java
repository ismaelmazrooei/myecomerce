package Room.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName ="customer_Table")
public class E_customer {

    public E_customer(String name, String lastname, int tle, String address) {
        this.name = name;
        this.lastname = lastname;
        this.tle = tle;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTle() {
        return tle;
    }

    public void setTle(int tle) {
        this.tle = tle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String lastname;
    private int tle;
    private String address;







}
