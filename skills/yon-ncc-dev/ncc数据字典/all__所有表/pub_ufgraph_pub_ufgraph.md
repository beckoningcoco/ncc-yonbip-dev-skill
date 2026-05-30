# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ufgraph | pk_ufgraph | pk_ufgraph | char(20) | √ |
| 2 | geometry | geometry | geometry | blob |
| 3 | graphstyle | graphstyle | graphstyle | varchar2(100) |
| 4 | id | id | id | varchar2(64) |
| 5 | name | name | name | varchar2(100) |
| 6 | parentid | parentid | parentid | varchar2(64) |
| 7 | pk_graph | pk_graph | pk_graph | varchar2(20) |  |  | '~' |
| 8 | sourceid | sourceid | sourceid | varchar2(64) |
| 9 | targetid | targetid | targetid | varchar2(64) |
| 10 | type | type | type | number(38, 0) |
| 11 | userobject | userobject | userobject | blob |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |