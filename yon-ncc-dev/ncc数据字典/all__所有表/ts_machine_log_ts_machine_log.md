# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12287.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | code | code | code | varchar2(36) |
| 3 | end_time | end_time | end_time | date |
| 4 | imp_file_path | imp_file_path | imp_file_path | varchar2(255) |
| 5 | message | message | message | varchar2(4000) |
| 6 | start_time | start_time | start_time | date | √ |
| 7 | status | status | status | number(38, 0) | √ |  | 0 |
| 8 | tenantid | tenantid | tenantid | varchar2(36) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | date |  |  | sysdate |