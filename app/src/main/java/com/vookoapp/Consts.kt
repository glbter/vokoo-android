package com.vookoapp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object Consts {
    private lateinit var VOOKO_URL: String

    init {
         CoroutineScope(Dispatchers.IO).launch {
             VOOKO_URL = ""
             // TODO: file parsing
         }
    }

    fun getConsts(): VookoConsts {
        return VookoConsts(VOOKO_URL)
    }

    data class VookoConsts(val VOOKO_URL: String)
}