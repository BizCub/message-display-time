plugins {
    id("multiloader-common")
}

configurations.all {
    resolutionStrategy {
        force("net.fabricmc:fabric-loader:latest.release")
    }
}

if (isNeoForge) {
    val neoVers = mod.mc.substring(2)
    val neoLoader = mod.dep("neoforge_loader")
    val neoForge = if (neoVers.contains(".")) "$neoVers.$neoLoader" else "$neoVers.0.$neoLoader"
    project.setProperty("deps.neoforge_loader", neoForge)
}
