# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | dimid | dimid | dimid | varchar2(32) |
| 3 | groupid | groupid | groupid | varchar2(32) |
| 4 | schemegroupid | schemegroupid | schemegroupid | varchar2(36) |
| 5 | schemeid | schemeid | schemeid | varchar2(32) | √ |
| 6 | staffid | staffid | staffid | varchar2(36) |
| 7 | tenantid | tenantid | tenantid | varchar2(32) |
| 8 | turn | turn | turn | number(38, 0) |
| 9 | weight | weight | weight | number(10, 4) |
| 10 | workstep | workstep | workstep | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | date |  |  | sysdate |