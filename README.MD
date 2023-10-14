# Como executar o projeto
1. Clique com o botão direito do mouse na classe que contém um método main, no caso do nosso projeto, __TelaMenu.java__
2. Escolha a opçãao __"Run As > Java Application"__

![img1](./doc/img/img1.jpg)

Ao fazer isso, uma pequena janela será apresentada

![img2](./doc/img/img2.jpg)

Se você clicar no menu __Usuario > Pesquisar__ verá que uma janela de confirmação _modal_ será apresentada.

![img3](./doc/img/img3.jpg)

![img4](./doc/img/img4.jpg)

 Caso sua classe __TelaMenu__ tenha sido executada ao menos uma vez, haverá um perfil de execução disponível para essa classe que pode ser conferido em __"Run > Run Configurations..."__
 
![img5](./doc/img/img5.jpg)

![img6](./doc/img/img6.jpg)
 
Esse perfil de execução é necessário caso se queira gerar um jar executável para o projeto.

# Como executar o jar tela.jar - Eclipse/STS/Windows Explorer

Para executar o jar da aplicação é necessário acessar o diretório do projeto TelaMenu/export e dar um duplo-clique no arquivo. Isso funciona tanto de dentro do Eclipse/Spring Tool Suite(STS) quanto a partir do Windows Explorer. 

![img17](./doc/img/img17.jpg)

# Como executar o jar tela.jar - CMD

Para executar o jar a partir do prompt basta executar o comando

	java -jar tela.jar

mas é necessário que o prompt esteja apontando para o diretório do projeto ./TelaMenu/export

# Como gerar um jar executável para o projeto - script ANT

Para gerar um novo jar do projeto basta clicar com o botão direito no arquivo __"buildfile.xml > Run As > Ant Build"__

![img15](./doc/img/img15.jpg) 

![img16](./doc/img/img16.jpg) 

# Como gerar um jar executável para o projeto - sem script ANT

 1. Clique com o botão direito do mouse sobre o projeto e escolha a opção __"Export..."__.
 
![img7](./doc/img/img7.jpg) 
 
 2. Escolha a opção __"Runnable Jar"__ e clique em __"Next"__.
 
![img8](./doc/img/img8.jpg) 
  
 3. No campo __"Lauch Configurations"__ escolha o perfil de execução de __TelaMenu__.
 
![img9](./doc/img/img9.jpg) 
  
 4. No campo __"Export destination"__ preencha com o nome do arquivo jar que será gerado, no caso, __TelaMenu\export\tela.jar__. Observe que o jar será gerado no diretório __export__ dentro da estrutura do nosso projeto.
 
![img10](./doc/img/img10.jpg)   
  
  
 5. Na opção __"Library handling"__ devemos escolher a opção __"Package required libraries into generated JAR"__ para que todos os jar's de dependência, isto é, aquelas bibliotecas necessárias para a execução do nosso projeto, sejam incluídas dentro do arquivo jar sendo gerado.

 ![img11](./doc/img/img11.jpg)   

 6. Por fim, vamos marcar a opção __"Save as ANT script"__ para que todas essas opções sejam armazenadas em um script ANT para que das próximas vezes que precisemos gerar nosso jar baste executar esse script.

 ![img12](./doc/img/img12.jpg)

 7. Com todas as opção configuradas, clique em __"Finish"__

 ![img13](./doc/img/img13.jpg)

 8. Uma mensagem de alerta será apresentada, 

  ![img14](./doc/img/img14.jpg)

  basta clicar em __"OK"__ e o jar será gerado.