# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enumtype | pk_enumtype | pk_enumtype | char(20) | √ |
| 2 | enumtable | enumtable | enumtable | varchar2(50) |
| 3 | enumtypecode | enumtypecode | enumtypecode | varchar2(50) |
| 4 | enumtypename | enumtypename | enumtypename | varchar2(50) |
| 5 | pk_commonobject | pk_commonobject | pk_commonobject | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_md | pk_md | pk_md | varchar2(50) |
| 8 | pk_menurntrance | pk_menurntrance | pk_menurntrance | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | returntype | returntype | returntype | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |