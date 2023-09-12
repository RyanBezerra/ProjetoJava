##Arquivo txt

No método jogarPedraPapelTesoura(), um objeto da classe FileWriter é criado para escrever no arquivo historico.txt. A primeira linha desse método cria uma variável historico como uma string vazia para armazenar as jogadas do jogo. Após cada jogada, a variável historico é atualizada com a jogada atual e seus resultados. Depois que o jogo é encerrado, o conteúdo da variável historico é gravado no arquivo historico.txt usando o método write() da classe FileWriter. O método close() é chamado para liberar recursos do sistema e fechar o arquivo.
O arquivo historico.txt será salvo no mesmo diretório em que o programa foi executado. Se o arquivo já existir, o método FileWriter o sobrescreverá. Caso contrário, um novo arquivo será criado. Se ocorrer algum erro ao escrever no arquivo, uma mensagem de erro será exibida na saída do console.

##Pedra, papel e tesoura

O jogo Pedra, Papel e Tesoura é implementado dentro do método jogarPedraPapelTesoura().
Primeiro, são criados dois objetos: um Scanner para ler a entrada do usuário e um Random para gerar uma jogada aleatória para o computador. Uma lista de escolhas possíveis (escolhas) é definida como um array de strings com os valores "pedra", "papel" e "tesoura".
Em seguida, o jogo entra em um loop infinito que só pode ser quebrado se o usuário decidir não jogar novamente. Em cada iteração do loop, o usuário é solicitado a fazer uma jogada digitando uma das opções ("pedra", "papel" ou "tesoura") através do Scanner. Se a entrada não for uma das opções válidas, o programa emite uma mensagem de erro e continua no loop.
Depois disso, o computador faz uma jogada aleatória escolhendo um índice aleatório do array escolhas e obtendo a escolha correspondente. A jogada do computador é exibida na tela.
Em seguida, é verificado quem ganhou a rodada e uma mensagem é exibida com o resultado. Se houver empate, a mensagem será "Empate". Se o usuário ganhar, a mensagem será "Você venceu!" e se o computador ganhar, a mensagem será "Computador venceu!".
Cada jogada, o resultado e a jogada do computador são registrados em uma string historico. O usuário é então solicitado a decidir se deseja jogar novamente. Se a entrada for diferente de "s", o loop é quebrado e o jogo é encerrado.
Por fim, o histórico de jogadas é salvo em um arquivo de texto chamado "historico.txt". Se ocorrer algum erro ao salvar o arquivo, uma mensagem de erro será exibida e o programa encerrará com uma exceção. Caso contrário, uma mensagem de sucesso será exibida na tela.

##Piramide de números

gerarPiramideDeNumeros(): Esse método inicializa um array de 120 inteiros e preenche com números aleatórios entre 0 e 99, gerando uma pirâmide de números com 15 linhas. Ele então chama o método gerarPiramide() para exibir a pirâmide e o método calcularSomaDosMenoresValores() para calcular a soma dos menores valores de cada linha.
gerarPiramide(int[] numeros): Esse método recebe o array de números gerado anteriormente e imprime a pirâmide de números. Ele faz isso usando dois loops for aninhados para percorrer cada linha da pirâmide e cada número na linha, respectivamente. Ele usa uma fórmula para calcular o índice do número na matriz, com base em sua posição na pirâmide.
calcularSomaDosMenoresValores(int[] numeros): Esse método recebe o array de números gerado anteriormente e calcula a soma dos menores valores de cada linha. Ele faz isso usando dois loops for aninhados para percorrer cada linha da pirâmide e cada número na linha, respectivamente. Ele usa uma variável para manter o valor do menor número encontrado em cada linha e o adiciona à soma total. No final, ele exibe a soma dos menores valores.
