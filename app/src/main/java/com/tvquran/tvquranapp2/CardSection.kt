package com.tvquran.tvquranapp2

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tvquran.tvquranapp2.data.Card
import com.tvquran.tvquranapp2.ui.theme.BlueEnd
import com.tvquran.tvquranapp2.ui.theme.BlueStart
import com.tvquran.tvquranapp2.ui.theme.GreenEnd
import com.tvquran.tvquranapp2.ui.theme.GreenStart
import com.tvquran.tvquranapp2.ui.theme.OrangeEnd
import com.tvquran.tvquranapp2.ui.theme.OrangeStart
import com.tvquran.tvquranapp2.ui.theme.PurpleEnd
import com.tvquran.tvquranapp2.ui.theme.PurpleStart

val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "3554 1588 6624 1102",
        cardName = "Business",
        balance = 5884.5,
        color = getGradient(PurpleStart, PurpleEnd)
    ),

    Card(
        cardType = "MasterCard",
        cardNumber = "5646 6546 6466 4646",
        cardName = "Personal",
        balance = 5112.0,
        color = getGradient(BlueStart, BlueEnd)
    ),

    Card(
        cardType = "MasterCard",
        cardNumber = "3554 1588 6624 1102",
        cardName = "Payoneer",
        balance = 105000.5,
        color = getGradient(OrangeStart, OrangeEnd)
    ),

    Card(
        cardType = "VISA",
        cardNumber = "3554 1588 6624 1102",
        cardName = "Paypal",
        balance = 5884.5,
        color = getGradient(GreenStart, GreenEnd)
    ),

    )


fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush {
    return Brush.horizontalGradient(colors = listOf(startColor, endColor))
}


@Preview
@Composable
fun CardSection() {
    Column (modifier = Modifier.padding(10.dp)){
       Row(){

            CardItem(0)


            CardItem(1)


        }
    }

}

@Composable
fun CardItem(index: Int) {

    val card = cards[index]
    var lastItemPaddingEnd = 0.dp

    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MasterCard") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier.padding(start = 13.dp, end = lastItemPaddingEnd)) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(170.dp)
                .height(170.dp)
                .clickable {}
                .padding(vertical = 12.dp, horizontal = 16.dp)
        ) {
            Image(
                painter = image, contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))


            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = " ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )


        }
    }


}