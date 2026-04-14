package sanchez.santiago.login.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.tooling.ComposeToolingApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun homeScreen(){
    Column() {
        Text("Bienvenido")
        Spacer(Modifier.height(16.dp), style= MaterialTheme.typography.headlineLarge)
        Button(onClick = {}, Modifier.fillMaxWidth()){
            Text("Cerrar sesión")
        }
    }}