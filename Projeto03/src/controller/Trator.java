package controller;

import util.Teclado;

public class Trator {
 public static void main(String[] args) {
	 
 int cavalos, ano, quilometragem ;
 
 cavalos = Teclado.lerInt("Digite a Quantidade do Cavalos:");
 ano = Teclado.lerInt("Digite o Ano:");
 quilometragem = Teclado.lerInt("Informe a Quilometragem:");
 
 
 
 if (cavalos >= 100) {
 System.out.println("Avalia��o_cavalos � FORTE" );
 }else{
	 System.out.println("Avalia��o_cavalos � FRACO" );
 }
 }
}