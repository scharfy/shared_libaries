def setCommand(commandToRun){
    cmd = commandToRun
}

def getCommand(){
    cmd
}

def runCommand(){
        cmdOut = sh (script: "${cmd}", returnStdout:true).trim()
        echo cmdOut
        writeFile file: '/home/niklas/Dokumente/JenkinsLogs/log.txt', text: "${cmdOut}"
}

def getOutput(){
    cmdOut
}


