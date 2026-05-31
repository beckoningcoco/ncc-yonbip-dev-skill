# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | codeprop | codeprop | codeprop | char(1) | √ |
| 3 | colname | colname | colname | varchar2(30) |
| 4 | datatype | datatype | datatype | varchar2(30) | √ |
| 5 | issystem | issystem | issystem | char(1) |
| 6 | keyprop | keyprop | keyprop | char(1) | √ |
| 7 | metaprop | metaprop | metaprop | char(1) |
| 8 | nameprop | nameprop | nameprop | char(1) | √ |
| 9 | pk_dimlevel | pk_dimlevel | pk_dimlevel | char(20) | √ |
| 10 | propid | propid | propid | varchar2(50) | √ |
| 11 | propname | propname | propname | varchar2(100) | √ |
| 12 | propname2 | propname2 | propname2 | varchar2(100) |
| 13 | propname3 | propname3 | propname3 | varchar2(100) |
| 14 | propname4 | propname4 | propname4 | varchar2(100) |
| 15 | propname5 | propname5 | propname5 | varchar2(100) |
| 16 | propname6 | propname6 | propname6 | varchar2(100) |
| 17 | table_name | table_name | table_name | varchar2(30) | √ |
| 18 | treefatherkeyprop | treefatherkeyprop | treefatherkeyprop | char(1) | √ |
| 19 | treekeyprop | treekeyprop | treekeyprop | char(1) | √ |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |