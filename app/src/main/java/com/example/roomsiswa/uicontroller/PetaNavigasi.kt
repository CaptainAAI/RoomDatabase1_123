package com.example.roomsiswa.uicontroller

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    // Get the current back stack entry to determine the current screen
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route ?: DestinasiHome.route

    // Determine if the "back" button should be shown
    val canNavigateBack = navController.previousBackStackEntry != null

    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(id = findTitleByRoute(currentRoute)),
                canNavigateBack = canNavigateBack,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        HostNavigasi(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}