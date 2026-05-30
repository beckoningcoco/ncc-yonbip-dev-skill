# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | day | day | day | varchar2(3) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 4 | fdate | fdate | fdate | date |
| 5 | halfyear | halfyear | halfyear | varchar2(1) |
| 6 | month | month | month | varchar2(2) |
| 7 | periodcode | periodcode | periodcode | varchar2(13) | √ |
| 8 | periodname | periodname | periodname | varchar2(600) | √ |
| 9 | periodtype | periodtype | periodtype | number(38, 0) |
| 10 | season | season | season | varchar2(1) |
| 11 | tdate | tdate | tdate | date |
| 12 | tenantid | tenantid | tenantid | varchar2(32) |
| 13 | week | week | week | varchar2(2) |
| 14 | year | year | year | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | date |  |  | sysdate |