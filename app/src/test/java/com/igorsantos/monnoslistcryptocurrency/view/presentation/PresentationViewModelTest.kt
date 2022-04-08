package com.igorsantos.monnoslistcryptocurrency.view.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation
import com.igorsantos.monnoslistcryptocurrency.data.usecase.MonnosUseCase
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class PresentationViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var useCase: MonnosUseCase
    private lateinit var viewModel: PresentationViewModel

    private val testDispatcher = UnconfinedTestDispatcher()

    @Before
    fun before() {
        useCase = mockk(relaxed = true)
        viewModel = PresentationViewModel(useCase)
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun `test if dataPresentation is written`() {
        val data = mockk<Presentation>()
        coEvery { useCase.getPresentationData() } returns data
        viewModel.getData()
        assertEquals(data, viewModel.data.value)
    }
}