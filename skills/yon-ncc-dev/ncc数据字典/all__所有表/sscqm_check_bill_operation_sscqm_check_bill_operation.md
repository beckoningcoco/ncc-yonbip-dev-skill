# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | billproblemid | billproblemid | billproblemid | varchar2(50) |
| 3 | memo | memo | memo | varchar2(400) |
| 4 | pk_currenttask | pk_currenttask | pk_currenttask | varchar2(50) |
| 5 | pk_flowpath | pk_flowpath | pk_flowpath | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |