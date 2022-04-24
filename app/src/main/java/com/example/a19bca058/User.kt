package com.example.a19bca058

data class User (var password: String, var email:String) {
    var Id:Int = 0;
    constructor(Id:Int,password: String,email: String):this(password,email)
    {
        this.Id = Id
    }
}