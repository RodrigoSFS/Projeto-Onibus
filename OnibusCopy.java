import java.util.Scanner;

public class OnibusCopy {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int assentos[][] = new int[10][4];
    int escolha = 1;

    System.out.println();

    printOla();

    preencheOnibus(assentos);

    while (escolha != 0) {

      printOnibus(assentos);

      System.out.println();

      printMenu();

      try {
        escolha = sc.nextInt();
        switch (escolha) {
          case 1:
            option1(assentos);
            break;
          case 2:
            option2(assentos);
            break;
          case 3:
            option3(assentos);
            break;
          case 0:
            System.out.println("Saindo...");
            break;
        }
      } catch (Exception ex) {
        System.out.println("Por favor, entre com um inteiro entre 1 e 3");
        sc.next();
      }

    }

    sc.close();
  }

  public static void printOla(){
    System.out.println("===============>> Seja Bem Vindo <<===============");
    System.out.println("==>> Sistema de reservas e vendas de assentos <<==");
    System.out.println("==========>> Rodrigo - Marcos - Bruno <<==========");
    System.out.println();
  }

  public static void printMenu() {
    String option[] = { " Digite [1] para comprar um assento.", " Digite [2] para reservar um assento.",
        " Digite [3] para cancelar a reserva de um assento.", " Digite [0] para Fechar o Programa. " };

    for (String op : option) {
      System.out.println(op);
    }
  }

  public static void preencheOnibus(int assentos[][]) {
    int numeroAssento = 1;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        assentos[i][j] = numeroAssento;
        numeroAssento++;
      }
    }

  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void printOnibus(int assentos[][]) {
    System.out.println("   ________________");
    System.out.println("  /----------------\\");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {

        if (j == 0 || j == 2) {
          System.out.print(" | ");
        } else {
          System.out.print(" ");
        }

        if (assentos[i][j] != 0 && assentos[i][j] > 0) {
          System.out.printf("%3d", assentos[i][j]);
        } else if (assentos[i][j] == 0) {
          System.out.printf("%3s", "V");
        } else if (assentos[i][j] < 0) {
          System.out.printf("%3s", "R");
        }
      }

      System.out.print("|");
      System.out.println();
    }
    System.out.println("  ------------------");
  }

  public static void option1(int assentos[][]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Opção 1 escolhida");

    System.out.print("Digite que assento deseja que seja realizado a operação:");
    int escolhaAssento = sc.nextInt();
    
    clearScreen();

    for (int l = 0; l < 10; l++) {
      for (int c = 0; c < 4; c++) {
        if (escolhaAssento == assentos[l][c]) {
          assentos[l][c] = 0;
        }
      }
    }

  }

  public static void option2(int assentos[][]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Opção 2 escolhida");

    System.out.print("Digite que assento deseja que seja realizado a operação:");
    int escolhaAssento = sc.nextInt();

    clearScreen();

    for (int l = 0; l < 10; l++) {
      for (int c = 0; c < 4; c++) {
        if (escolhaAssento == assentos[l][c]) {
          assentos[l][c] = assentos[l][c] * -1;
        }
      }
    }

  }

  public static void option3(int assentos[][]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Opção 3 escolhida");

    System.out.print("Digite que assento deseja que seja realizado a operação:");
    int escolhaAssento = sc.nextInt();

    clearScreen();

    for (int l = 0; l < 10; l++) {
      for (int c = 0; c < 4; c++) {
        if (escolhaAssento == assentos[l][c] * -1) {
          assentos[l][c] = assentos[l][c] * -1;
        }
      }
    }

  }

}