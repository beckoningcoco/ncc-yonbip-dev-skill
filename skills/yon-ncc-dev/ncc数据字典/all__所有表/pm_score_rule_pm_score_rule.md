# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | decimaldigits | decimaldigits | decimaldigits | number(38, 0) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 1 |
| 4 | lowerlimit | lowerlimit | lowerlimit | number(16, 4) |
| 5 | name | name | name | varchar2(150) | √ |
| 6 | orgid | orgid | orgid | varchar2(660) | √ |  | '' |
| 7 | remark | remark | remark | varchar2(600) |
| 8 | ruletype | ruletype | ruletype | number(38, 0) |
| 9 | tenantid | tenantid | tenantid | varchar2(32) |
| 10 | upperlimit | upperlimit | upperlimit | number(16, 4) |
| 11 | creationtime | creationtime | creationtime | date |
| 12 | creator | creator | creator | varchar2(36) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | date |
| 15 | modifier | modifier | modifier | varchar2(36) |
| 16 | ts | ts | ts | date |  |  | sysdate |