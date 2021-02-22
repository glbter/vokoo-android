package com.vookoapp.domain.userData

import com.vookoapp.domain.userData.enums.dateProfile.Orientation
import com.vookoapp.domain.userData.enums.dateProfile.Pets
import com.vookoapp.domain.userData.enums.dateProfile.Politics
import com.vookoapp.domain.userData.enums.dateProfile.Sport

interface RelationProfile {
    val alcohol: Boolean
    val orientation: Orientation
    val sport: Sport
    val politics: Politics
    val smoking: Boolean
    val pets: Pets
}