# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10861.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertsendconfig | pk_alertsendconfig | pk_alertsendconfig | char(20) | √ |
| 2 | nodetype | nodetype | nodetype | varchar2(1) |  |  | '0' |
| 3 | pk_alertregistry | pk_alertregistry | pk_alertregistry | char(20) |
| 4 | receiverid | receiverid | receiverid | varchar2(1024) |
| 5 | receiveri_type_id | receiveri_type_id | receiveri_type_id | number(38, 0) |
| 6 | receivername | receivername | receivername | varchar2(1024) |
| 7 | sendmethod | sendmethod | sendmethod | number(38, 0) |
| 8 | syscode | syscode | syscode | varchar2(100) |  |  | 'RIA' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |