package com.sharewiner.workday_kotlin.year2021.month05

import java.text.DateFormat
import java.util.*
import com.sharewiner.workday_kotlin.year2021.month05.domain.Forecast as ModelForecast

/**
 * Created By shao
 * on 5/21/21
 *
 * 描述:
 */
public class DataMapper {
    fun convertFromDataModel(forecast: ForecastResult): domain.ForecastList {
        return domain.ForecastList(
            forecast.city.name,
            forecast.city.country,
            convertForecastListToDomain(forecast.list)
        )
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(
            convertDate(forecast.dt),
            forecast.weather[0].description,
            forecast.temp.max.toInt(),
            forecast.temp.min.toInt()
        )
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(
            DateFormat.MEDIUM,
            Locale.getDefault()
        )
        return df.format(date * 1000)
    }
}