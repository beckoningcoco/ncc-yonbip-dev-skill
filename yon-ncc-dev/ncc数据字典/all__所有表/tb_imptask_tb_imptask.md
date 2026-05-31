# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | con_where | con_where | con_where | varchar2(2000) |
| 4 | enable | enable | enable | char(1) | √ |
| 5 | id | id | id | number(38, 0) | √ |
| 6 | name | name | name | varchar2(100) | √ |
| 7 | sourcetablename | sourcetablename | sourcetablename | varchar2(60) | √ |
| 8 | sourcetype | sourcetype | sourcetype | varchar2(30) | √ |
| 9 | tbmodel | tbmodel | tbmodel | varchar2(50) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |