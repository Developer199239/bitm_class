package troublesome.bitm.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    EditText inputEt;
    Button submitBt;
    List<String> ls=new ArrayList<String>();;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        inputEt=(EditText)findViewById(R.id.inputEt);



    }

    public void submit(View view){
        ls.add(inputEt.getText().toString());
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ls);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }

}
