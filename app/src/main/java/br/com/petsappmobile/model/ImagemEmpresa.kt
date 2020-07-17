package br.com.petsappmobile.model

class ImagemEmpresa {

    var empresa = Empresa()
    var foto = ""

    override fun toString(): String {
        return "ImagemEmpresa(empresa=$empresa, foto='$foto')"
    }

}