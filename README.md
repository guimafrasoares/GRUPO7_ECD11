

# Hello World Example

This repository is a template for exploring CI/CD practices.

## Tools
1. **Maven** - para a realização do build.
2. **Checkstyle** - foi utilizado o sun_checks.xml para validação do padrão de código.
3. **JUnit** - foi utilizado para execução dos testes automatizados.

## Pipeline
A rotina é executada automaticamente a cada *Pull Request* e a cada *Commit*.
### Etapa de execução - Foi dividido em três etapas.
1. **Build da Solução** - Executa o build da solução.
2. **Rodar Padrão de Código** - Verifica o padrão de código utilizado com base no sun_checks.xml
3. **Rodar os Testes Unitários** - Executa automaticamente os testes unitários.

#
#### Participantes:
- Adriano Gebert Gomes
- Guilherme Mafra Soares
- Henrique Rosa Carvalho
- Luigi Vaz Ferreira
- Marja de Sordi
