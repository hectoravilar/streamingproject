# 🎬 Sistema de Streaming - Java

Um sistema de gerenciamento de conteúdo para plataforma de streaming desenvolvido em Java, com funcionalidades para catalogar filmes, séries e episódios, além de calcular tempo total de visualização e fornecer recomendações baseadas em avaliações.

## 📋 Funcionalidades

- **Gerenciamento de Títulos**: Cadastro e controle de filmes e séries
- **Sistema de Avaliações**: Permite avaliar conteúdos e calcular médias
- **Calculadora de Tempo**: Soma o tempo total de duração dos conteúdos
- **Sistema de Recomendações**: Filtra conteúdo baseado em classificações
- **Controle de Episódios**: Gerenciamento detalhado de episódios com visualizações
- **Coleções de Filmes**: Gerenciamento de listas usando ArrayList
- **Método toString**: Representação textual personalizada dos objetos
- **Sistema de Classificação por Visualizações**: Episódios classificados automaticamente

## 🏗️ Arquitetura

```
src/project/java/hector/streaming/
├── modelos/
│   ├── Titulo.java          # Classe base para conteúdos
│   ├── Filme.java           # Especialização para filmes
│   ├── Serie.java           # Especialização para séries
│   ├── Episodio.java        # Modelo de episódios
│   └── Principal.java       # Classe principal de execução
└── calculos/
    ├── CalculadoraDeTempo.java  # Calcula tempo total de conteúdo
    ├── Recomendacao.java        # Sistema de recomendações
    └── Classificavel.java       # Interface para classificação
```

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, VS Code)

### Execução
1. Clone o repositório
2. Abra o projeto na sua IDE
3. Execute a classe `Principal.java`

## 💡 Exemplo de Uso

```java
// Criando um filme
var filme = new Filme();
filme.setNome("Back to the Future");
filme.setAnoDeLancamento(1985);
filme.setDuracaoEmMinutos(180);
filme.avalia(8.5);

// Criando uma série
var serie = new Serie();
serie.setNome("Lost");
serie.setTemporadas(6);
serie.setEpisodiosPorTemporada(24);
serie.setMinutosPorEpisodio(45);

// Criando episódio com visualizações
var episodio = new Episodio();
episodio.setNumero(1);
episodio.setSerie(serie);
episodio.setTotalVisualizacoes(300);

// Gerenciando lista de filmes
var listaDeFilmes = new ArrayList<Filme>();
listaDeFilmes.add(filme);
System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());

// Calculando tempo total
var calculadora = new CalculadoraDeTempo();
calculadora.inclui(filme);
calculadora.inclui(serie);
System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");

// Sistema de recomendação
var recomendacao = new Recomendacao();
recomendacao.filtra(filme);
recomendacao.filtra(episodio);
```

## 🎯 Conceitos Aplicados

- **Programação Orientada a Objetos**: Herança, Polimorfismo, Encapsulamento
- **Interfaces**: Implementação de contratos (Classificavel)
- **Herança**: Titulo como classe base para Filme e Serie
- **Polimorfismo**: Diferentes implementações de getDuracaoEmMinutos() e getClassificacao()
- **Collections**: Uso de ArrayList para gerenciar listas de filmes
- **Override de Métodos**: toString() personalizado para representação de objetos
- **Composição**: Episodio contém referência para Serie

## 📊 Funcionalidades Detalhadas

### Sistema de Avaliações
- Permite múltiplas avaliações por título
- Calcula média automática das avaliações
- Suporte a avaliações de 0 a 10

### Calculadora de Tempo
- Soma duração de filmes e séries
- Cálculo automático baseado em temporadas e episódios para séries
- Suporte para múltiplos títulos

### Sistema de Recomendações
- **Preferidos**: Classificação ≥ 4
- **Bem Avaliados**: Classificação ≥ 2
- **Ver Depois**: Classificação < 2

### Gerenciamento de Episódios
- Controle de número e nome do episódio
- Associação com série específica
- Sistema de visualizações (>100 = classificação 4, ≤100 = classificação 2)
- Integração com sistema de recomendações

### Coleções e Listas
- Uso de ArrayList para gerenciar múltiplos filmes
- Métodos de acesso por índice
- Representação textual com toString() personalizado

## 🛠️ Tecnologias

- **Linguagem**: Java
- **Paradigma**: Orientação a Objetos
- **Estrutura**: Pacotes organizados por funcionalidade

**Desenvolvido por**: Hector Avila  
**Linguagem**: Java  
**Tipo**: Sistema de Back-end para Streaming
