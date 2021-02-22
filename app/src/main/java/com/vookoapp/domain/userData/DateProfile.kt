package com.vookoapp.domain.userData

import com.vookoapp.domain.userData.enums.dateProfile.*
import com.vookoapp.domain.userData.enums.profile.Gender
import com.vookoapp.domain.userData.enums.profile.Nationality

class DateProfile (
        override val aboutMe: String,
        override val lookingFor: Array<String>,
        override val gender: Gender,
        override val nationality: Nationality,

        override val alcohol: Boolean,
        override val orientation: Orientation,
        override val sport: Sport,
        override val politics: Politics,
        override val smoking: Boolean,
        override val pets: Pets,

        val education: String,
        val religion: Religion,
        val children: Boolean,
        val height: Int
        ) : UserProfile, RelationProfile
{

}
