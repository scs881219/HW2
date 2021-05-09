/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.recyclersample.data

import android.content.res.Resources
import com.example.recyclersample.R

/* Returns initial list of flowers. */
fun flowerList(resources: Resources): List<Flower> {
    return listOf(
        Flower(
            id = 1,
            name = resources.getString(R.string.flower1_name),
            image = R.drawable.baseball,
            image2 = R.drawable.baseball_photo,
        ),
        Flower(
            id = 2,
            name = resources.getString(R.string.flower2_name),
            image = R.drawable.basketball,
            image2 = R.drawable.basketball_photo,
        ),
        Flower(
            id = 3,
            name = resources.getString(R.string.flower3_name),
            image = R.drawable.football,
            image2 = R.drawable.football_photo,
        ),
        Flower(
            id = 4,
            name = resources.getString(R.string.flower4_name),
            image = R.drawable.other,
            image2 = R.drawable.other_photo,
        )
    )
}