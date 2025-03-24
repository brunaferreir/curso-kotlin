/* 02. Com base na classe mãe, crie uma subclasse para separar os livros digitais (class LivroDigital)
e outra subclasse com os livros físicos (class LivroFisico)
Ambas as subclasses devem herdar todos os atributos da classe mãe
A subclasse LivroDigital terá o atributo "TamahoMB", onde irá receber o tamanho do livro em MB
A subclasse LivroFisico terá o atributo "qtdPaginas", onde irá receber a quantidade de páginas do livro
Ambas as subclasses devem herdar a função "exibirInformacoes()", exibindo junto o seus respectivos atributos */ 

open class Livro(val titulo: String, val autor: String, val anoPublicacao: Int){
    open fun exibirInformacoes(){
        println("Titulo: $titulo, Autor: $autor, Ano de publicação: $anoPublicacao")
    }
}


fun main(){
    val livro1 = LivroDigital("Hannibal Rising", "Thomas Harris", 2006, 1.61)
    livro1.exibirInformacoes()
    val livro2 = LivroFisico("O morro dos ventos uivantes","Emily Bronthë", 1847, 368)
    livro2.exibirInformacoes()
}

/*
Resposta:
open class Livro(val titulo: String, val autor: String, val anoPublicacao: Int){
    open fun exibirInformacoes(){
        println("Titulo: $titulo, Autor: $autor, Ano de publicação: $anoPublicacao")
    }
}

class LivroDigital(titulo: String, autor: String, anoPublicacao: Int, val tamanhoMB: Double): Livro(titulo, autor, anoPublicacao){
    override fun exibirInformacoes(){
        super.exibirInformacoes()
        println("Tamanho em MB: $tamanhoMB") 
    }
}

class LivroFisico(titulo: String, autor: String, anoPublicacao: Int, val qtdPaginas: Int): Livro(titulo, autor, anoPublicacao){
    override fun exibirInformacoes(){
        super.exibirInformacoes()
        println("Quantidade de páginas: $qtdPaginas") 
    }
}

fun main(){
    val livro1 = LivroDigital("Hannibal Rising", "Thomas Harris", 2006, 1.61)
    livro1.exibirInformacoes()
    val livro2 = LivroFisico("O morro dos ventos uivantes","Emily Bronthë", 1847, 368)
    livro2.exibirInformacoes()
}
 */