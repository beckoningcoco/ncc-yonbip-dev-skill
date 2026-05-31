# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materchktype | pk_materchktype | pk_materchktype | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(20) |  |  | '~' |
| 3 | icheckpoint | icheckpoint | icheckpoint | number(38, 0) |
| 4 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | vinnercode | vinnercode | vinnercode | varchar2(200) |
| 9 | vmatercode | vmatercode | vmatercode | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |