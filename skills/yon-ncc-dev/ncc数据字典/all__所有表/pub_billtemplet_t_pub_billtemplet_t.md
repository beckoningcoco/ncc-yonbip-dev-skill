# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtemplet_t | pk_billtemplet_t | pk_billtemplet_t | char(20) | √ |
| 2 | basetab | basetab | basetab | varchar2(50) |
| 3 | metadataclass | metadataclass | metadataclass | varchar2(100) |
| 4 | metadatapath | metadatapath | metadatapath | varchar2(100) |
| 5 | mixindex | mixindex | mixindex | number(38, 0) |
| 6 | pk_billtemplet | pk_billtemplet | pk_billtemplet | char(20) | √ |
| 7 | pk_layout | pk_layout | pk_layout | varchar2(20) |  |  | '~' |
| 8 | pos | pos | pos | number(38, 0) |
| 9 | position | position | position | number(38, 0) |
| 10 | resid | resid | resid | varchar2(30) |
| 11 | tabcode | tabcode | tabcode | varchar2(50) |
| 12 | tabindex | tabindex | tabindex | number(38, 0) |
| 13 | tabname | tabname | tabname | varchar2(75) |
| 14 | vdef1 | vdef1 | vdef1 | varchar2(100) |
| 15 | vdef2 | vdef2 | vdef2 | varchar2(100) |
| 16 | vdef3 | vdef3 | vdef3 | varchar2(100) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |