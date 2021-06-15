def commandOutput
timestamps{
    // jo+
    commandOutput = sh(script: "${echo "Nudelstrudel"}", returnStdout: true).trim()
}
echo commandOutput
