# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12240.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | absentcount | absentcount | absentcount | number(38, 0) |
| 3 | absentlen | absentlen | absentlen | number(11, 2) |  |  | 0.00 |
| 4 | actualworkdays | actualworkdays | actualworkdays | number(16, 2) |  |  | 0.00 |
| 5 | actualworkhours | actualworkhours | actualworkhours | number(16, 2) |  |  | 0.00 |
| 6 | bu_id | bu_id | bu_id | varchar2(36) |
| 7 | earlycount | earlycount | earlycount | number(38, 0) |  |  | 0 |
| 8 | earlylen | earlylen | earlylen | number(11, 2) |  |  | 0.00 |
| 9 | isallduty | isallduty | isallduty | char(1) |
| 10 | latecount | latecount | latecount | number(38, 0) |  |  | 0 |
| 11 | latelen | latelen | latelen | number(11, 2) |  |  | 0.00 |
| 12 | leavecount | leavecount | leavecount | number(38, 0) |
| 13 | leavelen | leavelen | leavelen | number(11, 2) |
| 14 | month | month | month | number(38, 0) |
| 15 | org_id | org_id | org_id | varchar2(36) |
| 16 | org_name | org_name | org_name | varchar2(200) |
| 17 | staffjob_id | staffjob_id | staffjob_id | varchar2(36) |
| 18 | staff_code | staff_code | staff_code | varchar2(100) |
| 19 | staff_id | staff_id | staff_id | varchar2(36) |
| 20 | staff_name | staff_name | staff_name | varchar2(200) |
| 21 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 22 | workdays | workdays | workdays | number(16, 2) |  |  | 0.00 |
| 23 | workhours | workhours | workhours | number(16, 2) |  |  | 0.00 |
| 24 | workpercent | workpercent | workpercent | number(16, 2) |  |  | 0.00 |
| 25 | year | year | year | char(4) |
| 26 | creationtime | creationtime | creationtime | date |
| 27 | creator | creator | creator | varchar2(36) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | date |
| 30 | modifier | modifier | modifier | varchar2(36) |
| 31 | ts | ts | ts | date |  |  | sysdate |