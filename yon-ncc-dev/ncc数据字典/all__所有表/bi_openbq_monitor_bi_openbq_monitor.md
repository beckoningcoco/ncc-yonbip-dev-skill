# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | callip | callip | callip | varchar2(50) |
| 3 | calltime | calltime | calltime | char(19) |
| 4 | devicetype | devicetype | devicetype | varchar2(50) |
| 5 | objectid | objectid | objectid | varchar2(50) |
| 6 | objecttype | objecttype | objecttype | varchar2(50) |
| 7 | username | username | username | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |