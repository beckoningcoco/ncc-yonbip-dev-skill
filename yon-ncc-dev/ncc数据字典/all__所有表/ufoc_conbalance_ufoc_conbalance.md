# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conbalance | pk_conbalance | pk_conbalance | char(20) | √ |
| 2 | item_seq | item_seq | item_seq | number(38, 0) |
| 3 | item_type | item_type | item_type | number(38, 0) |
| 4 | pk_left | pk_left | pk_left | varchar2(50) |  |  | '~' |
| 5 | pk_project | pk_project | pk_project | varchar2(50) |  |  | '~' |
| 6 | pk_report | pk_report | pk_report | varchar2(20) |  |  | '~' |
| 7 | pk_right | pk_right | pk_right | varchar2(50) |  |  | '~' |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |