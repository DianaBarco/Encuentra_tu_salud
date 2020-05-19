package com.upb.apphospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.upb.apphospital.data.DBHelper;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText etContrasena,etCorreo;
    private Cursor fila;
    private Button creditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etContrasena = (EditText)findViewById(R.id.Text_contrasena);
        etCorreo = (EditText)findViewById(R.id.Text_correo);

        creditos=(Button) findViewById(R.id.creditos);
        creditos.setOnClickListener(this);

    }

    public void lanzarIngreso(View v){

        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=etCorreo.getText().toString();
        String contrasena = etContrasena.getText().toString();
        fila= db.rawQuery("select usuario, contrasena from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"'", null);

        if (fila.moveToFirst()) {
            String usua = fila.getString(0);
            String pass = fila.getString(1);
            if (usuario.equals(usua) && contrasena.equals(pass) &&usuario.contains("@gmail.com")) {
                Intent ven = new Intent(this, ubicacionActual.class);
                startActivity(ven);
                etCorreo.setText("");
                etContrasena.setText("");
            }
        }
    }

    public void lanzarRegistro(View v){
        Intent ven=new Intent(this,IngresarDatos.class);
        startActivity(ven);
    }

    @Override
    public void onClick(View v) {

        Intent intencion= new Intent(this, Creditos.class);

        startActivity(intencion);

    }
}
