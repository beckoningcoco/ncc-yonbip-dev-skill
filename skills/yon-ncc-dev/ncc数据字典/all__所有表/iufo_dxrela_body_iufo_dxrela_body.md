# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxrela_body | pk_dxrela_body | pk_dxrela_body | char(20) | √ |
| 2 | datasource | datasource | datasource | varchar2(20) |
| 3 | details | details | details | char(20) |
| 4 | digest | digest | digest | varchar2(200) |
| 5 | formula | formula | formula | varchar2(1024) |
| 6 | note | note | note | varchar2(1024) |
| 7 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 8 | pk_dxrela_head | pk_dxrela_head | pk_dxrela_head | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | position | position | position | number(38, 0) |
| 13 | type | type | type | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |