package br.com.petsappmobile.model

class Empresa() {

    var id: Int = 0
    var nome_fantasia: String = ""
    var telefone_empresa: String = ""
    var logradouro: String = ""
    var numero: String = ""
    var cidade: String = ""
    var uf: String = ""
    var transporte: Int = 0
    var categoria = ArrayList<Categorias>()
    var nota: Int = 0
    var foto = ArrayList<Fotos>()

    override fun toString(): String {
        return "Empresa(id=$id, nome_fantasia='$nome_fantasia', telefone_empresa='$telefone_empresa', logradouro='$logradouro', numero='$numero', cidade='$cidade', uf='$uf', transporte=$transporte, categoria=$categoria, nota=$nota, foto=$foto)"
    }
}