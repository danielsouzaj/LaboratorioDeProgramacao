import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();

        String[] geografia = {
                "Qual é o maior país do mundo em área territorial?", "Rússia",
                "Qual é o rio mais longo do mundo?", "Rio Nilo",
                "Qual é o país com a maior população do mundo?", "China",
                "Em que continente está localizado o Deserto do Saara?", "África",
                "Qual é a capital do Brasil?", "Brasília",
                "Qual é o ponto mais alto da Terra?", "Monte Everest",
                "Qual é o país conhecido como 'terra do sol nascente'?", "Japão",
                "Onde está localizada a Grande Barreira de Corais, o maior sistema de recifes de coral do mundo?", "Austrália",
                "Qual é o país mais populoso da Europa?", "Rússia",
                "Quais são os dois países que dividem a ilha de Hispaniola?", "Haiti e República Dominicana",
                "Qual é o país com a maior área florestal do mundo?", "Brasil",
                "Qual é o ponto mais baixo da Terra?", "Mar Morto",
                "Em que país está localizada a Torre Eiffel?", "França",
                "Qual é o maior oceano do mundo?", "Oceano Pacífico",
                "Qual é a capital da Rússia?", "Moscou"
        };

        // História
        String[] historia = {
                "Quem foi o primeiro presidente dos Estados Unidos?", "George Washington",
                "Qual foi o evento que marcou o fim da Idade Média na Europa?", "Renascimento",
                "Qual foi o conflito armado que ocorreu entre 1914 e 1918 e envolveu várias potências mundiais?", "Primeira Guerra Mundial",
                "Quem foi o líder da Revolução Cubana em 1959?", "Fidel Castro",
                "Qual foi o evento que marcou o início da Revolução Francesa em 1789?", "Queda da Bastilha",
                "Quem foi o primeiro imperador romano?", "Otávio Augusto",
                "Qual foi o período conhecido como 'Idade das Trevas'?", "Idade Média",
                "Quem foi o líder da Alemanha durante a Segunda Guerra Mundial?", "Adolf Hitler",
                "Qual foi o evento que marcou o fim da Segunda Guerra Mundial na Europa?", "Rendição da Alemanha",
                "Quem foi o autor da obra 'O Príncipe', que discute questões políticas e estratégias de governo?", "Nicolau Maquiavel",
                "Quem foi o líder da Revolução Russa em 1917?", "Vladimir Lenin",
                "Qual foi o imperador romano que instituiu o Cristianismo como religião oficial do Império Romano?", "Constantino I",
                "Qual foi o nome do movimento que buscava a unificação da Itália no século XIX?", "Risorgimento",
                "Quem foi o líder da Revolução Industrial na Inglaterra?", "Reino Unido",
                "Quem foi o líder da independência da Índia do domínio britânico?", "Mahatma Gandhi"
        };

        // Ciências
        String[] ciencias = {
                "Qual é o elemento químico mais abundante na crosta terrestre?", "Oxigênio",
                "Qual é a unidade de medida de temperatura absoluta no sistema internacional?", "Kelvin",
                "Qual é o processo pelo qual as plantas produzem seu próprio alimento?", "Fotossíntese",
                "Qual é o ácido encontrado no suco gástrico do estômago?", "Ácido clorídrico",
                "Qual é a partícula subatômica responsável por carregar uma carga negativa?", "Elétron",
                "Qual é o maior órgão do corpo humano?", "Pele",
                "Qual é a camada mais externa da atmosfera terrestre?", "Exosfera",
                "Qual é o processo pelo qual a água líquida se transforma em vapor de água?", "Evaporação",
                "Qual é a unidade de medida de energia no sistema internacional?", "Joule",
                "Qual é o nome dado à ciência que estuda o comportamento e as interações dos organismos vivos?", "Biologia",
                "Qual é o ácido encontrado no limão?", "Ácido cítrico",
                "Qual é o processo pelo qual o corpo converte alimentos em energia?", "Metabolismo",
                "Qual é o ácido encontrado no vinagre?", "Ácido acético",
                "Qual é o processo pelo qual a água volta do estado gasoso para o líquido?", "Condensação",
                "Qual é o ácido encontrado no refrigerante?", "Ácido fosfórico"
        };

        // Cultura Pop
        String[] culturaPop = {
                "Qual é o nome do famoso detetive criado por Arthur Conan Doyle?", "Sherlock Holmes",
                "Quem é o autor da série de livros 'Harry Potter'?", "J.K. Rowling",
                "Qual é o nome da saga cinematográfica baseada nos livros de J.R.R. Tolkien?", "O Senhor dos Anéis",
                "Qual é o nome da série de televisão sobre um grupo de amigos vivendo em Nova York?", "Friends",
                "Qual é o nome do protagonista da série de filmes 'Star Wars'?", "Luke Skywalker",
                "Qual é o nome da banda de rock liderada por Mick Jagger?", "The Rolling Stones",
                "Qual é o nome da plataforma de streaming conhecida por produzir séries como 'Stranger Things' e 'House of Cards'?", "Netflix",
                "Qual é o nome do filme em que Leonardo DiCaprio interpreta um ladrão de segredos corporativos?", "A Origem (Inception)",
                "Qual é o nome do personagem interpretado por Johnny Depp na série de filmes 'Piratas do Caribe'?", "Capitão Jack Sparrow",
                "Qual é o nome do reality show que coloca os participantes em uma ilha deserta para competir por um prêmio em dinheiro?", "Survivor",
                "Qual é o nome da série de jogos eletrônicos que apresenta um encanador italiano chamado Mario?", "Super Mario",
                "Qual é o nome da série de filmes sobre um bruxo adolescente chamado Harry?", "Harry Potter",
                "Qual é o nome da série de livros escrita por Suzanne Collins sobre uma competição mortal entre jovens?", "Jogos Vorazes",
                "Qual é o nome do vilão principal da saga de filmes 'Star Wars'?", "Darth Vader",
                "Qual é o nome do super-herói que é um cientista que se transforma em um monstro verde quando fica com raiva?", "Hulk"
        };

        // Esportes
        String[] esportes = {
                "Qual é o esporte mais popular do mundo?", "Futebol",
                "Qual é o único esporte que foi jogado na Lua?", "Golfe",
                "Qual é o nome do evento esportivo que ocorre a cada quatro anos e reúne atletas de todo o mundo?", "Jogos Olímpicos",
                "Quem é considerado o maior jogador de basquete de todos os tempos?", "Michael Jordan",
                "Qual é o nome do troféu concedido ao vencedor do Campeonato Mundial de Fórmula 1?", "Troféu do Mundial de Construtores",
                "Qual é o esporte que é jogado na Copa do Mundo?", "Futebol (ou soccer)",
                "Quem é o maior vencedor da história do Tour de France?", "Lance Armstrong",
                "Qual é o nome do estádio onde é disputada a final do Super Bowl?", "Estádio do Super Bowl",
                "Qual é o esporte em que os jogadores usam um taco para acertar uma bola branca em buracos em uma mesa?", "Bilhar",
                "Qual é o nome do time de futebol mais bem-sucedido da história da Liga dos Campeões da UEFA?", "Real Madrid",
                "Qual é o nome do troféu concedido ao vencedor do Super Bowl?", "Troféu Vince Lombardi",
                "Quem é o maior jogador de tênis de todos os tempos?", "Roger Federer",
                "Qual é o esporte que é jogado na World Series?", "Beisebol",
                "Qual é o esporte em que os jogadores jogam uma bola em uma cesta suspensa?", "Basquete",
                "Qual é o esporte que é jogado na Stanley Cup?", "Hóquei no gelo"
        };

        // Tecnologia
        String[] tecnologia = {
                "Quem é o fundador da Microsoft?", "Bill Gates",
                "Qual é o sistema operacional desenvolvido pela Apple para seus dispositivos móveis?", "iOS",
                "Qual é a sigla para a tecnologia de comunicação sem fio que permite a troca de dados entre dispositivos a curtas distâncias?", "Bluetooth",
                "Qual é a sigla para a tecnologia de comunicação de longa distância que utiliza ondas de rádio para transmitir dados?", "Wi-Fi",
                "Qual é o nome da assistente virtual desenvolvida pela Amazon?", "Alexa",
                "Qual é o nome do navegador de internet mais utilizado no mundo?", "Google Chrome",
                "Qual é o nome da rede social voltada para o compartilhamento de fotos e vídeos?", "Instagram",
                "Qual é o nome da plataforma de vídeos de curta duração popularizada pela China?", "TikTok",
                "Qual é o nome do fundador do Facebook?", "Mark Zuckerberg",
                "Qual é o nome do sistema operacional desenvolvido pelo Google para smartphones?", "Android",
                "Qual é o nome da empresa conhecida por seus produtos eletrônicos, como o iPhone e o iPad?", "Apple",
                "Qual é o nome da empresa de comércio eletrônico fundada por Jeff Bezos?", "Amazon",
                "Qual é o nome do serviço de mensagens instantâneas desenvolvido pelo Facebook?", "WhatsApp",
                "Qual é o nome da rede social voltada para profissionais e empresas?", "LinkedIn",
                "Qual é o nome da plataforma de streaming de vídeo desenvolvida pela Netflix?", "Netflix"
        };

        // Artes e Entretenimento
        String[] artesEEntretenimento = {
                "Quem é o autor da famosa obra de arte 'Mona Lisa'?", "Leonardo da Vinci",
                "Qual é o nome do compositor alemão conhecido por suas sinfonias, como a Nona Sinfonia?", "Ludwig van Beethoven",
                "Qual é o nome do autor da série de livros 'Crepúsculo'?", "Stephenie Meyer",
                "Qual é o nome da estrela pop conhecida como a 'Rainha do Pop'?", "Madonna",
                "Qual é o nome da banda de rock liderada por Mick Jagger?", "The Rolling Stones",
                "Quem é o autor do famoso romance 'Dom Quixote'?", "Miguel de Cervantes",
                "Qual é o nome da famosa pintura que retrata uma cena da Última Ceia de Jesus Cristo?", "A Última Ceia (de Leonardo da Vinci)",
                "Qual é o nome do diretor de cinema conhecido por filmes como 'O Poderoso Chefão' e 'Apocalypse Now'?", "Francis Ford Coppola",
                "Qual é o nome do pintor impressionista francês conhecido por suas obras que retratam a vida urbana de Paris?", "Claude Monet",
                "Qual é o nome do autor do famoso musical 'O Fantasma da Ópera'?", "Andrew Lloyd Webber",
                "Quem é o nome da atriz que interpretou Hermione Granger nos filmes da série 'Harry Potter'?", "Emma Watson",
                "Qual é o nome do diretor de cinema conhecido por filmes como 'Pulp Fiction' e 'Kill Bill'?", "Quentin Tarantino",
                "Qual é o nome do pintor holandês famoso por suas obras de arte do Período Barroco, como 'A Noite Estrelada'?", "Vincent van Gogh",
                "Qual é o nome da série de televisão sobre um grupo de sobreviventes tentando sobreviver a um apocalipse zumbi?", "The Walking Dead",
                "Qual é o nome da série de livros escrita por Suzanne Collins sobre uma competição mortal entre jovens?", "Jogos Vorazes"
        };

        // Ciência e Tecnologia
        String[] cienciaETecnologia = {
                "Qual é a unidade de medida de armazenamento de dados mais comum em computadores?", "Byte",
                "Quem é considerado o pai da computação?", "Alan Turing",
                "Qual é o nome do telescópio espacial lançado pela NASA em 1990?", "Telescópio Espacial Hubble",
                "Qual é o nome do modelo de smartphone mais recente lançado pela Apple em 2021?", "iPhone 13",
                "Quem é considerado o pai da eletricidade?", "Benjamin Franklin",
                "Qual é o nome da empresa de tecnologia fundada por Elon Musk que desenvolve carros elétricos?", "Tesla",
                "Qual é o nome da empresa de comércio eletrônico fundada por Jack Ma?", "Alibaba",
                "Qual é a sigla para o protocolo de internet que permite a comunicação entre dispositivos conectados em uma rede?", "IP (Internet Protocol)",
                "Quem é considerado o pai da física moderna?", "Isaac Newton",
                "Qual é o nome do primeiro satélite artificial lançado ao espaço em 1957 pela União Soviética?", "Sputnik 1",
                "Qual é o nome da empresa de tecnologia conhecida por seu mecanismo de busca na internet?", "Google",
                "Qual é o nome do sistema operacional de código aberto baseado em Linux, utilizado em smartphones?", "Android",
                "Quem é considerado o pai da teoria da relatividade?", "Albert Einstein",
                "Qual é o nome do cientista britânico que desenvolveu a teoria da evolução por seleção natural?", "Charles Darwin",
                "Qual é o nome do primeiro homem a pisar na lua?", "Neil Armstrong"
        };
    }
}
