# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | pk_report | pk_report | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | flag_active | flag_active | flag_active | char(1) |
| 4 | mnecode | mnecode | mnecode | varchar2(30) |
| 5 | name | name | name | varchar2(50) |
| 6 | name2 | name2 | name2 | varchar2(50) |
| 7 | name3 | name3 | name3 | varchar2(50) |
| 8 | name4 | name4 | name4 | varchar2(50) |
| 9 | name5 | name5 | name5 | varchar2(50) |
| 10 | name6 | name6 | name6 | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | othcode | othcode | othcode | varchar2(30) |
| 13 | pk_group | pk_group | pk_group | varchar2(50) |
| 14 | pk_org | pk_org | pk_org | varchar2(50) |
| 15 | report_data | report_data | report_data | blob |
| 16 | report_sql | report_sql | report_sql | varchar2(50) |
| 17 | wbcode | wbcode | wbcode | varchar2(30) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | char(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | char(20) |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |