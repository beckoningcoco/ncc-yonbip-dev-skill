# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entryapply | pk_entryapply | pk_entryapply | char(20) | √ |
| 2 | apply_date | apply_date | apply_date | char(10) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approve_note | approve_note | approve_note | varchar2(2048) |
| 5 | approve_state | approve_state | approve_state | number(38, 0) |
| 6 | approve_time | approve_time | approve_time | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | bill_code | bill_code | bill_code | varchar2(28) |
| 9 | business_type | business_type | business_type | varchar2(20) |  |  | '~' |
| 10 | isneedfile | isneedfile | isneedfile | char(1) |
| 11 | issyncwork | issyncwork | issyncwork | char(1) |
| 12 | memo | memo | memo | varchar2(768) |
| 13 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | char(20) | √ |
| 15 | pk_hi_org | pk_hi_org | pk_hi_org | char(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | char(20) | √ |
| 17 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |  | '~' |
| 18 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) | √ |  | '~' |
| 19 | transtype | transtype | transtype | varchar2(20) |
| 20 | transtypeid | transtypeid | transtypeid | varchar2(20) |  |  | '~' |
| 21 | vattachment | vattachment | vattachment | varchar2(1000) |
| 22 | workflow_state | workflow_state | workflow_state | number(38, 0) |
| 23 | creationtime | creationtime | creationtime | char(19) | √ |
| 24 | creator | creator | creator | varchar2(20) | √ |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |