import requests

url = 'http://yidong.qqhrit.com:20188/xs_main.aspx?xh=201925010216'

# 重新封装参数
param = {
    'type': '24',
    'interval_id': '100:90',
    'action':'',
    'start': '0',
    'limit': '20',
}

headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36 Edg/89.0.774.76"
}

resp = requests.get(url = url , params=param,headers=headers)

print(resp.text)
resp.close()# 关闭爬虫

 


