# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12354.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_project | pk_project | pk_project | char(20) | √ |
| 2 | code | code | code | varchar2(100) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | direction | direction | direction | number(38, 0) |
| 5 | isreportorg | isreportorg | isreportorg | char(1) |
| 6 | measurename | measurename | measurename | varchar2(20) |
| 7 | measurepos | measurepos | measurepos | varchar2(20) |
| 8 | name | name | name | varchar2(300) |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_costmeasure | pk_costmeasure | pk_costmeasure | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_projectclass | pk_projectclass | pk_projectclass | varchar2(20) |  |  | '~' |
| 18 | pk_report | pk_report | pk_report | varchar2(20) |
| 19 | refproject | refproject | refproject | varchar2(20) |  |  | '~' |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |