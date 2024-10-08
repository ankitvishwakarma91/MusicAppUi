package com.ankit.mymusicapp

import androidx.annotation.DrawableRes

sealed class Screen(
    val title :String,
    val route : String
) {

    sealed class BottomScreen(val bTitle:String,val bRoute :String, @DrawableRes val icon :Int) : Screen(bTitle,bRoute ){
        object Home : BottomScreen("home","home",R.drawable.ic_music_note)

        object Library : BottomScreen("library","library",R.drawable.baseline_library_add_24)

        object Browser : BottomScreen("browser","browser",R.drawable.baseline_browse_gallery_24)
    }

    sealed class DrawerScreen(val dTitle:String,val dRoute :String, @DrawableRes val icon :Int) : Screen(dTitle,dRoute){
        object Account : DrawerScreen(
            "Account",
            "account",
            R.drawable.account
        )
        object Subscription : DrawerScreen(
            "Subscription",
            "subscription",
            R.drawable.baseline_subscriptions_24
        )
        object AddAccount : DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Library,
    Screen.BottomScreen.Browser
)

val screenInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)