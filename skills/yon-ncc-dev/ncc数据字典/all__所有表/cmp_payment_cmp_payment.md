# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7566.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | pk_payment | pk_payment | char(20) | √ |
| 2 | paydate | paydate | paydate | char(19) |
| 3 | payer | payer | payer | varchar2(20) |
| 4 | payprocessstatus | payprocessstatus | payprocessstatus | number(38, 0) |
| 5 | paystatus | paystatus | paystatus | number(38, 0) |
| 6 | pk_bill | pk_bill | pk_bill | char(20) |
| 7 | pk_billdetail | pk_billdetail | pk_billdetail | char(20) |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 9 | pk_corp | pk_corp | pk_corp | char(4) |
| 10 | pk_detail | pk_detail | pk_detail | char(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |
| 13 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 14 | pk_settlement | pk_settlement | pk_settlement | char(20) |
| 15 | serial | serial | serial | varchar2(50) |
| 16 | updatedate | updatedate | updatedate | char(19) |
| 17 | update_operator | update_operator | update_operator | varchar2(20) |
| 18 | yurref | yurref | yurref | varchar2(60) |
| 19 | def1 | def1 | def1 | varchar2(100) |
| 20 | def2 | def2 | def2 | varchar2(100) |
| 21 | def3 | def3 | def3 | varchar2(100) |
| 22 | def4 | def4 | def4 | varchar2(100) |
| 23 | def5 | def5 | def5 | varchar2(100) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |