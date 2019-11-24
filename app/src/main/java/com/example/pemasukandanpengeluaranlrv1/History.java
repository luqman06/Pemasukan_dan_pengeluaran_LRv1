package com.example.pemasukandanpengeluaranlrv1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.pemasukandanpengeluaranlrv1.database.DataModel;
import com.example.pemasukandanpengeluaranlrv1.database.DatabaseClass;
import com.example.pemasukandanpengeluaranlrv1.database.list_adapter;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    ListView listView;
    SQLiteDatabase database;
    ArrayList<DataModel> list;
    ListView ListView01;
    list_adapter listAdapter;
    DatabaseClass databaseClass;

    DatabaseClass dbcenter;
    protected Cursor cursor;
    String[] daftar;
    Button hapus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        listView=(ListView) findViewById(R.id.list_view);

        list=new ArrayList<>();
        databaseClass=new DatabaseClass(History.this);
        listAdapter=new list_adapter(this,R.layout.list_row,list);
        listView.setAdapter(listAdapter);





        database=databaseClass.getReadableDatabase();




                Cursor
                        cr = database
                        .rawQuery("Select * from expense ", null);

                StringBuilder stringBuilder = new StringBuilder();
                while (cr.moveToNext()) {
                    int id = cr.getInt(0);
                    String amount = cr.getString(1);
                    String category = cr.getString(2);
                    String description = cr.getString(3);
                    String date = cr.getString(4);
                    String image = cr.getString(5);
                    String spinner = cr.getString(6);
                    list.add(new DataModel(id, amount, category, description, date, image, spinner));
                }

//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
//                final String selection = daftar[arg2];
//                final CharSequence[] dialogitem = {"Lihat Biodat","Update data", "Hapus Biodata"};
//                AlertDialog.Builder builder = new
//                        AlertDialog.Builder(History.this);
//                builder.setTitle("Pilihan");
//                builder.setItems(dialogitem, new
//                        DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int intem) {
//                                switch (intem){
////                                    case 0 :
////                                        Intent i = new Intent(getApplicationContext(),
////                                                LihatBiodata.class);
////                                        i.putExtra("nama",selection);
////                                        startActivity(i);
////                                        break;
////
////                                    case 1 :
////                                        Intent in = new Intent(getApplicationContext(),
////                                                UpdateBiodata.class);
////                                        in.putExtra("nama",selection);
////                                        startActivity(in);
////                                        break;
//
//                                    case 2 :
//                                        SQLiteDatabase db = dbcenter.getWritableDatabase();
//                                        db.execSQL("delete from biodata where nama = '"+selection+"'");
//                                      //  RefreshList();
//                                        break;
//                                }
//
//                            }
//                        });
//                builder.create().show();
//
//            }
//        });
//
//        ((ArrayAdapter)listView.getAdapter()).notifyDataSetInvalidated();
//
            }







    }




