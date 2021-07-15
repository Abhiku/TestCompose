package com.example.myapplication.second

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel
@Inject
constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val state by lazy { MutableStateFlow(mockTestState2) }

    fun initialState(): TestState = mockTestState2

    fun onSelected(id: String, selected: Boolean) {
        viewModelScope.launch {
            val itemIndex = state.value.items.indexOfFirst { it.id == id }
            if (itemIndex != -1) {
                val testItem = state.value.items[itemIndex]
                val newTestItemtem = testItem.copy(
                    selected = selected
                )

                state.value.items.apply {
                    this[itemIndex] = newTestItemtem
                }
            }
        }
    }

    fun stateFlow(): Flow<TestState> = state
}