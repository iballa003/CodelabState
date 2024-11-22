import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun WaterCounter(){
    var waterCounter by remember { mutableStateOf(0) }
    var showTask by remember { mutableStateOf(true) }
    Column {
        if (waterCounter > 0){
            if (showTask){
                WellnessTaskItem("Prueba",{showTask = false})
            }
            Text(text = "Has bebido $waterCounter vasos de agua.")
        }
        Button(onClick = {
            waterCounter++
        }){
            Text(text = "Beber agua")
        }
        Button(onClick = {
            waterCounter = 0
            showTask = true
        }){
            Text(text = "Resetear contador")
        }
    }

}