# modulogit

API REST, Spring Boot, Mysql

url: http://localhost:8080/

Status  do Serviço
@GetMapping(path = "/api/status")

Consulta Registro
@GetMapping(path = "/api/usuario/{codigo}") 

Criar Novo
@PostMapping(path = "api/usuario/salvar")

{
    "codigo":Int,
    "nome": “string”,
    "login": “string”,
    "senha": “string”
}

Deletar
@DeleteMapping (path = "api/usuario/delete")

{
    "codigo":Int,
    "nome": “string”,
    "login": “string”,
    "senha": “string”
}

Atualizar
@PutMapping (path = "api/usuario/atualizar")
{
    "codigo":Int,
    "nome": “string”,
    "login": “string”,
    "senha": “string”
}
