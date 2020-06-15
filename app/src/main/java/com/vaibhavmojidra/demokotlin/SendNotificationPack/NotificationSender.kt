package com.vaibhavmojidra.demokotlin.SendNotificationPack

class NotificationSender(val data: Data?, val to:String){
    constructor():this(null,""){}
}