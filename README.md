# QA Interview Prep - Maven Project

Projeto para treinar JUnit5, Mockito e (opcional) Selenium.
Importe no IntelliJ como Maven Project: File -> Open -> selecione a pasta onde está o pom.xml.

## Como rodar
- Usando IntelliJ: clique com o botão direito em uma classe de teste em `src/test/java` e escolha Run.
- Usando terminal (na pasta do projeto):
  mvn test

## Observações Selenium
O teste de Selenium está comentado. Para usar, instale o ChromeDriver, configure o caminho e remova os comentários do arquivo `CalculatorSeleniumTest.java`.