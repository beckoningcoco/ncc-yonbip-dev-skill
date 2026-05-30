# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shortcut | pk_shortcut | pk_shortcut | char(20) | √ |
| 2 | ext1 | ext1 | ext1 | varchar2(200) |
| 3 | ext2 | ext2 | ext2 | varchar2(200) |
| 4 | ext3 | ext3 | ext3 | varchar2(200) |
| 5 | fun_code | fun_code | fun_code | varchar2(60) | √ |
| 6 | icon | icon | icon | varchar2(50) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |
| 9 | pk_user | pk_user | pk_user | char(20) | √ |
| 10 | sysid | sysid | sysid | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |