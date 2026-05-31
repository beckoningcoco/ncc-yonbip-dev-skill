# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | pk_report | pk_report | char(20) | √ |
| 2 | code | code | code | varchar2(20) | √ |
| 3 | colshownull | colshownull | colshownull | char(1) |
| 4 | coltotalfirst | coltotalfirst | coltotalfirst | char(1) | √ |  | 'N' |
| 5 | domain | domain | domain | varchar2(50) |
| 6 | issystem | issystem | issystem | char(1) | √ |  | 'N' |
| 7 | istotal | istotal | istotal | char(1) | √ |  | 'N' |
| 8 | metricdir | metricdir | metricdir | varchar2(20) |
| 9 | moduleid | moduleid | moduleid | varchar2(50) |
| 10 | name | name | name | varchar2(200) | √ |
| 11 | name2 | name2 | name2 | varchar2(200) |
| 12 | name3 | name3 | name3 | varchar2(200) |
| 13 | name4 | name4 | name4 | varchar2(200) |
| 14 | name5 | name5 | name5 | varchar2(200) |
| 15 | name6 | name6 | name6 | varchar2(200) |
| 16 | pk_dboard | pk_dboard | pk_dboard | varchar2(50) |
| 17 | pk_freereport | pk_freereport | pk_freereport | varchar2(50) |
| 18 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 19 | pk_querytemplet | pk_querytemplet | pk_querytemplet | varchar2(50) |
| 20 | pk_reportclass | pk_reportclass | pk_reportclass | varchar2(20) | √ |
| 21 | pk_smartmodel | pk_smartmodel | pk_smartmodel | varchar2(50) |
| 22 | reportcomment | reportcomment | reportcomment | varchar2(200) |
| 23 | reportstatus | reportstatus | reportstatus | varchar2(20) | √ |
| 24 | reporttype | reporttype | reporttype | varchar2(20) | √ |
| 25 | rowshownull | rowshownull | rowshownull | char(1) |
| 26 | rowtotalfirst | rowtotalfirst | rowtotalfirst | char(1) | √ |  | 'N' |
| 27 | type | type | type | varchar2(50) |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | creationtime | creationtime | creationtime | char(19) | √ |
| 34 | creator | creator | creator | varchar2(20) | √ |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |