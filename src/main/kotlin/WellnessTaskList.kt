import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

data class WellnessTask(val id: Int, val label: String){

}

fun getWellnessTasks() = List(30) {i-> WellnessTask(i,"Task # $i")}
@Composable
fun WellnessTaskList(
    modifier: Modifier,
    listaItems: List<WellnessTask>
){
    LazyColumn {
        items(listaItems)
    }
}