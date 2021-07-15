package com.example.myapplication.second

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.test.TestModuleItem

data class TestState(val items: SnapshotStateList<TestModuleItem>)

val mockTestState2 = TestState(
    items = mutableStateListOf<TestModuleItem>().apply {
        addAll(
            listOf(
                TestModuleItem(
                    id = "1",
                    name = "Abhijeet",
                    selected = false
                ),
                TestModuleItem(
                    id = "2",
                    name = "Abhijeet 2",
                    selected = false
                ),
                TestModuleItem(
                    id = "3",
                    name = "Abhijeet 3",
                    selected = false
                ),
                TestModuleItem(
                    id = "4",
                    name = "Abhijeet 4",
                    selected = false
                ),
                TestModuleItem(
                    id = "5",
                    name = "Abhijeet 5",
                    selected = false
                ),
                TestModuleItem(
                    id = "6",
                    name = "Abhijeet 6",
                    selected = false
                ),
                TestModuleItem(
                    id = "7",
                    name = "Abhijeet 7",
                    selected = false
                ),
                TestModuleItem(
                    id = "8",
                    name = "Abhijeet 8",
                    selected = false
                ),
                TestModuleItem(
                    id = "9",
                    name = "Abhijeet 9",
                    selected = false
                ),
                TestModuleItem(
                    id = "10",
                    name = "Abhijeet 10",
                    selected = false
                ),
                TestModuleItem(
                    id = "11",
                    name = "Abhijeet 11",
                    selected = false
                ),
                TestModuleItem(
                    id = "12",
                    name = "Abhijeet 12",
                    selected = false
                ),
                TestModuleItem(
                    id = "13",
                    name = "Abhijeet 13",
                    selected = false
                ),
                TestModuleItem(
                    id = "14",
                    name = "Abhijeet 14",
                    selected = false
                ),
                TestModuleItem(
                    id = "15",
                    name = "Abhijeet 15",
                    selected = false
                ),
                TestModuleItem(
                    id = "16",
                    name = "Abhijeet 16",
                    selected = false
                ),
            )
        )
    }
)