/*
 * Copyright 2019 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */

package com.example.splitties.preferences

import splitties.preferences.Preferences
import splitties.preferences.SuspendPrefsAccessor

class SamplePreferences private constructor() : Preferences(name = "sample") {
    val enableAnnoyingFeaturesField = boolPref("annoying_features", defaultValue = true)
    var enableAnnoyingFeatures by enableAnnoyingFeaturesField
    val showAnnoyingPopupAtLaunchField = boolPref("annoying_popup_launch", defaultValue = true)
    var showAnnoyingPopupAtLaunch by showAnnoyingPopupAtLaunchField
    val showAnnoyingPopupInLoopField = boolPref("annoying_popup_loop", defaultValue = false)
    var showAnnoyingPopupInLoop by showAnnoyingPopupInLoopField

    companion object : SuspendPrefsAccessor<SamplePreferences>(::SamplePreferences)
}