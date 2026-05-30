# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7356.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payroll | pk_payroll | pk_payroll | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | apply_note | apply_note | apply_note | varchar2(2000) |
| 4 | approvedate | approvedate | approvedate | char(19) |
| 5 | approver | approver | approver | varchar2(20) |
| 6 | approve_note | approve_note | approve_note | varchar2(128) |
| 7 | billcode | billcode | billcode | varchar2(30) | √ |
| 8 | billname | billname | billname | varchar2(50) | √ |
| 9 | billstate | billstate | billstate | number(38, 0) | √ |  | 0 |
| 10 | billtype | billtype | billtype | varchar2(20) |
| 11 | cperiod | cperiod | cperiod | char(2) | √ |
| 12 | cyear | cyear | cyear | char(4) | √ |
| 13 | isapproved | isapproved | isapproved | char(1) |
| 14 | operator | operator | operator | varchar2(20) | √ |
| 15 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) | √ |
| 16 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 18 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 19 | transtypeid | transtypeid | transtypeid | varchar2(20) |
| 20 | creationtime | creationtime | creationtime | char(19) | √ |
| 21 | creator | creator | creator | varchar2(20) | √ |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |