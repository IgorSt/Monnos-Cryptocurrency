package com.igorsantos.monnoslistcryptocurrency.view.presentation

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation
import com.igorsantos.monnoslistcryptocurrency.data.rules.Event
import com.igorsantos.monnoslistcryptocurrency.data.usecase.MonnosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject
import kotlinx.coroutines.launch
import timber.log.Timber

private const val TAG = "exception_get_data"

@HiltViewModel
class PresentationViewModel @Inject constructor(
    private val useCase: MonnosUseCase
) : ViewModel(), DefaultLifecycleObserver{

    private var _data = MutableLiveData<Presentation>()
    val data: LiveData<Presentation> = _data

    private var _onDetailsClicked = MutableLiveData<Event<String>>()
    val onDetailsClicked: LiveData<Event<String>> = _onDetailsClicked

    private var _loading = MutableLiveData(true)
    val loading: LiveData<Boolean> = _loading

    private var _errorLoad = MutableLiveData<String>()
    val errorLoad: LiveData<String> = _errorLoad

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        getData()
    }

    fun getData() = viewModelScope.launch {
        try {
            val value = useCase.getPresentationData()
            _data.value = value
            _loading.value = false
        } catch (e: Exception) {
            _errorLoad.value = e.toString()
            Timber
                .tag(TAG)
                .w(e)
        }
    }

    fun onDetails(name: String) {
        _onDetailsClicked.value = Event(name)
    }
}