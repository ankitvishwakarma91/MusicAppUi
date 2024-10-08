package com.ankit.mymusicapp.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ankit.mymusicapp.R

@Composable
fun BrowserView(){
    val categories = listOf("New ","Old","Recent","MostPlayed")

    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(categories){
            cat ->
//            Text(text = cat )
            BrowserItems(cat = cat,  drawable = R.drawable.baseline_browse_gallery_24)

        }
    }

}

@Preview(showBackground = true)
@Composable
fun BrowserPreview(){
    BrowserView()
}