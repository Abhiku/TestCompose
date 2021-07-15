package com.example.myapplication.second

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Checkbox
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.test.TestModuleItem

@Composable
fun TestScreen(testViewModel: TestViewModel, fragment: String) {
    val state by testViewModel.stateFlow().collectAsState(testViewModel.initialState())

    Scaffold(
        topBar = {
            Text(text = "Fragment $fragment")
        }
    ) {
        TestList(
            items = state.items,
            onSelected = testViewModel::onSelected
        )
    }
}

@Composable
fun TestList(
    modifier: Modifier = Modifier,
    items: List<TestModuleItem>,
    onSelected: (id: String, selected: Boolean) -> Unit
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(items) { item ->
            TestCompose(item, onSelected)
        }
    }
}

@Composable
fun TestCompose(item: TestModuleItem, onSelected: (id: String, selected: Boolean) -> Unit) {
    println("current item, ${item.id}")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Text(text = "post ${item.id}")
        Checkbox(checked = item.selected, onCheckedChange = {
            onSelected(item.id, it)
        })
    }
}