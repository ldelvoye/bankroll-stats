package com.ldelvoye.bankrollstats

//import platform.UIKit.UIDevice

class IOSPlatform: Platform {
//    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override val name: String = "iOS isn't implemented yet"
}

actual fun getPlatform(): Platform = IOSPlatform()