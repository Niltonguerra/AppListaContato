package nilton.dionisio.applistacontato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import nilton.dionisio.applistacontato.models.Contato
import java.io.Serializable

class EditarContatoActivity : AppCompatActivity() {
    //caso coloque aqui as variaveis irão carregalas sempre que a página estiver carregando
    lateinit var contato: Contato
    lateinit var btSalvar:Button

    lateinit var txtNome:EditText
    lateinit var txtEmail:EditText
    lateinit var txtTelefone:EditText
    lateinit var txtEndereco:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_contato)

        btSalvar = findViewById(R.id.btSalvar)

        txtNome = findViewById(R.id.txtNome)
        txtEmail = findViewById(R.id.txtEmail)
        txtEndereco = findViewById(R.id.txtEndereco)
        txtTelefone = findViewById(R.id.txtTelefone)

        btSalvar.setOnClickListener{
            salvarContato()
        }



    }

    private fun salvarContato(){
        //caso coloque aqui as variaveis irão iniciar toda vez que a pagina por carregada

        if(!txtNome.text.toString().isNullOrEmpty()){
            contato = Contato(
                nome = txtNome.text.toString(),
                email = txtEmail.text.toString(),
                telefone = txtEndereco.text.toString(),
                endereco = txtEndereco.text.toString(),
                foto = ""
            )

            this.intent.putExtra("contato",contato)


            this.setResult(1,this.intent)
            this.finish()
        }
    }
}