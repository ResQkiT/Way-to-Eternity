import os
import subprocess

#Путь до директориий target
targetRoot = "D:\\ilya\\java\\Way-to-Eternity\\FirstWay\\target\\classes"
package = "org.resk.solution1"

def GetJavaFILEpath(path):
    #Сигнатура 
    #java -classpath  D:\ilya\java\Way-to-Eternity\FirstWay\target\classes org.resk.solution1.Solution1
    #java -classpath  .Solution1

    javaFileDirList = os.listdir(path)
    #Будем считать, что файл уже есть в target директории
    currentJavaClassFile = ""
    for i in range( len(javaFileDirList)):
        temp = javaFileDirList[i]
        if str(temp).find(".java") != -1:
            currentJavaClassFile = path + "\\" + temp
            runJavaFile(currentJavaClassFile)
            break
    
def compileJavaFile(JavaFilepath):
    #Компиляция
    print(JavaFilepath)
    request = "javac " + JavaFilepath
    os.system(request)

def runJavaFile(path):
    proc = subprocess.Popen(["java",  "-classpath",  "D:\\ilya\\java\\Way-to-Eternity\\FirstWay\\target\\classes", "org.resk.solution1.Solution1"])
    for i in range(20):
        proc.send_signal(i)
def checkIsRootAvailableForTesting(path):
    
    #Договоримся, что директория доступна для тестирования, если в ней созданы файлы in и out
    if "in.txt" in os.listdir(path) and "out.txt" in os.listdir(path):
        return True
    return False

def printDirictories(a):
    for d in a:
        print(d)
#Получим список директорийй
pathPath = os.path.dirname(os.path.abspath(__file__))



print("Файл тестирование находится в директории: " , pathPath)
allDir = os.listdir(pathPath)
testingRoots = []
for d in allDir:
    if  not "." in d:
        testingRoots.append(pathPath + "\\"+ d)
print("Найдены директории для тестирование: ")
printDirictories(testingRoots)

testingAvaileble = []

print("Из них доступно для тестирования: ")
for p in testingRoots:
    if checkIsRootAvailableForTesting(p):
        testingAvaileble.append(p)

printDirictories(testingAvaileble)

print("Запустить общее тестирование доступных дирректорий?(y/n)")
answer = input()
if answer == "y" or answer == "да":
    print("Запускаю тестрирование")
    for testDir in testingAvaileble:
        print("Тестирую -> ", testDir)
        GetJavaFILEpath(testDir)

else:
    print("Обращайтесь позже")


