def setCommand(commandToRun){
    cmd = commandToRun
}

def getCommand(){
    cmd
}

def runCommand(){
    timestamps{
        cmdOut = sh (script: "${cmd}", returnStdout:true).trim()
        echo cmdOutput
        writeFile
    }
}

def getOutput(){
    cmdOut
}


