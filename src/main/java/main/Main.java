package main;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.BasePO;
import core.DriverFactory;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		try {
			System.setProperty("webdriver.chrome.driver", "driverNavegador//chromedriver.exe");
			
			WebDriver driver = DriverFactory.getDriver();
			driver.manage().window().maximize();
			driver.get("https://forms.gle/1AxNWtT9jX7k51i88");
			BasePO po = new BasePO();
			/*po.clicarBotao(By.xpath("//*[@id='btnVamos1']"));
			po.escrever(By.id("txtEmail"), System.currentTimeMillis()+"@gmail.com");
			po.escrever(By.id("txtSenha"), "123");
			po.escrever(By.id("txtSenha2"), "123");
			po.clicarBotao(By.id("btnCad"));
			

			po.escrever(By.id("name"), "auto");
			po.escrever(By.id("data"), "12/12/1999");
			po.escrever(By.id("telefone1"), "123456789");
			po.escrever(By.id("telefone2"), "123456780");
			po.escrever(By.id("rua"), "rua teste");
			po.escrever(By.id("num"), "123");
			po.escrever(By.id("bairro"), "centro");
			po.escrever(By.id("complemento"), "456");
			po.escrever(By.id("cidade"), "São Paulo");
			po.escrever(By.id("estado"), "SP");
			po.escrever(By.id("cep"), "09910080");
			
			po.clicarBotao(By.id("btnEnvia"));*/
			
			
			
		} finally {
			//DriverFactory.killDriver();
		}
		
		
		
	}
	
}
