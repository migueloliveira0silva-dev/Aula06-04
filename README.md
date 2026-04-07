# Aula06-04

### Atividade 1: O Efeito Espelho
Imagine que você tem uma fila de pessoas e quer criar uma segunda fila, mas com todo mundo na **ordem contrária**.
* **O que você faz:** Você olha para o último da primeira fila e o coloca como o primeiro da nova fila. Depois, pega o penúltimo e coloca na segunda posição, e assim por diante.
* **O resultado:** No final, você terá duas listas idênticas, mas uma é o "avesso" da outra.

### Atividade 2: A Lista de Convidados Sem Repetição
Imagine que você tem duas listas de amigos (**X** e **Y**) e quer montar uma única festa (**Z**), mas não quer que ninguém receba o convite duas vezes.
* **O que você faz:** 1. Você começa a passar os nomes da lista **X** para a lista da festa. 
    2. Quando termina, você olha para a lista **Y**. 
    3. Para cada nome em **Y**, você pergunta: *"Esse nome já está na lista da festa?"*. 
    4. Se **não estiver**, você o adiciona. Se **já estiver**, você o ignora.
* **O papel do 'k':** Como você vai pular as pessoas repetidas, a lista final da festa pode ser menor do que a soma das duas originais. O **k** é o contador que você usa para saber exatamente quantas pessoas "únicas" foram confirmadas no final.

---

### Resumo das Diferenças
* A **Atividade 1** apenas muda a **posição** das coisas.
* A **Atividade 2** filtra o **conteúdo** para evitar duplicatas.
