skins = [
    {'id':1 ,'name':'青莲剑仙','level':'史诗','price':1688},
    {'id':2 ,'name':'凤求凰','level':'史诗','price':788},
    {'id':3 ,'name':'千年之狐','level':'史诗','price':688},
    {'id':4 ,'name':'街头霸王','level':'史诗','price':1388},
]
# print(skins)
# print(skins[0].get('name'))
# print(skins[1].get('name'))
# print(skins[2].get('name'))
# print(skins[3].get('name'))
'''
循环
'''
for s in skins:  
    print(f'id:{s.get("id")}  名字:{s.get("name")} 等级:{s.get("level")} 价格:{s.get("price")}')