# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12395.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inviss | pk_inviss | pk_inviss | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) |
| 3 | code_iss | code_iss | code_iss | varchar2(50) |
| 4 | date_entry | date_entry | date_entry | char(19) |
| 5 | name_iss | name_iss | name_iss | varchar2(50) |
| 6 | note | note | note | varchar2(50) |
| 7 | pk_dept_entry | pk_dept_entry | pk_dept_entry | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |