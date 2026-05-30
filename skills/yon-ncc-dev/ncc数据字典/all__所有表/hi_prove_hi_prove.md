# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8636.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prove | pk_prove | pk_prove | char(20) | √ |
| 2 | apply_data | apply_data | apply_data | char(19) |
| 3 | approver | approver | approver | varchar2(20) |
| 4 | approve_note | approve_note | approve_note | varchar2(50) |
| 5 | approve_state | approve_state | approve_state | number(38, 0) |
| 6 | approve_time | approve_time | approve_time | char(19) |
| 7 | attrname | attrname | attrname | number(38, 0) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |
| 9 | bill_code | bill_code | bill_code | varchar2(50) |
| 10 | content | content | content | blob |
| 11 | dealer | dealer | dealer | varchar2(20) |  |  | '~' |
| 12 | handler | handler | handler | varchar2(20) |  |  | '~' |
| 13 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) | √ |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | prove_purpose | prove_purpose | prove_purpose | varchar2(20) |  |  | '~' |
| 17 | prove_type | prove_type | prove_type | varchar2(20) |  |  | '~' |
| 18 | receive_address | receive_address | receive_address | varchar2(20) |  |  | '~' |
| 19 | remark | remark | remark | varchar2(200) |
| 20 | workflow_state | workflow_state | workflow_state | number(38, 0) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |