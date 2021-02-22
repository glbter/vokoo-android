package com.vookoapp.domain.userData

import com.vookoapp.domain.userData.enums.dateProfile.*
import com.vookoapp.domain.userData.enums.friendProfile.Relations
import com.vookoapp.domain.userData.enums.profile.Gender
import com.vookoapp.domain.userData.enums.profile.Nationality

class FriendProfile(
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

        val relations: Relations
        ) : UserProfile, RelationProfile {
}

