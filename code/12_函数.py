# 函数定义好，默认是不会自己执行的
# 只有调用用才可以执行
'''
格式 ：
def  方法名():
    要执行的代码/方法体
调用:
    方法名()
    注意：
        如果定义方法时，空号中有变量，
        我们调用时也必须给变量，并且个数相同
'''
'''
def login(name,pwd): # 定义函数 定义方法
    if name == 'zs' and pwd =='123':
        print('登录成功')
    else:
        print('登录失败')


uname = input('请输入用户名：')
passwd = input('请输入用密码：')

login(uname,passwd) # 调用函数

z_name = input('请输入用户名：')
z_pawd = input('请输入用密码：')
login(z_name,z_pawd)
'''
'''
%python_home%\Lib\site-packages
D:\Programs\Python\Python38\Scripts\pip 专门下载模块的工具
Ctrl + ~
'''
# from random import ranint
import random.randint 
# print(1231)
# randint(0,10)
print(random.randint(0,10))
# python 免费 开源