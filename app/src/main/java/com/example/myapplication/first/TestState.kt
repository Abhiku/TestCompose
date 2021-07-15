package com.example.myapplication.first

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

data class TestState(val items: SnapshotStateList<TestItem>)

data class TestItem(
    val id: String,
    val name: String,
    val selected: Boolean
)

val mockTestState = TestState(
    items = mutableStateListOf<TestItem>().apply {
        addAll(
            listOf(
                TestItem(
                    id = "1",
                    name = "Abhijeet",
                    selected = false
                ),
                TestItem(
                    id = "2",
                    name = "Abhijeet 2",
                    selected = false
                ),
                TestItem(
                    id = "3",
                    name = "Abhijeet 3",
                    selected = false
                ),
                TestItem(
                    id = "4",
                    name = "Abhijeet 4",
                    selected = false
                ),
                TestItem(
                    id = "5",
                    name = "Abhijeet 5",
                    selected = false
                ),
                TestItem(
                    id = "6",
                    name = "Abhijeet 6",
                    selected = false
                ),
                TestItem(
                    id = "7",
                    name = "Abhijeet 7",
                    selected = false
                ),
                TestItem(
                    id = "8",
                    name = "Abhijeet 8",
                    selected = false
                ),
                TestItem(
                    id = "9",
                    name = "Abhijeet 9",
                    selected = false
                ),
                TestItem(
                    id = "10",
                    name = "Abhijeet 10",
                    selected = false
                ),
                TestItem(
                    id = "11",
                    name = "Abhijeet 11",
                    selected = false
                ),
                TestItem(
                    id = "12",
                    name = "Abhijeet 12",
                    selected = false
                ),
                TestItem(
                    id = "13",
                    name = "Abhijeet 13",
                    selected = false
                ),
                TestItem(
                    id = "14",
                    name = "Abhijeet 14",
                    selected = false
                ),
                TestItem(
                    id = "15",
                    name = "Abhijeet 15",
                    selected = false
                ),
                TestItem(
                    id = "16",
                    name = "Abhijeet 16",
                    selected = false
                ),
            )
        )
    }
)