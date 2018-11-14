package porra

class Estado {

    String nome
    String uf

    //relacionamento entre as domains
    //não foi definido um id
    //automaticamento o grails vai definir um id para essa domain

    static hasMany = [cidade: Cidade]

    static constraints = {
        nome nullable: false
        uf nullable: true
    }
}
