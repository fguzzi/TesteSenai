package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteNavagabilidade {

	ChromeDriver driver; // Driver do Google Chrome
	
	// Pré teste
	@Before
	public void PreTeste() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();  // Abrir o navegador
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
	}
	
	
	// Teste
	@Test
	public void TesteNavegacao() {
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
	// Pós teste
	// @After
	// public void PosTeste() {
		//driver.quit();
	// }
	   
}
