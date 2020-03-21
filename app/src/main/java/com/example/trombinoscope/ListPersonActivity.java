package com.example.trombinoscope;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.IPersonDAO;
import com.example.trombinoscope.DAO.PersonDAOData;



public class ListPersonActivity extends AppCompatActivity {
    ListView mListView;
    PersonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_person);

        IPersonDAO personDAOData = new PersonDAOData();


        /*ListView txt_listPerson = (ListView) findViewById((R.id.personsList));
        PersonDAOData personDAOData = new PersonDAOData();
        String listPersons = personDAOData.getPersons().toString();

        txt_listPerson.append(listPersons);*/

        mListView = (ListView)findViewById(R.id.personsList);
        adapter = new PersonAdapter(ListPersonActivity.this, personDAOData.getPersons());
        mListView.setAdapter(adapter);

    }

}
