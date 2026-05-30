# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rescan | pk_rescan | pk_rescan | varchar2(20) | √ |
| 2 | amount | amount | amount | varchar2(50) |
| 3 | billdate | billdate | billdate | varchar2(20) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |
| 5 | billno | billno | billno | varchar2(50) |
| 6 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |
| 10 | rescanman | rescanman | rescanman | varchar2(20) |
| 11 | rescantime | rescantime | rescantime | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |