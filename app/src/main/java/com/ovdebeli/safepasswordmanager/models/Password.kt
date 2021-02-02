package com.ovdebeli.safepasswordmanager.models

data class Password(
    var password: String,
    var email: String,
    var username: String,
    var imageID:Int,
    var site:String

) {
}