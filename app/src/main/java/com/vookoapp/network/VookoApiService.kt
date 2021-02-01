package com.vookoapp.network

import com.vookoapp.Consts
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

interface VookoApiService{

}


object VookoApiNetwork {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Consts.getConsts().VOOKO_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val vookoApi = retrofit.create(VookoApiService::class.java)
}