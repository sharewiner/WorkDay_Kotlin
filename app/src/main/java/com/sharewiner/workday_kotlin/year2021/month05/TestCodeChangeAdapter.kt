package com.sharewiner.workday_kotlin.year2021.month05

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sharewiner.workday_kotlin.R
import com.sharewiner.workday_kotlin.year2021.month05.domain.*
import kotlinx.android.synthetic.main.item_text_code_change.view.*

/**
 * Created By shao
 * on 5/21/21
 *
 * 描述:
 */
class TestCodeChangeAdapter(val items: ForecastList) :
    RecyclerView.Adapter<TestCodeChangeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
//        val tv_content: TextView = itemView.findViewById(R.id.tv_content) as TextView

        fun bindForecast(forecast: domain.Forecast) {
            with(forecast) {
                itemView.tv_content.text = "$date - $description - $high/$low"
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_text_code_change, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.dailyForecast.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val content = items.dailyForecast[position]
//        with(content) {
//            holder.tv_content.text = "$date - $description - $high/$low"
//        }
    }


}