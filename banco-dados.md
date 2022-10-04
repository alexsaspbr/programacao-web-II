
```plantuml
@startuml
!theme vibrant

!define primary_key(x) <b><color:#b8861b><&key></color> x</b>
!define foreign_key(x) <color:#aaaaaa><&key></color> x
!define column(x) <color:#efefef><&media-record></color> x
!define table(x) entity x << (T, white) >>

left to right direction
skinparam roundcorner 5
skinparam linetype ortho
skinparam shadowing false
skinparam handwritten false
skinparam class {
    BackgroundColor white
    ArrowColor #2688d4
    BorderColor #2688d4
}

table( cliente ) {
  primary_key( id ): LONG 
  column( nome ): VARCHAR(100) NOT NULL 
  column( cpf ): VARCHAR(11) UNIQUE NOT NULL
  column( data_nascimento ): DATE NOT NULL
  column( apelido ): VARCHAR(100)
  --
}

table( conta ) {
  primary_key( id ): LONG
  column( numero ): LONG UNIQUE NOT NULL 
  column( data_criacao ): TIMESTAMP NOT NULL
  column( saldo ): DECIMAL(16,2)
  --
  foreign_key(cliente_id) LONG
}

cliente ||..|{ conta

@enduml
```
