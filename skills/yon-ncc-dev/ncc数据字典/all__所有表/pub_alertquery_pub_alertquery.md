# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertquery | pk_alertquery | pk_alertquery | char(20) | √ |
| 2 | alert_query | alert_query | alert_query | blob |
| 3 | code | code | code | varchar2(50) |
| 4 | creation_time | creation_time | creation_time | char(19) |
| 5 | moduleid | moduleid | moduleid | varchar2(10) |
| 6 | name | name | name | varchar2(256) |
| 7 | name2 | name2 | name2 | varchar2(256) |
| 8 | name3 | name3 | name3 | varchar2(256) |
| 9 | name4 | name4 | name4 | varchar2(256) |
| 10 | name5 | name5 | name5 | varchar2(256) |
| 11 | name6 | name6 | name6 | varchar2(256) |
| 12 | pk_dir | pk_dir | pk_dir | char(20) |
| 13 | query_type | query_type | query_type | varchar2(10) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |