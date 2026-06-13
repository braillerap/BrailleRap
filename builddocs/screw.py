import sys

EQUIPMENT_STRING = "**Equipment:**"
BRAILLERAP_STRING = "Equipment for BrailleRAP:"
BRAILLERAPXL_STRING = "Equipment for BrailleRAP XL:"
SCREW_STRING = "screws"

def extract_screw (lines):
    count = {"STD":{}, "XL":{}}
    dest = []

    for l in lines:
        
        if l.find(EQUIPMENT_STRING) != -1:
            dest = ["STD","XL"]
        elif l.find (BRAILLERAP_STRING) != -1:
            dest = ["STD"]                    
        elif l.find (BRAILLERAPXL_STRING) != -1:
            dest = ["XL"]                    
        if len(dest) > 0:
            print (dest)

        if l.find (SCREW_STRING) != -1:
            
def main ():
    
    if len(sys.argv) < 2:
        print (f"{sys.argv[0]} <screw doc.md>")
        exit ()
    docname = sys.argv[1];

    print  ("*" * 32)
    print (f"* Analyzing {docname}")
    print  ("*" * 32)

    lines = []

    with open(docname) as f:
        lines = f.readlines ()
    
    extract_screw (lines)

if __name__ == '__main__':
   
    main ()