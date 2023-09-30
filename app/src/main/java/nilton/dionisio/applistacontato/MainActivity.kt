package nilton.dionisio.applistacontato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.text.Layout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import nilton.dionisio.applistacontato.adapters.AdapterContatos
import nilton.dionisio.applistacontato.dao.DaoContatos
import nilton.dionisio.applistacontato.models.Contato


class MainActivity : AppCompatActivity() {


    lateinit  var recyclerContatos:RecyclerView;

    lateinit var  daoContatos: DaoContatos;

    lateinit var btnCadastrar: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerContatos = findViewById(R.id.recyclerContatos)
        daoContatos = DaoContatos()

        btnCadastrar = findViewById(R.id.fabCadastrar)




        recyclerContatos.adapter = AdapterContatos(this,daoContatos.listaContatos)
        recyclerContatos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        btnCadastrar.setOnClickListener{abrirCadatro()}

















    }

    private fun abrirCadatro() {
        var intent:Intent = Intent(this,EditarContatoActivity::class.java)
        startActivity(intent)
    }


}