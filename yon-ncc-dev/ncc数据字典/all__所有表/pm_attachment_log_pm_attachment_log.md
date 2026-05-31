# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | pub_key | pub_key | pub_key | varchar2(600) | √ |
| 3 | status | status | status | char(1) | √ |  | '0' |
| 4 | tenantid | tenantid | tenantid | varchar2(32) |
| 5 | url | url | url | varchar2(765) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | date |  |  | sysdate |