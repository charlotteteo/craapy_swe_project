import requests
import json
import csv
import pandas as pd
from bs4 import BeautifulSoup


#print(content_list[0].split("https://www.hawkerpedia.com.sg/en/hawker-centre/")[1])
from urllib.request import urlopen
import regex as re
html = urlopen("https://www.hawkerpedia.com.sg/en/directories")
text = html.read()
plaintext = text.decode('utf8')
links = re.findall("href=[\"\'](/en/hawker-centre/)(.*?)[\"\']", plaintext)
# print(links)


#generate links
for x in range(len(links)):
    # tail+=links[x][1]
    print(links[x][1])
    try: 
        actual_link="https://www.hawkerpedia.com.sg/en/hawker-centre/"+links[x][1]
        print(actual_link)
        # print(convertedDict["Name"])
        name="output/"+links[x][1]
        # full dataset
        page = requests.get(actual_link)
    # print(page.content)
        soup = BeautifulSoup(page.content, 'html.parser')
    except:
        continue
    all_info=str(list(soup.children)[1])
    stores={}
    for x in range(len(all_info.split("stallList",1)[1].split("[]},"))):
        try:
            split_further=all_info.split("stallList",1)[1].split("[]},")
            # print(split_further[x])
        
            # break string based on ""Photo":[]},""
            edited=split_further[x]+'" "}'
            edited=edited.split('"Id"')[1]

            edited='{"Id"'+edited
        
            convertedDict=json.loads(edited)
     
            # print(convertedDict["Name"])
            stores[str(x)]=convertedDict
    
            
        except:
            break

# print(stores)
    
    with open("json/"+name+".json", 'w') as f:
        json.dump(stores, f)
    
    pdObj = pd.read_json("json/"+name+'.json', orient='index')
    pdObj.to_csv(name+".csv")

