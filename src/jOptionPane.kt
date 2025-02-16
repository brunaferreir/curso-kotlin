import javax.swing.JOptionPane

fun main(args: Array<String>){
  //Pede o nume do usuario
  val nome = JOptionPane.showInputDialog("Digite seu nome:")

  //formata a mensagem de saida
  val saida = String.format("%s %s","Bem-vindo", nome)

  //apresenta o texto em uma interface grafica
  JOptionPane.showMessageDialog(null, saida)


  //println("Bem vindo $nome")
}