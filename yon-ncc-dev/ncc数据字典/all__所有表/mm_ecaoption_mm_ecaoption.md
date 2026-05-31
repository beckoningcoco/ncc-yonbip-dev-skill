# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecaoption | pk_ecaoption | pk_ecaoption | char(20) | √ |
| 2 | ihistorydays | ihistorydays | ihistorydays | number(38, 0) |
| 3 | ihorizon | ihorizon | ihorizon | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 8 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |