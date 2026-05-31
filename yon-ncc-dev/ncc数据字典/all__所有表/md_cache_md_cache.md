# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | cachekey | cachekey | cachekey | varchar2(50) | √ |
| 3 | cachename | cachename | cachename | varchar2(50) |
| 4 | cachetype | cachetype | cachetype | varchar2(50) | √ |
| 5 | firstdate | firstdate | firstdate | char(19) |
| 6 | help | help | help | varchar2(1024) |
| 7 | lastdate | lastdate | lastdate | char(19) |
| 8 | module | module | module | varchar2(50) | √ |
| 9 | nums | nums | nums | varchar2(1024) |
| 10 | servicename | servicename | servicename | varchar2(50) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |