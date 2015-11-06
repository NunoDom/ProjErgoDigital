package dei.estg.ipleiria.pt.ergodigital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import dei.estg.ipleiria.pt.ergonometrodigital.R;

public class SystemRULAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_rula);



        Spinner spinner1= (Spinner)findViewById(R.id.cbRULAbraco);
        Spinner spinner2= (Spinner)findViewById(R.id.cbRULAantebraco);
        Spinner spinner3= (Spinner)findViewById(R.id.cbRULApunho);
        Spinner spinner4= (Spinner)findViewById(R.id.cbRULApunho);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int braco = position+1;
                ImageView image = (ImageView)findViewById(R.id.ivRULAbraco);
                switch (braco) {
                    case 1:
                        image.setImageResource(R.drawable.ic_rula_rua1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.ic_rula_rua2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ic_rula_rua3);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.ic_rula_rua4);
                        break;
                    case 5:
                        image.setImageResource(R.drawable.ic_rula_rua5);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int antebraco = position+1;
                ImageView image = (ImageView)findViewById(R.id.ivRULAantebraco);
                switch (antebraco) {
                    case 1:
                        image.setImageResource(R.drawable.ic_rula_rla1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.ic_rula_rla2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ic_rula_rla3);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int punho = position+1;
                ImageView image = (ImageView)findViewById(R.id.ivRULApunho);
                switch (punho) {
                    case 1:
                        image.setImageResource(R.drawable.ic_rula_rw1);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.ic_rula_rw2);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.ic_rula_rw3);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.ic_rula_rw4);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void click(View view)
    {



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_system_rula, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
