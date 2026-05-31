# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | dimid | dimid | dimid | varchar2(32) |
| 3 | dimtype | dimtype | dimtype | number(38, 0) |
| 4 | indicatorid | indicatorid | indicatorid | varchar2(32) | √ |
| 5 | psnweight | psnweight | psnweight | number(10, 4) |
| 6 | sheetid | sheetid | sheetid | varchar2(32) | √ |
| 7 | staffid | staffid | staffid | varchar2(36) |
| 8 | tenantid | tenantid | tenantid | varchar2(32) |
| 9 | turn | turn | turn | number(38, 0) | √ |
| 10 | weight | weight | weight | number(10, 4) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | date |  |  | sysdate |