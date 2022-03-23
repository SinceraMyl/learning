import requests

query = input('请输入一个搜索对象：')

url = f'https://www.sogou.com/sie?query={query}'
headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36"
}

resp = requests.get(url,headers = headers) # 处理一个小反爬

print(resp)
print(resp.text) # 拿到页面源代码
resp.close()

