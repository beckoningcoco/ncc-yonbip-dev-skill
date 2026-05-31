# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | bizname | bizname | bizname | varchar2(600) | √ |
| 3 | biztype | biztype | biztype | number(38, 0) | √ |
| 4 | issystem | issystem | issystem | number(38, 0) | √ |
| 5 | tenantid | tenantid | tenantid | varchar2(32) |
| 6 | workstep | workstep | workstep | number(38, 0) |
| 7 | workstepname | workstepname | workstepname | varchar2(600) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | date |  |  | sysdate |