# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_questions | pk_questions | pk_questions | char(20) | √ |
| 2 | answer | answer | answer | clob |
| 3 | apply_date | apply_date | apply_date | char(19) |
| 4 | approver | approver | approver | varchar2(20) |
| 5 | approve_note | approve_note | approve_note | varchar2(50) |
| 6 | approve_state | approve_state | approve_state | number(38, 0) |
| 7 | approve_time | approve_time | approve_time | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | bill_code | bill_code | bill_code | varchar2(50) |
| 10 | dealer | dealer | dealer | varchar2(20) |  |  | '~' |
| 11 | is_hot | is_hot | is_hot | char(1) |
| 12 | label | label | label | varchar2(50) |
| 13 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) | √ |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | remark | remark | remark | varchar2(50) |
| 17 | title | title | title | varchar2(500) | √ |
| 18 | type | type | type | varchar2(20) | √ |  | '~' |
| 19 | workflow_state | workflow_state | workflow_state | number(38, 0) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |