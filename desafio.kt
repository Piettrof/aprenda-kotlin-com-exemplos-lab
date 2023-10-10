// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 120)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
    inscritos.add(usuario)
    ////TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
            println("Usuário ${usuario.nome} matriculado na formação $nome")
            }
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario("Kotin Brian")
    val usuario2 = Usuario("DiJavan")
    val usuario3 = Usuario("Gal  Godot")


}
