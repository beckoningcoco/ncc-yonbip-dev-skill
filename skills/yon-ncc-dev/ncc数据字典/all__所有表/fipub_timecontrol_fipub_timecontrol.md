# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timectrl | pk_timectrl | pk_timectrl | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | days | days | days | number(38, 0) |
| 4 | ordertype | ordertype | ordertype | number(38, 0) |  |  | 0 |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | scomment | scomment | scomment | varchar2(1024) |
| 8 | timectrlname | timectrlname | timectrlname | varchar2(200) |
| 9 | timectrlname2 | timectrlname2 | timectrlname2 | varchar2(200) |
| 10 | timectrlname3 | timectrlname3 | timectrlname3 | varchar2(200) |
| 11 | timectrlname4 | timectrlname4 | timectrlname4 | varchar2(200) |
| 12 | timectrlname5 | timectrlname5 | timectrlname5 | varchar2(200) |
| 13 | timectrlname6 | timectrlname6 | timectrlname6 | varchar2(200) |
| 14 | unit | unit | unit | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |