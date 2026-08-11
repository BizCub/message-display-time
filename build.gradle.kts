plugins {
    id("io.github.bizcub.multiloader")
}

multiloader {
    setMREnvironment(mrEnvs.clientOnly)
    setCFEnvironment(cfEnvs.client)

    versionRange("26.2", to = "latest")
    versionRange("1.21.1", from = "1.20.5", to = "1.21.10")
    versionRange("1.21.1", from = "1.20.6", loader = "forge")
    versionRange("1.20.1", to = "1.20.4")

    if (isFabric) {
        addDependency(
            dependency = "net.fabricmc:fabric-loader:${getDep("fabric")}"
        )
        addDependency(
            dependency = "net.fabricmc.fabric-api:fabric-api:${getDep("fabric-api")}",
            isPublishDepEnabled = true,
            isPublishDepRequired = true
        )
    }
}
