export function criarProdutoAPI(produto) {
    fetch("http://localhost:8080/estoque/criar_produto", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(produto)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error("Erro ao criar produto");
        }
        return response.json();
    })
    .then(data => {
        console.log("Produto criado:\n", data);
        alert("Produto cadastrado com sucesso");
    })
    .catch(error => {
        console.error(error);
        alert("Erro ao cadastrar produto");
    });
}