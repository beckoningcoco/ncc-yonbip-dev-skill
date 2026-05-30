# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11754.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierext_i | pk_supplierext_i | pk_supplierext_i | char(20) | √ |
| 2 | csrcbid | csrcbid | csrcbid | varchar2(20) |
| 3 | csrcid | csrcid | csrcid | varchar2(20) |
| 4 | filepath | filepath | filepath | varchar2(1000) |
| 5 | finfotype | finfotype | finfotype | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_supplier | pk_supplier | pk_supplier | char(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |