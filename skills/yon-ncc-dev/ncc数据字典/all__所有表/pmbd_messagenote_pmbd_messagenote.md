# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_messgenote | pk_messgenote | pk_messgenote | char(20) | √ |
| 2 | messagenote | messagenote | messagenote | varchar2(500) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | receiver | receiver | receiver | varchar2(20) |  |  | '~' |
| 6 | senddate | senddate | senddate | char(19) |
| 7 | sender | sender | sender | varchar2(20) |  |  | '~' |
| 8 | src_billno | src_billno | src_billno | varchar2(40) |
| 9 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 10 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 11 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 12 | userobject | userobject | userobject | varchar2(100) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |