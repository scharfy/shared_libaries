def setCommand(commandToRun){
    cmd = commandToRun
}

def getCommand(){
    cmd
}

def runCommand(){
        cmdOut = sh (script: "${cmd}", returnStdout:true).trim()
        echo cmdOutput
        writeFile file: "${logFilePath}", text: "${cmdOutput}"
}

def getOutput(){
    cmdOut
}


