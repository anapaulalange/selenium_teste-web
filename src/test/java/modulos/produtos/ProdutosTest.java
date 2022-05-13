package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web do Módulo de Produto")
public class ProdutosTest {
    @Test
    @DisplayName("Não é permitido registrar um produto com valor igual a Zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {

        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Vou maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a página da lojinha web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");

        //Fazer login
        navegador.findElement(By.cssSelector('label[for='usuario']')).click();

        //Vou para a tela de registro de produto

        //Preencher dados do produto e o valor será igual a zero

        //Submeter o formulário

        //Validar se a msg de erro foi apresentada

    }
}
