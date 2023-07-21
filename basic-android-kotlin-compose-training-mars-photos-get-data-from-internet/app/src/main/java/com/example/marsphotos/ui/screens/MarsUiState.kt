package com.example.marsphotos.ui.screens

import com.example.marsphotos.network.MarsPhoto

sealed interface MarsUiState {
    data class Success(val photos: String) : MarsUiState
    object Error : MarsUiState
    object Loading : MarsUiState
}