import os

#Если кто-то будет использовать мой скрипт.
#Поле packagestr необходимо менять для каждого отдельного проекта. 
#А так же "снимите" с предохранителя
fuse = False

packagestr = '''package org.resk.lesson5.solution'''
classInitStr = '''public class '''
className = '''Solution''' 
mainEnt ='''{
    public static void main(String[] args) {
        //Generated by python script
    }
}'''

startask = int(input())
endtesk = int(input())
pathPath = os.path.dirname(os.path.abspath(__file__))
print(pathPath)
def createJavafile(path , tempclassname):
    path += "\\" + tempclassname + ".java"
    with open(path, 'w') as file:
            file.write(
                packagestr + str(i) + ";\n" +
                classInitStr + 
                className + str(i) + mainEnt
            )
if fuse:
    for i in range(startask , endtesk + 1):
        tempclassname= "Solution" + str(i)
        curDir = pathPath +   "\\solution" + str(i)
        try:
            os.mkdir(curDir)
        except:
            print("Директория " + pathPath +   "\\solution" + str(i) + " существует")
        finally:
            print("Создаю Java файл")
            createJavafile(curDir, tempclassname)
else:
    print("Подтвердите операцию, отметив: fuse = True")



