val produto = mutableListOf<String>()

fun armazenarProduto(nome: String){
    if(nome != ""){
        produto.add(nome)
        println("$nome adicionado!")
    }else{
        println("Oops, opção inválida! Por favor, tente novamente!")
    }
}

fun removerProduto(){
    while (true){
        println("Qual produto deseja excluir?")
        val nome = readln()

        if(produto.contains(nome)){
            produto.remove(nome)
            println("Produto $nome excluído.")
            break
        }else{
            println("O produto $nome não existe.")
        }
    }
}

fun atualizarProduto(){
    println("Qual produto deseja atualizar?")
    val nome = readln()

    if(produto.contains(nome)){
        val posicao = produto.indexOf(nome)
        println("Por favor, digite o novo nome do produto: ")
        produto[posicao] = readln()
        println("Produto atualizado!")
    }else{
        println("O produto $nome não existe.")
    }
}

fun apresentarProduto(){
    println()
    println(produto)
    println("Quantidade de tipos de Produtos: ${produto.size}")
}