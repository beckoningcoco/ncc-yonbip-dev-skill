# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7913.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dimlevelname | dimlevelname | dimlevelname | varchar2(100) |
| 3 | express | express | express | blob |
| 4 | ismeasure_epa | ismeasure_epa | ismeasure_epa | char(1) |
| 5 | isrequired | isrequired | isrequired | char(1) |
| 6 | operator | operator | operator | varchar2(50) |
| 7 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(30) |
| 8 | pk_parent | pk_parent | pk_parent | char(20) | √ |
| 9 | useprops | useprops | useprops | varchar2(500) |
| 10 | usepropstree | usepropstree | usepropstree | blob |
| 11 | def1 | def1 | def1 | varchar2(100) |
| 12 | def2 | def2 | def2 | varchar2(100) |
| 13 | def3 | def3 | def3 | varchar2(100) |
| 14 | def4 | def4 | def4 | varchar2(100) |
| 15 | def5 | def5 | def5 | varchar2(100) |
| 16 | def6 | def6 | def6 | varchar2(100) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |