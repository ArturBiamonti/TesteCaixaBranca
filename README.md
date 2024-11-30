# TesteCaixaBranca

# Erros Encontrados

1. **Tratamento de Erros**: Falta tratamento adequado de exceções.
2. **Injeção de SQL**: Vulnerável a injeções de SQL.
3. **Classe `DriverManager`**: Erro de tipografia em `Class.forName("com.mysql.Driver.Manager").newInstance();`.
4. **Fechamento de Conexões**: Conexões não são fechadas corretamente.
