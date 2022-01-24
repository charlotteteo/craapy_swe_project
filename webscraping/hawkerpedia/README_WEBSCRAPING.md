## HAWKERPEDIA WEBSCRAPING
### Using Beautiful Soup and Regex to extract information on each hawker stall 
- Some hawker centres would have either one row/empty as it does not have any information other than the store name - data does not match syntax
- takes about 50-60seconds to generate all data files
IN notebook:
- Use web_scraping_hawkerpedia.ipynb
IN terminal:
- pip install requests,bs4 etc.... (in terminal)
- cd till in hawkerpedia 
- Run 'python hawkerpedia_webscraper.py' to generate output (may need to route path to access output etc.)

## Output
- Split by Hawker Centre (expect 143 Files *2 (1 CSV and 1 Json))
- json/output - contains json files of hawker stalls data
- output- contains csv files of hawker stalls data
