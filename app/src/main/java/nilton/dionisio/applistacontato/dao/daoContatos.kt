package nilton.dionisio.applistacontato.dao

import nilton.dionisio.applistacontato.models.Contato

public class DaoContatos {
    var listaContatos:ArrayList<Contato> = ArrayList();

    public fun getLista():ArrayList<Contato>{
        return listaContatos
    }

    init{

        var contato1:Contato = Contato ("Fulano","fulano@gmail.com","11 3231-3383","Rua do fulano","")
        var contato2:Contato = Contato ("belgrano","belgrano@gmail.com","11 3231-3383","Rua do fulano","")
        var contato3:Contato = Contato ("ciclano","ciclano@gmail.com","11 3231-3383","Rua do fulano","")

        listaContatos.add(contato1)
        listaContatos.add(contato2)
        listaContatos.add(contato3)


    }

    public fun CadastraContato(contato:Contato){
        listaContatos.add(contato)
    }

    public fun AtualizaContato(contato: Contato,posicao:Int){
        listaContatos.set(posicao,contato)

    }

    public fun RemoveContato(posicao: Int){
        listaContatos.removeAt(posicao)
    }
}