# API REST Politicos Principal

API principal(pois haverá uma segunda que consome ela) para a criação de politicos em seus devidos cargos, sendo eles, Vereador, Governador, Deputado, Senador, Ministro, Prefeito e Presidente.

Onde será inseridos os seus dados(alguns deles sensiveis como CPF e endereço), processos e projetos.



Os metodos gets, estão livres para uso de todos, porem tem um filtro para não ser disponibilizado os dados sensiveis.



Esses dados sensiveis só poderam ser vistos pelo admim, após a liberação com o uso do token.



O usuario Admim, poderá utilizar todos os metodos HTTP, após a liberação usando o token.



Para a geração do token será necessario fazer a solicitação utilizando usuario e senha disponibilizado logo abaixo, no endpoint **localhost:8080/v1/auth**



Este token tem um limite de tempo de 100 min para uso, após o tempo expirado só terá acesso aos metodos Gets e sem acesso aos dados sensiveis, sendo necessario a atualização do token.





## Login para o token
user: **Admin**

senha: **Gft2021**

porta de acesso: **localhost:8080/(cargo, exemplo: vereadores)**


