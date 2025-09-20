
# Projeto de Exemplo com Maven

Este é um projeto simples desenvolvido com o **Apache Maven**, focado em demonstrar práticas de gerenciamento de dependências, automação de compilação e organização de um projeto em Java. O objetivo é explorar o funcionamento de um projeto Java moderno utilizando ferramentas padrão do mercado.

---

## 🚀 Tecnologias Utilizadas
- **Linguagem:** Java  
- **Gerenciador de Dependências:** Maven  
- **IDE Recomendada:** IntelliJ IDEA ou Eclipse  
- **Controle de Versão:** Git  

---

## 📦 Funcionalidades do Projeto
- Configuração de um projeto Java com Maven  
- Gerenciamento de dependências  
- Estruturação de código modular (src, model, mapper)  
- Geração de builds automatizados  

---

## 🔧 Como Rodar o Projeto

```bash
# Clone o repositório
# Clone o repositório
[Clone o repositório](https://github.com/Richard-Sup-Dev/dio-primeiro-projeto-maven.git)



# Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code)

# Compile o projeto usando o Maven
mvn clean install

# Execute a classe principal
mvn exec:java -Dexec.mainClass="com.meuprojeto.Main"
📂 Estrutura do Projeto
bash
Copiar código
meu-projeto-maven/
├── src/
│   ├── main/
│   │   ├── java/com/meuprojeto/Main.java
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
