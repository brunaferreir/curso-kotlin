//polimorfismo permite que diferentes classes sejam tratadas como
// como instancias da mesma clase base

// classe base
open class Movie(val title: String, val year: Int){
    open fun description():String{
        return "Filme: $title, Ano: $year"
    }
}

class HorrorMovie( title: String, year: Int , val grade: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Grade: $grade" // executa construtor da classe mãe pega o titulo e ano
    }
}
class ActionMovie(title: String, year: Int, val stunts: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of stunts: $stunts" // executa construtor da classe mãe pega o titulo e ano
    }
}
class RomanceMovie(title: String, year: Int, val kisses: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of kisses: $kisses" // executa construtor da classe mãe pega o titulo e ano
    }
}
// Giovana Lopes e Bruna Ferreira ADS
class ComedyMovie(title: String, year: Int, val laughts: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of laughts: $laughts" // executa construtor da classe mãe pega o titulo e ano
    }
}

class DramaMovie(title: String, year: Int, val cries: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of cries: $cries" // executa construtor da classe mãe pega o titulo e ano
    }
}

class SciFiMovie(title: String, year: Int, val trips: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of trips: $trips" // executa construtor da classe mãe pega o titulo e ano
    }
}

class FantasyMovie(title: String, year: Int, val Magic: Int): Movie(title, year){
    override fun description(): String {// polimorfismo
        return "${super.description()}, Number of Magics: $Magic" // executa construtor da classe mãe pega o titulo e ano
    }
}


fun main(){
    //CRIANDO UMA LISTA DE FILMES
    val movies: List<Movie> = listOf(
        HorrorMovie("Pânico", 2022, 4),
        ActionMovie("Deadpool & Wolverine", 2024, 1000),
        RomanceMovie("Orgulho e Preconceito",2005, 1),
        ComedyMovie("Como se fosse a primeira vez", 2004, 300),
        RomanceMovie("Anyone but you", 2024, 20),
        HorrorMovie("Jogos Mortais X", 2023, 3),
        DramaMovie("Capitão Fantastico", 2016, 10 ),
        SciFiMovie("mickey-17", 2025, 2),
        FantasyMovie("Harry Potter", 2011, 100),
        ComedyMovie("Esposa de Mentirinha", 2011, 25),
        DramaMovie("Close", 2022, 40),
        SciFiMovie("Interestelar", 2014, 2),
        FantasyMovie("Shrek", 2001, 3)

    )

    //println()
    for (movie in movies){
        println(movie.description())
    }

}