# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approveset | pk_approveset | pk_approveset | char(20) | √ |
| 2 | flowname | flowname | flowname | varchar2(50) |
| 3 | flowtype | flowtype | flowtype | number(38, 0) |  |  | 0 |
| 4 | pk_flow | pk_flow | pk_flow | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_report | pk_report | pk_report | varchar2(20) |  |  | '~' |
| 8 | pk_rms | pk_rms | pk_rms | varchar2(20) |  |  | '~' |
| 9 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |