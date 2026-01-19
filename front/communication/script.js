import { criarProdutoAPI } from "./communication.js";

document.getElementById("btn-enviar").addEventListener("click", handleCriarProduto);

function handleCriarProduto() {
    const nome = document.getElementById("produto_nome").value;
    const descricao = document.getElementById("descricao").value;
    const preco = document.getElementById("preco").value;

    const produto = {
        nome: nome,
        descricao: descricao,
        preco: preco
    };

    criarProdutoAPI(produto);
}