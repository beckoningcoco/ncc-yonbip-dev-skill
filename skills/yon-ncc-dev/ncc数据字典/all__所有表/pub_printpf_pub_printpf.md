# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_print_pf | pk_print_pf | pk_print_pf | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | approvetime | approvetime | approvetime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billno | billno | billno | varchar2(50) |
| 6 | billstatus | billstatus | billstatus | number(38, 0) |
| 7 | billtime | billtime | billtime | char(19) |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | proposedept | proposedept | proposedept | varchar2(20) |  |  | '~' |
| 12 | proposer | proposer | proposer | varchar2(20) |  |  | '~' |
| 13 | proposernot | proposernot | proposernot | varchar2(1024) |
| 14 | proposetime | proposetime | proposetime | char(19) |
| 15 | remark | remark | remark | varchar2(1024) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |