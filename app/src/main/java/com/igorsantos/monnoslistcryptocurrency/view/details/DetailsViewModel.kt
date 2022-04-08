package com.igorsantos.monnoslistcryptocurrency.view.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.usecase.MonnosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject
import kotlinx.coroutines.launch
import timber.log.Timber

private const val TAG = "exception_get_data"

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val useCase: MonnosUseCase
) : ViewModel(){

    private var _data = MutableLiveData<Details>()
    val data: LiveData<Details> = _data

    private var _loading = MutableLiveData(true)
    val loading: LiveData<Boolean> = _loading

    private var _errorLoad = MutableLiveData<String>()
    val errorLoad: LiveData<String> = _errorLoad

    fun getDetails(name: String) = viewModelScope.launch {
        try {
            val value = useCase.getDetails(name)
            _data.value = value
            _loading.value = false
        } catch (e: Exception) {
            _errorLoad.value = e.toString()
            Timber
                .tag(TAG)
                .e(e)
        }
    }
}