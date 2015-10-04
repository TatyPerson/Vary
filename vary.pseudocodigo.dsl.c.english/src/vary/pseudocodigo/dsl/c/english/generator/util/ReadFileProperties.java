package vary.pseudocodigo.dsl.c.english.generator.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileProperties {
	
	public ReadFileProperties() {
		
	}
	
	public String readFilePropertiesWindows(String uri) throws IOException {
		
		String fileContent = new String();
		String inputLine;
		BufferedReader buffer = new BufferedReader(new FileReader(uri));
		//Los tengo que quitar solo son para hacer las pruebas
		ProjectLocationFolder.getLogger().error("BufferedReader con:");
		ProjectLocationFolder.getLogger().error(uri);

		while ((inputLine = buffer.readLine()) != null) {
			fileContent = fileContent + inputLine;
		}
			
		buffer.close();
		
		return fileContent;
	}
	
	public String readFilePropertiesUnix(String uri) throws IOException {
		
		String fileContent = new String();
		String inputLine;
		Path path = Paths.get(uri, ".varyproject");
		//Los tengo que quitar solo para hacer las pruebas
		ProjectLocationFolder.getLogger().error("Estoy aqui!");
		ProjectLocationFolder.getLogger().error(path);

		URL url = new URL(path.toString());
		InputStream inputStream = url.openConnection().getInputStream();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));

		while ((inputLine = buffer.readLine()) != null) {
			fileContent = fileContent + inputLine;
		}

		buffer.close();
		
		return fileContent;
	}
	
}
