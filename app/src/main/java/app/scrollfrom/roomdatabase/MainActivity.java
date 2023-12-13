package app.scrollfrom.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText edtName,edtNumber;
Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=findViewById(R.id.edtName);
        edtNumber=findViewById(R.id.edtNumber);
        btnAdd=findViewById(R.id.btnAdd);

        DatabaseHelper databaseHelper=DatabaseHelper.getDB(this);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edtName.getText().toString();
                String number=edtNumber.getText().toString();
                databaseHelper.contactDao().addTx(
                        new Contacts(name,number)
                );
               ArrayList<Contacts> arrExpenses =(ArrayList<Contacts>) databaseHelper.contactDao().getAllContact();
               for(int i=0;i<arrExpenses.size();i++){
                   Log.d("Id:  ","Name:  "+arrExpenses.get(i).getName()+"Number:  "+arrExpenses.get(i).getNumber());
               }
            }
        });

    }
}