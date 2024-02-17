package com.tvquran.tvquranapp2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.tvquran.tvquranapp2.model.Home
import com.tvquran.tvquranapp2.model.QuranEntity
import com.tvquran.tvquranapp2.ui.theme.TVQuranQTheme
import com.tvquran.tvquranapp2.viewModels.HomeViewModel

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: HomeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // Initialize ViewModel
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        setContent {


            TVQuranQTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    HomeScreen()
                }
            }

            val homeDataState = remember { mutableStateOf<List<QuranEntity>?>(null) }

            // Observe the LiveData from the ViewModel and update the state
            viewModel.homeData.observe(this) { data ->
                if (data != null) {
                    homeDataState.value = data.entries
                }
            }


        }



        // Observe data changes
//        viewModel.homeData.observe(this) { data ->
//            // Update UI with the data
//            Toast.makeText(this, "HERE WE AREEEE " , Toast.LENGTH_SHORT).show()
//
//            if (data != null) {
//                var s = data.entries?.size
//
//                Toast.makeText(this, "Size is "+ s, Toast.LENGTH_LONG).show()
//
//
//            }
//
//        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun HomeScreen() {

    Scaffold(

        bottomBar = {
            BottomNavigationBar()
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            WalletSection()
            CardSection()
            Spacer(modifier = Modifier.height(13.dp))
            FinanceSection()
            CurrenciesSection()
        }

    }

}


