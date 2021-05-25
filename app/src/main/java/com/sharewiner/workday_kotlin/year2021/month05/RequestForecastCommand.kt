package com.sharewiner.workday_kotlin.year2021.month05

import com.sharewiner.workday_kotlin.year2021.month05.domain.*

/**
 * Created By shao
 * on 5/21/21
 *
 * 描述:
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {


    override fun execute(): ForecastList {
        val request = RequestClasses(zipCode)
        return DataMapper().convertFromDataModel(
            request.execute()
        )
    }

}