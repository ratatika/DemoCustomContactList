package sg.edu.rp.c346.id20006092.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomArray caContact;
    ImageView ivMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();

        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item2);

        caContact = new CustomArray(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);

        ivMain = findViewById(R.id.ivMain);
        String imageUrl = "https://seeklogo.com/images/A/android-logo-E109D453E3-seeklogo.com.png";
        Picasso.with(this).load(imageUrl).into(ivMain);
    }
}