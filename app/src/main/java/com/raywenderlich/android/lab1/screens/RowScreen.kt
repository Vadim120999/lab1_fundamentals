package com.raywenderlich.android.lab1.screens

val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)

@Composable
fun RowScreen(){
    MyRow()
    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyRow() {
    //TODO write your code here
}