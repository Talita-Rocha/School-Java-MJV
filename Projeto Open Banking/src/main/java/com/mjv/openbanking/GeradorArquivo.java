package com.mjv.openbanking;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/*In Java, we can use Files.write to create and write to a file.
https://mkyong.com/java/java-how-to-create-and-write-to-a-file/

O conteúdo deverá ser disponibilizado via arquivo chamado de AAAA-MM-DD_movimentacao.txt no 
diretório: c:\estudos\banco_central\movimentacoes
*/

public class GeradorArquivo {
	public void escreverDisco (String conteudoGerado) {
		LocalDate now = LocalDate.now();
		
		//ASSIM:
		String nomeArquivo = now.toString() + ".txt";
		Path path = Paths.get("c:\\estudos\\banco_central\\movimentacoes", nomeArquivo);
		//OU:Path path = Paths.get("c:\\estudos\\banco_central\\movimentacoes" + now.toString() + ".txt"); 
		
		try {
			File diretorio = new File ("c:\\estudos\\banco_central\\movimentacoes");
			
			if (! diretorio.exists())
				diretorio.mkdirs();
			
			Files.write(path, conteudoGerado.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
	}

}
