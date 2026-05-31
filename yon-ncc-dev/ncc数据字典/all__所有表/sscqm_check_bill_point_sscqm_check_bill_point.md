# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | checkbillid | checkbillid | checkbillid | varchar2(50) |
| 3 | checkresult | checkresult | checkresult | char(1) |
| 4 | pointid | pointid | pointid | varchar2(50) |
| 5 | taskid | taskid | taskid | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |