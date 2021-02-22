package com.vookoapp.domain.userData

import com.vookoapp.domain.userData.enums.jobProfile.Employment
import com.vookoapp.domain.userData.enums.jobProfile.Expirience
import com.vookoapp.domain.userData.enums.profile.Gender
import com.vookoapp.domain.userData.enums.profile.Nationality


// Networking profile
class JobProfile(
        override val aboutMe: String,
        override val lookingFor: Array<String>,
        override val gender: Gender,
        override val nationality: Nationality,

        val employment: Employment,
        val expirience: Expirience,
        val education: String
        ) : UserProfile {
}
