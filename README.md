# JAVA - Projeto de Estudos


## Repositório para meus estudos em JAVA

Serve este respositório para manter os projetos, pesquisas e estudos na Linguagem de Programação JAVA para que eu possa consultar durante meu desenvolvimento neste linguagem. Se tiver alguma utilidade para si, bom proveito!!!, desde já muito obrigado pela leitura.

## Uma breve história do Meu "touch" pelo Java.
Meu primeiro contacto com a linguagem de Programação Java foi em 2003 na UNL UFCT da Caparica - Portugal utilizando a IDE NetBeans, infelizmente não completei a Licenciatura. Durante os anos e esporadicamente brincava um pouco com os códigos Java utilizando a IDE Eclipse, sempre com códigos muito fáceis e superficiais.

Em 2022 decidi aprofundar na linguagem comprando um curso Online, obviamente antes de comprá-lo fiz muitas pesquisas sobre ele e o professor, para ver se era credível e bom, realmente o é, já completei o curso e estou a refazê-lo, só que agora com muito mais dedicação e em complemento vou fazendo diversas pesquisas pela internet, em vídeos, tutoriais escritos, documentações oficiais e mesmo por IA.

Para além deste curso estou a fazer pequenos experimentos de outros projetos e idéias que vou retirando da internet, e a intenção deste repositório é armazena-los para uma eventual consulta.

IDEs Java que Utilizo(ei): Eclipse, Netbeans e IntelliJ. Também utiliza muito o VSC, mas para outras linguagens e scripts.

## OS Dois parágrafos abaixo são sobre minhas experiências
Levei muito tempo para decidir em qual linguagem aplicar-me e investir meu tempo, o "Java", isso não significa que vou abandonar meus estudos e trabalhos nas outras, mas irei dedicar-me mais a uma até eu a dominar.

Deixo uma lista de tecnologias que uso ou já usei por ordem de maior conhecimentos:
- Java, HTML, CSS, PHP, JavaScript, NodeJs, C/C++, Python, C#, Rust, Visual Basic, ASP.Net
- SO: Linux e Windows
- Git, Docker, Servidores (Web, DB), Virtual Machine
- IDEs e Editores: VSC, NetBeans, Eclipse, IntelliJ, Notepad++, Visual Code, etc.
- Editores de imagem e vídeo
- Mais Ferramentas antigas: Flash (ActionScript), Dreamwearver, Fireworks, Microsoft FrontPage

#### Os exercícios e explicações poderão estar comentados no próprio código ou nos pontos descritos a seguir, irei detalhar sempre no primeiro projeto que não seja repetido.

## Pontos Principais de Trabalho:

### Projeto 1 - Java Web - Tela de Login
- Ferramentas que vou Utilizar:
    - IDE Netbeans
    - Tomcat Servidor Web
    - MySQL Base de Dados
    - Dbeaver SGBD
- Criando a BD no MySQL
    - Adicionar uma nova folha de SQL Queries e aplicar os comandos a seguir:
        ``` sql
        create database proj1_java;

        use proj1_java;

        create table users (
            id_user int(11) primary key auto_increment,
            user_name varchar(100) not null,
            user_email varchar(100) not null,
            created_at timestamp default current_timestamp not null,
            updated_at timestamp default current_timestamp on update current_timestamp not null,
            deleted_at timestamp default null null
        );

        insert into users (user_name, user_email) values ('Marcos', 'marcos@teste.com');

        update users set user_name = "Marcos Melo" where id_user = 1;

        select * from users;
        ```
- Criação do Projeto Java Web no Netbeans 
    - Será um página web de Login que dá acesso a outra página.
    - Nome do Projeto: Proj1_JWLogin
    - File > New Project > Java with Ant > Java Web > Web Application > "Project_Name" > Next > Verificar se o Servidor Tomcat esta selecionado > Next > Nesta momento não selecionamos nenhuma framework > Finish.
    - Vou criar mais dois packages para seguir o modelo MVC
        - controllers
        - models
        - Na diretório Web Pages ficam as nossas "Views"
    - Alterando o nome da página inicial index.html para uma outra qualquer, necessitamos de criar o ficheiro deployment descriptor dentro do diretório "WEB-INF", para isso:
	- BT DT em cima de "WEB-INF" > New > Other... > Web > Standard Deployment Descriptor (web.xml) > Next > Finish.
	- Se o ficheiro`web.xml` não abrir automaticamente, é só editá-lo.
	- entre as tags `<web-app>` adicionar o seguinte código
	``` xml
	<welcome-file-list>
        <welcome-file>index.jsp</welcome-file>
    </welcome-file-list>
    ```
	- Dentro das tags `<welcome-file>` adicionamos o nome do nosso ficheiro, que neste caso iremos criar um `index.jsp`.
	- Apagar o "index.html" que não iremos utilizar.
	- Em cima da diretoria "Web Pages" > BT DT > New > JSP... > Damos o nome que vamos utilizar, no meu caso "Index" > Finish.
    - Podemos ver mais configurações oficiais do [Deployment Descriptor no site da Oracle](https://docs.oracle.com/cd/E13222_01/wls/docs81/webapp/web_xml.html)
    - Para descarregar a library do MySQL Connector, fazemos uma pesquisa por MySQL Connector, e fazemos download do `JDBC Driver for MySQL (Connector/J)` > selecionamos "Platform Independent" > ficheiro zip (se preferir) > em baixo da página "No thanks, just start my download" > Extrair.
	- Agora importamos para dentro do nosso projeto:
		- BT DT em cima de "Libraries" > Add JAR/Folder... > buscamos o ficheiro extraído: `mysql-connector-j-version.jar`.
- 