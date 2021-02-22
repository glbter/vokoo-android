package com.vookoapp.domain.userData

import com.vookoapp.domain.userData.enums.profile.Gender
import com.vookoapp.domain.userData.enums.profile.Nationality

interface UserProfile {
    val aboutMe: String
    val lookingFor: Array<String>
    val gender: Gender
    val nationality: Nationality
}




