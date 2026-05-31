# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | completion | completion | completion | varchar2(600) |
| 3 | feedbackid | feedbackid | feedbackid | varchar2(32) |
| 4 | objectiveid | objectiveid | objectiveid | varchar2(32) | √ |
| 5 | rate | rate | rate | number(38, 0) | √ |
| 6 | tenantid | tenantid | tenantid | varchar2(32) |
| 7 | updatedate | updatedate | updatedate | date |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | date |  |  | sysdate |