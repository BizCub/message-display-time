plugins {
    alias(libs.plugins.stonecutter)
}

stonecutter active "26.1-fabric"

stonecutter parameters {
    val (version, loader) = current.project.split('-', limit = 2)
    properties.tags(version, loader)
    constants.match(node.metadata.project.substringAfterLast('-'), "fabric", "forge", "neoforge")
    swaps["mod_id"] = "\"${property("mod.id")}\";"
}
