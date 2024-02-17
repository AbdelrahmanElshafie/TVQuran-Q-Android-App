package com.tvquran.tvquranapp2

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tvquran.tvquranapp2.data.Currency


val currenciesList = listOf(
    Currency(
        name = "USD",
        buy = 51.1f,
        sell = 52f,
        icon = Icons.Default.Person
    ), Currency(
        name = "USD",
        buy = 51.1f,
        sell = 52f,
        icon = Icons.Default.Person
    ), Currency(
        name = "USD",
        buy = 51.1f,
        sell = 52f,
        icon = Icons.Default.Person
    ),
    Currency(
        name = "USD",
        buy = 51.1f,
        sell = 52f,
        icon = Icons.Default.Person
    ),
    Currency(
        name = "USD",
        buy = 51.1f,
        sell = 52f,
        icon = Icons.Default.Person
    )
)


@Preview
@Composable
fun CurrenciesSection() {
    var invisible by remember {
        mutableStateOf(false)
    }

    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)

    }

    Column(
        Modifier
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .animateContentSize()


    ) {

        Row(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
                .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.secondary)
                    .clickable {
                        invisible = !invisible
                        if (invisible) {
                            iconState = Icons.Rounded.KeyboardArrowUp
                        } else {
                            iconState = Icons.Rounded.KeyboardArrowDown

                        }
                    }
            ) {
                Icon(
                    imageVector = iconState, contentDescription = "up", modifier = Modifier
                        .size(25.dp)
                        , tint = MaterialTheme.colorScheme.onSecondary
                )
            }

        }

    }


}