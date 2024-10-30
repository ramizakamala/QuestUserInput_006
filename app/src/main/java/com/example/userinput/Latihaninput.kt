package com.example.userinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview (showBackground = true)
@Composable
fun Latihaninput(modifier: Modifier = Modifier) {
    var namasv by remember { mutableStateOf("") }
    var emailsv by remember { mutableStateOf("")}
    var noTeleponsv by remember { mutableStateOf("")}
    var alamatsv by remember { mutableStateOf("")}
    var memilihJKsv by remember { mutableStateOf("")}

    var listJK = listOf( "laki-laki", "perempuan")
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Biodata", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = namasv,
            onValueChange = {namasv = it},
            label = { Text("namasv") },
            placeholder = { Text("Masukkan Nama Anda") }
        )

        Row {
            listJK.forEach {item ->
                Row { RadioButton(
                    selected =  memilihJKsv == item ,
                    onClick = {
                        memilihJKsv == item
                    }
                )

                }
            }
        }

        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = emailsv,
            onValueChange = {emailsv = it},
            label = { Text("emailsv") },
            placeholder = { Text("Masukkan email Anda") }
        )

        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = noTeleponsv,
            onValueChange = {noTeleponsv = it},
            label = { Text("noTelepon") },
            placeholder = { Text("Masukkan NoTelepon Anda") }
        )

        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = alamatsv,
            onValueChange = {alamatsv = it},
            label = { Text("alamatsv") },
            placeholder = { Text("Masukkan alamat Anda") }
        )

        TextField(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            value = memilihJKsv,
            onValueChange = {memilihJKsv = it},
            label = { Text("memilihJK") },
            placeholder = { Text("Masukkan jenis Anda") }
        )
        ElevatedButton(onClick = {
            namasv = namasv
        }) {
            Text("submit")
        }
        ElevatedCard(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.car(containerColor = Color.LightGray)
        )
    }