# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10653.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | effect | effect | effect | number(38, 0) | √ |  | 0 |
| 3 | feedback_date | feedback_date | feedback_date | date |
| 4 | honourid | honourid | honourid | varchar2(660) |
| 5 | issame | issame | issame | number(38, 0) | √ |  | 0 |
| 6 | objectiveid | objectiveid | objectiveid | varchar2(32) | √ |
| 7 | plaintext | plaintext | plaintext | varchar2(3000) |
| 8 | receiver | receiver | receiver | varchar2(32) |
| 9 | receivername | receivername | receivername | varchar2(150) |
| 10 | source | source | source | number(38, 0) | √ |  | 0 |
| 11 | staffid | staffid | staffid | varchar2(32) |
| 12 | staffname | staffname | staffname | varchar2(150) |
| 13 | tagid | tagid | tagid | varchar2(32) |
| 14 | tagname | tagname | tagname | varchar2(30) |
| 15 | tenantid | tenantid | tenantid | varchar2(32) |
| 16 | text | text | text | varchar2(3000) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | date |  |  | sysdate |