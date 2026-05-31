# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_activetask | pk_activetask | pk_activetask | char(20) | √ |
| 2 | appointtime | appointtime | appointtime | char(19) |
| 3 | barcode | barcode | barcode | varchar2(200) |
| 4 | billbarcode | billbarcode | billbarcode | varchar2(200) |
| 5 | billcode | billcode | billcode | varchar2(50) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billhasimg | billhasimg | billhasimg | char(1) |
| 8 | billid | billid | billid | varchar2(50) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billrelationid | billrelationid | billrelationid | varchar2(100) |
| 11 | billremarks | billremarks | billremarks | varchar2(200) |
| 12 | busiactivitylist | busiactivitylist | busiactivitylist | varchar2(400) |
| 13 | exigencelevel | exigencelevel | exigencelevel | varchar2(50) |
| 14 | firstact | firstact | firstact | varchar2(50) |
| 15 | lastoptime | lastoptime | lastoptime | char(19) |
| 16 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 17 | pk_busiactivity | pk_busiactivity | pk_busiactivity | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_groupofbill | pk_groupofbill | pk_groupofbill | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_orgofbill | pk_orgofbill | pk_orgofbill | varchar2(20) |  |  | '~' |
| 22 | pk_orgofbill_v | pk_orgofbill_v | pk_orgofbill_v | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 25 | pk_sender | pk_sender | pk_sender | varchar2(20) |  |  | '~' |
| 26 | pk_ssctask | pk_ssctask | pk_ssctask | varchar2(20) |  |  | '~' |
| 27 | pk_taskstate | pk_taskstate | pk_taskstate | varchar2(20) |  |  | '~' |
| 28 | pk_transactype | pk_transactype | pk_transactype | varchar2(20) |  |  | '~' |
| 29 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 30 | receivetime | receivetime | receivetime | char(19) |
| 31 | src_system | src_system | src_system | varchar2(50) |
| 32 | taskremarks | taskremarks | taskremarks | varchar2(400) |
| 33 | def1 | def1 | def1 | varchar2(50) |
| 34 | def2 | def2 | def2 | varchar2(50) |
| 35 | def3 | def3 | def3 | varchar2(50) |
| 36 | def4 | def4 | def4 | varchar2(50) |
| 37 | def5 | def5 | def5 | varchar2(50) |
| 38 | def6 | def6 | def6 | varchar2(50) |
| 39 | def7 | def7 | def7 | varchar2(50) |
| 40 | def8 | def8 | def8 | varchar2(50) |
| 41 | def9 | def9 | def9 | varchar2(50) |
| 42 | def10 | def10 | def10 | varchar2(50) |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |