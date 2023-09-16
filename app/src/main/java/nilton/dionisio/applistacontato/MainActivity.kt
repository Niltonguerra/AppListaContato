package nilton.dionisio.applistacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import nilton.dionisio.applistacontato.adapters.AdapterContatos
import nilton.dionisio.applistacontato.models.Contato


class MainActivity : AppCompatActivity() {

    lateinit  var recyclerContatos:RecyclerView;

    lateinit var  listaContatos: ArrayList<Contato>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerContatos = findViewById(R.id.recyclerContatos)
        listaContatos = ArrayList<Contato>(0)

        var contato1:Contato = Contato ("Fulano","fulano@gmail.com","11 3231-3383","Rua do fulano","")
        var contato2:Contato = Contato ("belgrano","belgrano@gmail.com","11 3231-3383","Rua do fulano","")
        var contato3:Contato = Contato ("ciclano","ciclano@gmail.com","11 3231-3383","Rua do fulano","")

        listaContatos.add(contato1)
        listaContatos.add(contato2)
        listaContatos.add(contato3)

        recyclerContatos.adapter = AdapterContatos(this,listaContatos)
        recyclerContatos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


















    }






}