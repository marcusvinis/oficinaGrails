package porra

// create-domain-class Classe
// Para definir cpf unico, nas constraints, definir
// unique: true

class Pessoa {

    String nome
    Date nascimento
    String cpf

    static hasOne = [tipoPessoa: TipoPessoa]

    static constraints = {

        nome: nullable: false

    }
}
