# MJV Projeto Final

#### Autor

- [Talita Rocha](https://github.com/Talita-Rocha)

Repositório contendo o código fonte de projeto "On line table reservation".

##### Tecnologias

* Java
* JPA Hibernate
* Postgre SQL
* Spring Boot
* Swagger

##### O melhor restaurante do Brasil chegou ao Rio de Janeiro
sac.restaurante@restaurante.com

[Faça a sua reseva aqui](https://cocobambu.com/unidades/botafogo-rio/).

######Reservas on line

Antecedência mínima de 2 horas para reservas, sujeito à disponibilidade.

1. Selecionar a data desejada:
   "DD/MM/AAAA"

2. Selecionar o horário:
* 11:30
* 12:00
* 12:30
* 13:00
* 19:00
* 19:30
* 20:00
* 20:30

3. Selecionar o salão;
* Salão interno
* Varanda

4. Selecionar a quantidade de pessoas;
* 2 pessoas
* 3 pessoas
* 4 pessoas
* 5 pessoas
* 6 pessoas
* 7 pessoas
* 8 pessoas
* Reservas para grupos

5. Reservas para grupos;
6. Selecionar a quantidade de pessoas, em grupo;
* 20 pessoas
* 21 pessoas
* 22 pessoas
* 23 pessoas
* 24 pessoas
* 25 pessoas
* 30 pessoas

7. Texto livre no campo abaixo para “ocasiões especiais, restrições, dúvidas”;

8. Clicar em "prosseguir"

9. Seus dados de contato

* Informar seu nome completo;
* Informar seu telefone;
* Informar seu e-mail

10. Clicar em "prosseguir"

Enviar confirmação por e-mail.

Título: Nome do restaurante - Sua reserva está aguardando aprovação
/*
\t Olá, "Customer [name=" + name + "]"  
 

"Sua reserva para grupo está em análise para aprovação./n"
"Você receberá um novo e-mail com a resposta da sua reserva./n"

Formato da data Sexta-feira, 3 de dezembro de 2021
"para 20 pessoas às" hora=" + hora + " //20:00
*/

11. Link “cancelar reserva” direciona para o site na página de reserva.

##### Apresentação


1. Salvar reserva
2. Pesquisar reserva
3. Alterar reserva
4. Cancelar reserva

##### JSON Cadastros

* Criar uma reserva

```
[
  {
    "idReserve": 1,
    "dataHora": "2022-05-20T20:00:00.322",
    "unit": "BOTAFOGO_RIO",
    "hall": "INTERNO",
    "numberPeople": "DUAS",
    "status": "EM_ANÁLISE",
    "notification": "EMAIL",
    "note": "Comemoração da School",
    "name": "Jeice Lobato",
    "phone": "21998765432",
    "email": "jeice_lobato@gmail.com"
  },
  {
    "idReserve": 2,
    "dataHora": "2022-05-20T20:30:00.322",
    "unit": "BOTAFOGO_RIO",
    "hall": "INTERNO",
    "numberPeople": "DUAS",
    "status": "EM_ANÁLISE",
    "notification": "EMAIL",
    "note": "Comemoração da School",
    "name": "Jeice Lobato",
    "phone": "21998765432",
    "email": "jeice_lobato@gmail.com"
  },
  {
    "idReserve": 3,
    "dataHora": "2022-05-20T21:00:00.258",
    "unit": "BOTAFOGO_RIO",
    "hall": "INTERNO",
    "numberPeople": "QUATRO",
    "status": "EM_ANÁLISE",
    "notification": "EMAIL",
    "note": "Comemoração da School",
    "name": "Nicole Valencia",
    "phone": "21998765432",
    "email": "nicole_valencia@gmail.com"
  },
  {
    "idReserve": 4,
    "dataHora": "2022-05-20T21:00:00.258",
    "unit": "BOTAFOGO_RIO",
    "hall": "VARANDA",
    "numberPeople": "SEIS",
    "status": "EM_ANÁLISE",
    "notification": "EMAIL",
    "note": "Comemoração da School",
    "name": "Gleyson Sampaio",
    "phone": "21998765432",
    "email": "gleyson_sampaio@gmail.com"
  }
]
```
* Alterar reserva

```
{
  "idReserve": 1
}
```

* Cancelar reserva

```
{
 "idReserve": 4 
}
```

