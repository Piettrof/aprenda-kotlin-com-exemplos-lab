// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
    inscritos.add(usuario)
    ////TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
            println("Usuário ${usuario.nome} matriculado na formação $nome")
            }
    }


fun main() {
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
//Alunos
    val usuario1 = Usuario("Kotin Brian")
    val usuario2 = Usuario("DiJavan")
    val usuario3 = Usuario("Gal  Godot")


// Materias 
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada A Objetos", 60)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Mobile Kotlin", 60)

//Formação
    val formacaoDev = Formacao("Desenvolvedor Kotlin", listOf(conteudo1, conteudo2, conteudo3))

//matricular alunos
formacaoDev.matricular(usuario1)
formacaoDev.matricular(usuario2)
formacaoDev.matricular(usuario3)

//list conteudo 
  println("Conteúdos da Formação ${formacaoDev.nome}:")
    for (conteudo in formacaoDev.conteudos) {
        println("${conteudo.nome} - Duração: ${conteudo.duracao} horas")
}

//listar aluno na formação
 println("Usuários matriculados na Formação ${formacaoDev.nome}:")
    for (usuario in formacaoDev.inscritos) {
        println(usuario.nome)
    } 
}