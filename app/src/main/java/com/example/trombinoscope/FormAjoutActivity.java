package com.example.trombinoscope;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.IPersonDAO;
import com.example.trombinoscope.DAO.PersonDAOData;
import com.example.trombinoscope.DTO.Person;
import com.google.android.material.textfield.TextInputLayout;


public class FormAjoutActivity extends AppCompatActivity {
    ListView mListView;
    PersonAdapter adapter;
    private TextInputLayout input_nom;
    private TextInputLayout input_prenom;
    private Button btn_ajout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ajout);

        final IPersonDAO personDAOData = new PersonDAOData();

        input_nom = (TextInputLayout) findViewById(R.id.input_nom);
        input_prenom = (TextInputLayout) findViewById(R.id.input_prenom);


        btn_ajout = (Button) findViewById(R.id.button_ajouter);
        btn_ajout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        personDAOData.getPersons().add(new Person(input_prenom.getEditText().getText().toString(),input_nom.getEditText().getText().toString(), Color.BLACK));
                        //Toast.makeText(getApplicationContext(), input_nom.getEditText().getText().toString() + input_prenom.getEditText().getText().toString() ,Toast.LENGTH_LONG).show();
                        //Redirection vers la list
                        Intent activityChangeIntent = new Intent(getBaseContext(), ListPersonActivity.class);
                        startActivity(activityChangeIntent);
                    }
                }
        );
    }
}
