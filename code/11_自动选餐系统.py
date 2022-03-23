foods = [
    {'id': 1, 'name': '牛排', 'level': 5, 'time': 50},
    {'id': 2, 'name': '汉堡', 'level': 5, 'time': 30},
    {'id': 5, 'name': '披萨', 'level': 5, 'time': 35},
    {'id': 3, 'name': '炒菜', 'level': 5, 'time': 40},
    {'id': 4, 'name': '小吃', 'level': 5, 'time': 20}
]

time =  int(input('请输入准备就餐消耗时间:'))
c_time = 0 # 选择就餐时间

for f in foods:
    print(f'您常吃的有: {f.get("name")}')


# for i, f in enumerate(foods):
for f in foods:
    # print(f'吃 {f.get("name")}  消耗:{f.get("time")}时间')
    # 0 <  50 and 50 < 40  c_time =0
    # 0 < 30 and 30 < 40 c_time= 30
    # 30 < 40  and 40 < 40  c_time = 30
    # 30 < 20 and 20　< 40 
    if c_time < f.get("time") and f.get("time") < time:  
        c_time = f.get("time")
print(c_time)

flag = True
for f in  foods:
    if f.get('time') == c_time:
        print(f'系统今天推荐给您：{f.get("name")}')
        flag = False
if flag:
    print('系统今天推荐给您：喝风！！')

