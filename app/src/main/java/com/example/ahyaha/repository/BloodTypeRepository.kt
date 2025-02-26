package com.example.ahyaha.repository

import com.example.ahyaha.model.BloodType

object BloodTypeRepository {
    fun getAllBloodTypes(): List<BloodType> {
        return listOf(
            BloodType("A+", "https://example.com/icons/blood_a_plus.png", "Positive"),
            BloodType("A-", "https://example.com/icons/blood_a_minus.png", "Negative"),
            BloodType("B+", "https://example.com/icons/blood_b_plus.png", "Positive"),
            BloodType("B-", "https://example.com/icons/blood_b_minus.png", "Negative"),
            BloodType("O+", "https://example.com/icons/blood_o_plus.png", "Positive"),
            BloodType("O-", "https://example.com/icons/blood_o_minus.png", "Negative"),
            BloodType("AB+", "https://example.com/icons/blood_ab_plus.png", "Positive"),
            BloodType("AB-", "https://example.com/icons/blood_ab_minus.png", "Negative")
        )
    }
}
