package com.ldelvoye.bankrollstats

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform