package com.example.tujutuju.data.response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

	@field:SerializedName("meta")
	val dataChangePassword: DataChangePassword
)

data class Meta(

	@field:SerializedName("code")
	val code: Int,

	@field:SerializedName("message")
	val message: String
)
