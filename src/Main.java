import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Pedro Augusto Barbosa Gomes");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Quantos jogadores de cada equipe ficam em quadra durante uma partida de basquete?",
                "4",
                "5",
                "6",
                "7",
                'B'));

        questoes.add(new Questao("2) Qual jogador é conhecido pelo apelido Rei James?",
                "Kobe Bryant",
                "Stephen Curry",
                "LeBron James",
                "Kevin Durant",
                'C'));

        questoes.add(new Questao("3) Quantos pontos vale uma cesta feita de fora da linha de três pontos?",
                "1",
                "2",
                "3",
                "4",
                'C'));

        questoes.add(new Questao("4) Qual time da NBA tem mais títulos de campeão?",
                "Los Angeles Lakers",
                "Boston Celtics",
                "Chicago Bulls",
                "Golden State Warriors",
                'B'));

        questoes.add(new Questao("5) Qual brasileiro ficou conhecido como Mão Santa no basquete?",
                "Marcelinho Huertas",
                "Oscar Schmidt",
                "Leandrinho Barbosa",
                "Tiago Splitter",
                'B'));

        questoes.add(new Questao("6) Quantos quartos tem uma partida de basquete da NBA?",
                "2",
                "3",
                "4",
                "5",
                'C'));

        questoes.add(new Questao("7) Qual jogador usou a camisa 23 no Chicago Bulls e é considerado um dos maiores da história?",
                "Scottie Pippen",
                "Michael Jordan",
                "Dennis Rodman",
                "Shaquille O'Neal",
                'B'));

        questoes.add(new Questao("8) Como é chamado o arremesso livre cobrado após uma falta?",
                "Lance livre",
                "Bandeja",
                "Rebote",
                "Enterrada",
                'A'));

        questoes.add(new Questao("9) Qual é a altura oficial da cesta de basquete em relação ao chão?",
                "2,75 metros",
                "3,05 metros",
                "3,50 metros",
                "2,50 metros",
                'B'));

        questoes.add(new Questao("10) Qual jogador é famoso por seus arremessos de três pontos e joga no Golden State Warriors?",
                "Stephen Curry",
                "Giannis Antetokounmpo",
                "Luka Dončić",
                "Jayson Tatum",
                'A'));

        questoes.add(new Questao("11) Quanto tempo dura cada quarto em uma partida da NBA?",
                "10 minutos",
                "12 minutos",
                "15 minutos",
                "20 minutos",
                'B'));

        questoes.add(new Questao("12) Qual país venceu mais medalhas de ouro no basquete masculino olímpico?",
                "Brasil",
                "Espanha",
                "Estados Unidos",
                "Argentina",
                'C'));

        questoes.add(new Questao("13) Como é chamado o movimento de pegar a bola que sobra após um arremesso errado?",
                "Drible",
                "Rebote",
                "Toco",
                "Assistência",
                'B'));

        questoes.add(new Questao("14) O que acontece quando um jogador comete 6 faltas na NBA?",
                "Ele é advertido",
                "Ele é expulso do jogo",
                "Ele cobra um lance livre",
                "Nada acontece",
                'B'));

        questoes.add(new Questao("15) Qual é o nome do campeonato profissional de basquete dos Estados Unidos?",
                "NFL",
                "MLB",
                "NBA",
                "NHL",
                'C'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }
        }

        System.out.println("Foram " + acertos + " acertos");
        double porcentagem = ((acertos * 100.0) / questoes.size());
        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);
        scanner.close();
        System.out.println("Obrigado por participar do quiz");

    }
}