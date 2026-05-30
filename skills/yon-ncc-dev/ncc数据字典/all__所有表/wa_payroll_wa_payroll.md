# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payroll | pk_payroll | pk_payroll | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | apply_note | apply_note | apply_note | varchar2(2000) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approver | approver | approver | varchar2(20) |
| 6 | approve_note | approve_note | approve_note | varchar2(128) |
| 7 | batch | batch | batch | number(38, 0) |
| 8 | billcode | billcode | billcode | varchar2(30) | √ |
| 9 | billname | billname | billname | varchar2(50) | √ |
| 10 | billstate | billstate | billstate | number(38, 0) | √ |
| 11 | billtype | billtype | billtype | varchar2(20) |
| 12 | cperiod | cperiod | cperiod | char(2) | √ |
| 13 | cyear | cyear | cyear | char(4) | √ |
| 14 | isapproved | isapproved | isapproved | char(1) |
| 15 | operator | operator | operator | varchar2(20) | √ |
| 16 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 19 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 20 | transtypeid | transtypeid | transtypeid | varchar2(20) |
| 21 | creationtime | creationtime | creationtime | char(19) | √ |
| 22 | creator | creator | creator | varchar2(20) | √ |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |