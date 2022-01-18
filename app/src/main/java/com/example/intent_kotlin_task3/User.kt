package com.example.intent_kotlin_task3

import android.os.Parcel
import android.os.Parcelable

class User : Parcelable {
    var name: String = ""
    var age: String = ""

    constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        age = parcel.readString().toString()
    }


    constructor()
    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }

    override fun describeContents(): Int {
        return 0;
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        p0.writeString(name)
        p0.writeString(age)
    }

    override fun toString(): String {
        return "$name : $age"
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}