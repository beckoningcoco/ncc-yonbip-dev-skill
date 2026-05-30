# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invregop | pk_invregop | pk_invregop | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |
| 3 | code_op | code_op | code_op | varchar2(30) |
| 4 | date_op | date_op | date_op | char(19) | √ |
| 5 | desc_op | desc_op | desc_op | varchar2(256) |
| 6 | eu_regoptype | eu_regoptype | eu_regoptype | number(38, 0) |
| 7 | name_op | name_op | name_op | varchar2(50) |
| 8 | name_op2 | name_op2 | name_op2 | varchar2(50) |
| 9 | name_op3 | name_op3 | name_op3 | varchar2(50) |
| 10 | name_op4 | name_op4 | name_op4 | varchar2(50) |
| 11 | name_op5 | name_op5 | name_op5 | varchar2(50) |
| 12 | name_op6 | name_op6 | name_op6 | varchar2(50) |
| 13 | note | note | note | varchar2(256) |
| 14 | pk_dept_op | pk_dept_op | pk_dept_op | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_psn_op | pk_psn_op | pk_psn_op | varchar2(20) | √ |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |