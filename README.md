# TesteCaixaBranca

### Grafo de Fluxo:
(https://lucid.app/lucidchart/68eaf710-798c-4194-a491-9333c9b2f3fe/edit?viewport_loc=-202%2C24%2C3328%2C1630%2C0_0&invitationId=inv_6c7fbf0b-83f4-4d74-be1e-d61849920881)


### Calcular a Complexidade Ciclomática:
V(G)=E−N+2P

No meu código temos: Nós (N): 5 nós (entrada, conexão, execução do SQL, verificação de resultado, e saída).
Arestas (E): 6 arestas (transições entre os blocos).
Componentes conectados (P): 1 (um único componente conectado no fluxo do código).
Então a complexidade ciclomática seria:
V(G)=6−5+2×1=3
existem então 3 caminhos independentes no código.

### Caminhos possíveis:

Caminho 1: O código entra, a conexão com o banco de dados é bem-sucedida, o SQL é executado e o usuário é encontrado.
Caminho 2: O código entra, a conexão com o banco de dados falha, ou não há registros no banco de dados.
Caminho 3: O código entra, a conexão com o banco de dados é bem-sucedida, mas o SQL falha (por exemplo, erro de sintaxe ou conexão interrompida).
