plugins {
    commons
    spigot
}

group = "org.kingdoms.services.mythicmobs"
version = "1.0.0"

dependencies {
    compileOnly(project(":core:service"))
}