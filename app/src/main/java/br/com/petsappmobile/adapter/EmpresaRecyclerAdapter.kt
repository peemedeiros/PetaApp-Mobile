package br.com.petsappmobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.petsappmobile.R
import br.com.petsappmobile.model.Empresa
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_lista_empresas.view.*

class EmpresaRecyclerAdapter (var lista: List<Empresa>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.layout_lista_empresas, parent, false)

        return EmpresaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is EmpresaViewHolder -> {
                holder.bind(lista[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class EmpresaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val txtNome: TextView = itemView.txt_nome_empresa
        val txtNota: TextView = itemView.txt_nota_empresa
        val imgEmpresa: ImageView = itemView.logo_empresa

        fun bind(empresa: Empresa){
            txtNome.text = empresa.nome_fantasia
            txtNota.text = empresa.nota.toString()

            if( empresa.foto.size > 0 ){
                Glide.with(itemView.context)
                    .load("http://192.168.1.106:8000/storage/"+empresa.foto[0].foto)
                    .into(imgEmpresa)
            }

        }

    }

}