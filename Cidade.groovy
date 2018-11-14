package porra

class Cidade {

    String nome
    String uf

    static belongsTo = [estado: Estado]

    static constraints = {

        nome nullable: false
        uf nullable: true

    }
}
