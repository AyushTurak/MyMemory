package com.example.mymemory

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.view.setMargins
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        private  const val MARGIN_SIZE =10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
     val cardWidth = parent.width/2 - (2* MARGIN_SIZE)
        val cardHeight = parent.height/4 - (2* MARGIN_SIZE)
        val cardSideLength = minOf(cardHeight,cardWidth)
        val view =   LayoutInflater.from(context).inflate(R.layout.memory_card,parent,false)
      val layoutParams  = view.findViewById<CardView>(R.id.card_image).layoutParams as ViewGroup.MarginLayoutParams
    layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength
        layoutParams.setMargins(MARGIN_SIZE,MARGIN_SIZE,MARGIN_SIZE,MARGIN_SIZE)
     return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return numPieces
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      holder.bind(position)
    }
inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

}
}

private fun RecyclerView.ViewHolder.bind(position: Int) {

}



