package viewmodel.provider

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import repositori.RepositoriSiswa

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel() {
    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])


}



class DetailViewModel (
    suspend fun deleteSiswa(){
        repositoriSiswa.deleteSiswa(uiDetailState.value.detailSiswa.toSiswa())
    }
)