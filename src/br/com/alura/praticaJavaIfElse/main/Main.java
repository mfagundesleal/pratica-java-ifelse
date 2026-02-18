package br.com.alura.praticaJavaIfElse.main;

import java.util.Scanner;

public class Main {
    static void atividade1(){
        int numero1 = 20;
        if(numero1 % 2 == 0){
            System.out.printf("""
                    O número %d é par! :D
                    """.formatted(numero1));
        }else{
            System.out.printf("""
                    O número %d é ímpar! :(
                    """.formatted(numero1));
        }
    }
    static void atividade2(){
        double media = 4.0;
        if (media < 5.0){
            System.out.println("Que pena! Você foi reprovado! :(");
        }else if(media < 6.9){
            System.out.println("Vish! Você foi reprovado! :/");
        }else{
            System.out.println("Uhul! Você foi aprovado! :D");
        }
    }
    static void atividade3(){
        int senha = 123456;
        if(senha == 123456){
            System.out.println("Acesso permitido! Realizando o login ...");
        }else{
            System.out.println("Acesso revogado! Não foi possível realizar o login, forneça outra senha. :(");
        }
    }
    static void atividade4(Scanner ler){
        System.out.println("Digite o primeiro número para comparar qual será o maior:");
        int numero1 = ler.nextInt();
        System.out.println("Agora digite o segundo número:");
        int numero2 = ler.nextInt();
        if(numero1 > numero2){
            System.out.printf("""
                    O número %d é MAIOR do que o número %d.
                    """.formatted(numero1, numero2));
        }else if (numero2 > numero1){
            System.out.printf("""
                    O número %d é MAIOR do que o número %d.
                    """.formatted(numero2, numero1));
        }else{
            System.out.println("Os números são iguais!");
        }
    }
    static void atividade5(Scanner ler){
        System.out.println("Digite o valor da compra realizada, por gentileza:");
        double valorCompra = ler.nextDouble();
        if(valorCompra >= 100.00){
            double valorComDesconto= valorCompra*0.9;
            System.out.printf("""
                    Foi aplicado o desconto de R$ 10 na sua compra de %.2f. Total com desconto: %.2f
                    """.formatted(valorCompra,valorComDesconto));
        }
    }
    static void atividade6(Scanner ler){
        System.out.println("Informe um dia da semana (somente minúsculas, sem hífen e sem o 'feira'");
        String diaSemana = ler.nextLine();
        if(diaSemana == "segunda" || diaSemana == "terça"|| diaSemana == "quarta"|| diaSemana == "quinta"|| diaSemana == "sexta"){
            System.out.printf("""
                    O dia '%s' é um dia útil, dia de trabalho normal.
                    """.formatted(diaSemana));
        }else if(diaSemana != "domingo" || diaSemana != "sábado"){
            System.out.println("Esse não é um dia válido :/");
        }else{
            System.out.printf("""
                    O dia '%s' não é um dia útil. Pode descansar! :D
                    """.formatted(diaSemana));
        }
    }
    static void atividade7(Scanner ler){
        System.out.println("Por gentileza, informe um valor a receber:");
        double valorRecebido = ler.nextDouble();
        if(valorRecebido >= 1000.00 || valorRecebido <= 5000.00){
            System.out.printf("""
                    O valor de R$ %.2f está dentro do valor permitido!
                    """.formatted(valorRecebido));
        }else{
            System.out.printf("""
                    O valor de R$ %.2f está FORA do valor permitido!
                    """.formatted(valorRecebido));
        }
    }
    static void atividade8(Scanner ler){
        System.out.println("Informe o tamanho do primeiro lado de uma figura geométrica:");
        double comprimentoLado1 = ler.nextDouble();
        System.out.println("Informe o tamanho do segundo lado de uma figura geométrica:");
        double comprimentoLado2 = ler.nextDouble();
        System.out.println("Informe o tamanho do terceiro lado de uma figura geométrica:");
        double comprimentoLado3 = ler.nextDouble();

        double soma2lados = comprimentoLado1+comprimentoLado2;
        if(soma2lados > comprimentoLado3){
            System.out.println("A figura é um triângulo pois a soma de dois lados é maior do que o terceiro lado!");
        }else{
            System.out.println("A figura não é um triângulo. :/");
        }
    }
    static void atividade9(Scanner ler){
        System.out.println("Seja bem-vindo(a), doador(a) de sangue! Qual é a sua idade?");
        int idade = ler.nextInt();
        System.out.println("Agora, por favor, qual o seu peso?");
        double peso = ler.nextDouble();

        if((idade >= 18 && idade <= 65) && peso > 50.00){
            System.out.println("PARABÉNS! Você pode ser um doador de sangue! Procure o posto de saúde mais próximo e se informe. :D");
        }else{
            boolean criterioIdade = idade>= 18 && idade <=65;
            boolean criterioPeso = peso > 50.00;
            if(!criterioIdade){
                System.out.printf("""
                        Ahhhh, que pena, você não pode ser um doador de sangue pois sua idade é de %d anos e precisamos que esteja entre 18 e 65 anos. :/
                        """.formatted(idade));
            }else if(!criterioPeso){
                System.out.printf("""
                        Ahhhh, que pena, você não pode ser um doador de sangue pois seu peso é de %.2f kg e precisamos que esteja acima de 50 kg. :/
                        """.formatted(peso));
            }
        }
    }
    static void atividade10(Scanner ler){
        System.out.printf("""
                ****** Sistema de proteção às testemunhas da Polícia Federal ******
                
                Digite seu código de acesso:
                """);
        int codigoAcesso = ler.nextInt();
        System.out.println("Agora informe o seu nível de permissão:");
        int nivelPermissao = ler.nextInt();

        if(codigoAcesso == 2023 && (nivelPermissao > 0 && nivelPermissao < 4)){
            System.out.println("Maravilha, você conseguiu entrar! Use o sistema com cautela ...");
        }else{
            boolean criterioCodigoAcesso = codigoAcesso == 2023;
            boolean criterioNivelPermissao = nivelPermissao > 0 && nivelPermissao < 4;
            if(!criterioCodigoAcesso){
                System.out.println("ERRO! Código de acesso inválido, não foi permitido o acesso ao sistema e notificamos a PF. :O");
            }else if (!criterioNivelPermissao){
                System.out.println("ERRO! Nível de permissão incorreto, não foi permitido o acesso ao sistema e notificamos a PF. :O");
            }
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//        atividade1();
//        atividade2();
//        atividade3();
//        atividade4(ler);
//        atividade5(ler);
//        atividade6(ler);
//        atividade7(ler);
//        atividade8(ler);
//        atividade9(ler);
//        atividade10(ler);
    }
}
