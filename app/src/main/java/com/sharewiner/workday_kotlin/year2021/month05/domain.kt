package com.sharewiner.workday_kotlin.year2021.month05

/**
 * Created By shao
 * on 5/21/21
 *
 * 描述:
 */
class domain {

    data class Forecast(val date: String, val description: String, val high: Int, val low: Int)

    data class ForecastList(val city: String, val country: String, val dailyForecast:List<Forecast>)
}