package Exercicio_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessadorXML {
	private String caminhoArquivo;
	public ProcessadorXML(String pCaminhoArquivo)
	{
		try {
			caminhoArquivo = pCaminhoArquivo;
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void lerArquivo()
	{
		Scanner sc = null;
		try {
			File f = new File(caminhoArquivo);
			sc = new Scanner(f);
			String dados = sc.next();
			System.out.println(dados);
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(sc != null)
				sc.close();
		}
	}
	public static void main(String[] args) {
		try {
			ProcessadorXML le = new ProcessadorXML("nf/1.xml");
			le.lerArquivo();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
