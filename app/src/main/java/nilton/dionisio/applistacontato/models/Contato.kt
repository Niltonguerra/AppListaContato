package nilton.dionisio.applistacontato.models

import kotlinx.serialization.Serializable

@Serializable
//o var permite apenas a leitura,não a edição
data class Contato(
    var nome:String,
    var email:String,
    var telefone:String,
    var endereco:String,
    var foto:String

):java.io.Serializable