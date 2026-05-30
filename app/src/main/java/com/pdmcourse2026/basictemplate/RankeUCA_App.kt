package com.pdmcourse2026.basictemplate

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdmcourse2026.basictemplate.screen.home.HomeScreen
import com.pdmcourse2026.basictemplate.screen.home.ResultScreen

@Composable
fun RankeUCA_App() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                HomeScreen(
                    onNavigateToResults = {
                        backStack.add(Routes.Results)
                    }
                )
            }

            entry<Routes.Results> {
                ResultScreen(
                    onNavigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
        }
    )
}
