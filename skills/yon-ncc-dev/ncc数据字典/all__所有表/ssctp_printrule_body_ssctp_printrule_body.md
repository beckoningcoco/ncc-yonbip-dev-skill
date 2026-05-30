# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11915.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrule_body | pk_printrule_body | pk_printrule_body | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 3 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 4 | pk_printrule_head | pk_printrule_head | pk_printrule_head | char(20) | √ |
| 5 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 6 | printtemplate | printtemplate | printtemplate | varchar2(50) |
| 7 | rowno | rowno | rowno | varchar2(50) |
| 8 | srcsystem | srcsystem | srcsystem | varchar2(50) |
| 9 | tradetypecode | tradetypecode | tradetypecode | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |