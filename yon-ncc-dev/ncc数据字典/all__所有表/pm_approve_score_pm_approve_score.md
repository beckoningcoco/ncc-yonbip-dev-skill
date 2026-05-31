# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | apr_time | apr_time | apr_time | date |
| 3 | auditor | auditor | auditor | varchar2(36) | √ |
| 4 | audittype | audittype | audittype | number(38, 0) |
| 5 | deptid | deptid | deptid | varchar2(36) |
| 6 | gradeitemid | gradeitemid | gradeitemid | varchar2(32) |
| 7 | gradeitemname | gradeitemname | gradeitemname | varchar2(150) |
| 8 | groupid | groupid | groupid | varchar2(36) |
| 9 | mark_status | mark_status | mark_status | number(38, 0) | √ |
| 10 | ncomment | ncomment | ncomment | varchar2(600) |
| 11 | schemeid | schemeid | schemeid | varchar2(32) | √ |
| 12 | score | score | score | number(10, 4) |
| 13 | sheetid | sheetid | sheetid | varchar2(32) | √ |
| 14 | tenantid | tenantid | tenantid | varchar2(32) |
| 15 | turn | turn | turn | number(38, 0) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | date |  |  | sysdate |