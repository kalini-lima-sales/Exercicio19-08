fun main() {

    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:
    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/

    produto.add("Air Fryer")
    produto.add("Celular")
    produto.add("Geladeira")
    produto.add("Micro-ondas")
    produto.add("Notebook")

    println()
    println(produto)
    println("Quantidade de tipos de Produtos: ${produto.size}")

    while (true){
        println()
        println("1 - Adicione produto")
        println("2 - Remover produto")
        println("3 - Atualizar produto")
        println("4 - Exibir produto")
        println("5 - Sair")
        println()
        println("Opção: ")
        when(readln().toInt()){
            1 -> {
                println("Digite um nome: ")
                val nome = readln()
                armazenarProduto(nome)
            }
            2 -> removerProduto()
            3 -> atualizarProduto()
            4 -> apresentarProduto()
            5 -> break
            else -> println("Oops, opção inválida! Por favor, tente novamente!")
        }
    }

}