package mjv.aguaeluz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class GeradorArquivoNot {
	
	public void escreverDiscoNot (String conteudoGeradoNot ) {
		
		LocalDate now = LocalDate.now();
		
		String nomeArquivo = now.toString() + ".txt";
		Path path = Paths.get("c:\\estudos\\mjv-java-school\\agua-luz-contratos", nomeArquivo);
		
		try {
			File diretorio = new File ("c:\\estudos\\mjv-java-school\\agua-luz-contratos");
			
			if (! diretorio.exists())
				diretorio.mkdirs();
			
			Files.write(path, conteudoGeradoNot.getBytes(StandardCharsets.UTF_8));
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}


/*
 Arquitetura
Ser�o dois projetos Java Maven denominados: agua-luz-atracao e agua-luz-notificacao
O projeto agua-luz-atracao dever� disponibilizar um mecanismo de inclus�o dos dados de cadastro (fake banco de dados)
O projeto agua-luz-atracao dever� disponibilizar dois arquivos no diret�rio C:\estudo\mjv-java-school\agua-luz-output com os nomes abaixo:
agua-luz-contratos.csv obedecendo o layout padr�o delimitador (;)
agua-luz-contratos.txt obedecendo o layout padr�o posicional
O projeto agua-luz-notificacao dever� realizar a leitura dos contratos pelo arquivo agua-luz-contratos.txt para poder criar e enviar a mensagem via Sms ou Whatsapp
O projeto agua-luz-notificacao dever� realizar a gera��o de arquivo contrato-xxx.txt contendo a mensagem gerada. (Este requisito � um PLUS)
 */
