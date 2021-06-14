def commandOutput
timestamps{
    commandOutput = sh(script: "${echo "Nudelstrudel"}", returnStdout: true).trim()
}
echo commandOutput
