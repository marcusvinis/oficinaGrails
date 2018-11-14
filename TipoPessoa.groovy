package porra
//Comando para fazer após definir a regra de negocio inicial
//pega todas as models e entidades e criar as controllers e views = scafolding
//generate-all *

class TipoPessoa {

    String nome

    static hasOne = [tipoPessoa: TipoPessoa]
    static belongsTo = [tipoPessoa: TipoPessoa]

    static constraints = {

        nome: nullable: false

    }
}
