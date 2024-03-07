import java.text.DecimalFormat;
import java.util.Scanner;

class console {
    
  public static void main(String[] args) {

         /*  Scanner leitor = new Scanner(System.in);
       
        System.out.println("escreva seu nome completo: ");
    
        String nome = leitor.nextLine();
   

    System.out.println("escreva a primeira nota que tirou na prova: ");
         int numero1 = leitor.nextInt();

     System.out.println("escreva a segunda nota que tirou na prova: ");
     int numero2 = leitor.nextInt();

     int resultado = (numero1 + numero2)/2;

     System.out.println("parabens senhor(a)" + nome);

     if (resultado >= 6) {
        System.out.println("aprovado");
     }

     if (resultado < 6) {
        System.out.println("recuperação");
        
     }

     if (numero1  < 1 || numero2 < 1 ) {
        System.out.println("REPROVADO!!!");
        }
   




}
 
}
*/
////////////////////////////////////////////////////////////////////////////////////////////
//EXERCICIO 1 AREA DO RETANGULO

  /*  Scanner leitor = new Scanner(System.in);


System.out.println("escreva a base do retangulo: ");

int base = leitor.nextInt();

System.out.println("escreva a altura do retangulo: ");

int altura = leitor.nextInt();

int area = (base * altura);

System.out.println("a area desse retangulo é:" + area);

  }
}
*/
//////////////////////////////////////////////////////////////////////////////////////////////
// EXERCICIO 2 CONVERTER O REAL   

 /*   Scanner leitor  = new Scanner(System.in);

System.out.println("escreva quantos reais voce quer converter: ");

double reais = leitor.nextDouble();

double dolar = reais/4.95;
double euro = reais/5.37;
double pesos = reais * 169;

DecimalFormat df= new DecimalFormat("#.##");

String dolarFormatado = df.format(dolar);
String euroFormatado = df.format(euro);
String pesosFormatado = df.format(pesos);

System.out.println("o valor de: " + reais + "reais em dolar é de:" + dolarFormatado);
System.out.println("o valor de: " + reais + "reais em euro  é de:" + euroFormatado);
System.out.println("o valor de: " + reais + "reais em pesos  é de:" + pesosFormatado);
  }
}
     */

     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
// EXERCICIO 3 QUAL É MAIOR?
/* 
Scanner leitor  = new Scanner(System.in);
System.out.println("escreva um numero inteiro: ");
int numero1 = leitor.nextInt();

System.out.println("escreva outro numero inteiro: ");
int numero2 = leitor.nextInt();

if (numero1 > numero2) {
    System.out.println("o primeiro numero '" + numero1 + "' é maior que o segundo numero  '" + numero2 + "'");
    
}
if (numero1 < numero2) {
    System.out.println("o segundo numero '" + numero2 + "' é maior que o primeiro numero '" + numero1 + "'");
    
}
if (numero1 == numero2) {
    System.out.println("os numeros são iguais");
    
}

  }
}
*/
////////////////////////////////////////////////////////////////////
/* Scanner leitor  = new Scanner(System.in);

System.out.println("escreva sua idade: ");

int idade = leitor.nextInt();


if (idade <= 13) {
    System.out.println("criança.");
    
}

if (idade >= 13 & idade < 18) 
{ System.out.println("adolecente");
    
}

if (idade > 18 & idade <= 60 ) {
    System.out.println("adulto");
    
}

if (idade >= 60) {
    System.out.println("idoso");
    

}


  }
}
*/


Scanner leitor  = new Scanner(System.in);

System.out.println("escolha 1 para tranformar de C para K ");
System.out.println("escolha 2 para tranformar de C para F ");
System.out.println("escolha 3 para tranformar de F para C ");


int escolha = leitor.nextInt();





if (escolha == 1) { 
  System.out.println("ecreva a temperatura em celcius: ");




int celcius = leitor.nextInt();
double kelvin = (celcius + 273.15);
System.out.println("a temperatura em kelvin é: " + kelvin );
}


if (escolha == 2) {
  System.out.println("ecreva a temperatura em celcius: ");
 int celcius = leitor.nextInt();

 double fah = celcius * 9 / 5 + 32.1;
System.out.println("o resultado em faehainth é: " + fah);
}



if (escolha == 3) {
  System.out.println("ecreva a temperatura em farehaint: ");


 int far = leitor.nextInt();

 double cel = (far -30) / 2;

System.out.println("o resultado em celcius é: " + cel);
}

if (escolha > 3 || escolha < 1) {
  System.out.println("escolheu errado!");
  
}



 leitor.close();

  }
}
  


