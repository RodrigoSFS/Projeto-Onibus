import java.util.Scanner;

public class OnibusCopy{
  public static void main (String [] args){
    
    int assentos [] [] = new int [10] [4];
    int numeroAssento = 1;
    int escolha = 1;
    int escolhaAssento = 0;

    Scanner sc = new Scanner(System.in);

    clearScreen();

    System.out.println("===========>> Seja Bem Vindo ao <===========");
    System.out.println("  Sistema de reservas e vendas de assentos ");
    System.out.println();

    for (int i = 0 ; i < 10 ; i++){
      for (int j = 0 ; j < 4 ; j++){
        assentos [i] [j] = numeroAssento;
        numeroAssento++;
      }
    }


    //a variável "escolha", é entre as escolhas de operações no sistema, de compra de assento, ou reserva, ou cancelar reserva. 
    while(escolha != 0){
      
      printOnibus(assentos);

      System.out.println();

      String option [] = {" Digite [1] para comprar um assento.", " Digite [2] para reservar um assento.", " Digite [3] para cancelar a reserva de um assento.", " Digite [0] para Fechar o Programa."};

      for (String op : option){
        System.out.println(op);
      }
      
      escolha = sc.nextInt();
      System.out.println();
      System.out.println(" Opcao escolhida: " + escolha);

      //Esse while é para exibir a mensagem de erro, até o usuário esrever um valor válido
      while (escolha < 0 || escolha > 3)
      {
        System.out.println();
        System.out.println(" Opcao invalida digite novamente: ");
        System.out.println();
        System.out.println(" Digite [1] para comprar um assento.");
        System.out.println(" Digite [2] para reservar um assento.");
        System.out.println(" Digite [3] para cancelar a reserva de um assento.");
        escolha = sc.nextInt();
        System.out.println();
        System.out.println(" Opcao escolhida: " + escolha);
      }
      if (escolha != 0){
        System.out.println();
        System.out.println(" Digite que assento deseja que seja realizado a operação: ");
        System.out.println("      Ou digite [0] para voltar a selecao anterior.");
        System.out.println();
        escolhaAssento = sc.nextInt();
        System.out.println();
        System.out.println(" Opcao escolhida: " + escolhaAssento);

        //Esse while é para exibir a mensagem de erro, até o usuário esrever um valor válido
        while (escolhaAssento < 0 || escolhaAssento > 40)
        {
          System.out.println();
          System.out.println(" Opcao invalida digite novamente: ");
          System.out.println();
          System.out.println(" Digite que assento deseja que seja realizado a operação: ");
          System.out.println("      Ou digite [0] para voltar a selecao anterior.");
          System.out.println();
          escolhaAssento = sc.nextInt();
          System.out.println();
          System.out.println(" Opcao escolhida: " + escolhaAssento);
        }
      }
    }
  

  sc.close();

  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}

  public static void printOnibus (int assentos[] []){
    System.out.println("   ________________");
    System.out.println("  /----------------\\");
    for (int i = 0 ; i < 10 ; i++){
      for (int j = 0 ; j < 4 ; j++){

        if (j == 0 || j == 2){
          System.out.print(" | ");
        } else {
          System.out.print(" ");
        }

        if (assentos [i] [j] != 0 && assentos [i] [j] > 0){
          System.out.printf("%3d", assentos [i] [j]);
        } else if (assentos [i] [j] == 0){
          System.out.printf("%3s", "V");
        } else if (assentos [i] [j] < 0){
          System.out.printf("%3s", "R");
        }
      }

      System.out.print("|");
      System.out.println();
    }
    System.out.println("  ------------------");
  }

  public static void option1() {
    System.out.println("Opção 1 escolhida");
}

public static void option2() {
  System.out.println("Opção 2 escolhida");
}

public static void option3() {
  System.out.println("Opção 3 escolhida");
}

}