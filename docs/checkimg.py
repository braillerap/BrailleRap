import os
import glob
import fnmatch

imggext = ["*.jpg", "*.png"]



print (__name__)

def readfiles (flist):
    res = {}
    for file in flist:
        with open (file) as f:
            data = f.readlines ()
            res[file] = data
    return res

def main ():
    images = []
    docfiles = []
    unused = []
    
    for ext in imggext:
        images += glob.glob ("./IMG/" + ext)

    docfiles = glob.glob ("./*.rst")
    doc = readfiles(docfiles)

    print (images)        
    print (docfiles)

    for img in images:
        found = False
        for docfile,doctext in doc.items ():
            for line in doctext:
                if img in line:
                    print ("{0} found in {1}".format (img, docfile))
                    found = True
                    break
        if not found:
            unused.append (img)

    print ("Unused files:")
    for img in unused:
        print ("{0}".format (img))    


    
if __name__ == "__main__":
    main ()
