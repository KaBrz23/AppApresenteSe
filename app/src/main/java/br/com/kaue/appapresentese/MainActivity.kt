//declaração do pacote onde esta classe está localizada.
package br.com.kaue.appapresentese

//Importação de bibliotecas necessárias
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

//Definição da classe MainActivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {

    //Declaracão de propriedades para as views que serão utilizadas na atividade

    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView

    //metodo chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o layout da atividade apartir do arquivo XML (activity_main.xml)
        setContentView(R.layout.activity_main)

        //inicializa as propriedades com as views correspondentes
        nomeEmpresa = findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa = findViewById(R.id.atuacaoEmpresa)
        resultado = findViewById(R.id.resultado)

        nomeEmpresa.text = "FIAP"
        atuacaoEmpresa.text = "Cloud Specialist"
        resultado.text = ""

    }

    //Função chamada quando o botao é clicado ou quando o usuario da um tap
    fun combinarTextos(view: View){
        // criar uma string combinando o texto das view nomeEmpresa e atuacaoEmpresa
        val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"

        //define o texto da view resultado com o texto combinado
        resultado.text = textoFinal
    }
}