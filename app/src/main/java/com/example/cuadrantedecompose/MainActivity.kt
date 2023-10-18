package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // CuadranteBase()
                }
            }
        }
    }
}

@Composable
fun CuadranteBase(color: Color, titulo: String, parrafo: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = parrafo,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun Cuadrantes(){
    Column(modifier = Modifier.fillMaxSize()) {

        Row(Modifier.weight(1F)) {
            CuadranteBase(color = Color(0xFFEADDFF), titulo = stringResource(R.string.Titulo1), parrafo = stringResource(R.string.Parrafo1), modifier = Modifier.weight(1F))
            CuadranteBase(color = Color(0xFFD0BCFF), titulo = stringResource(R.string.Titulo2), parrafo = stringResource(R.string.Parrafo2), modifier = Modifier.weight(1F))
        }

        Row(Modifier.weight(1F)) {
            CuadranteBase(color = Color(0xFFB69DF8), titulo = stringResource(R.string.Titulo3), parrafo = stringResource(R.string.Parrafo3), modifier = Modifier.weight(1F))
            CuadranteBase(color = Color(0xFFF6EDFF), titulo = stringResource(R.string.Titulo4), parrafo = stringResource(R.string.Parrafo4), modifier = Modifier.weight(1F))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CuadrantesPreview() {
    CuadranteDeComposeTheme {
        Cuadrantes()
    }
}