# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissapp | pk_invissapp | pk_invissapp | char(20) | √ |
| 2 | appno | appno | appno | varchar2(50) |
| 3 | date_app | date_app | date_app | char(19) | √ |
| 4 | date_need | date_need | date_need | char(19) | √ |
| 5 | eu_appstatus | eu_appstatus | eu_appstatus | number(38, 0) |  |  | 0 |
| 6 | note | note | note | varchar2(256) |
| 7 | pk_dept_app | pk_dept_app | pk_dept_app | varchar2(20) | √ |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_psn_app | pk_psn_app | pk_psn_app | varchar2(20) | √ |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |