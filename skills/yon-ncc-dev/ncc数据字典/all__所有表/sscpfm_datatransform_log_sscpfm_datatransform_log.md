# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | errorinfo | errorinfo | errorinfo | varchar2(2047) |
| 4 | starttime | starttime | starttime | char(19) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |