# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7276.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendar | pk_workcalendar | pk_workcalendar | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) | √ |
| 3 | code | code | code | varchar2(40) | √ |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 6 | enddate | enddate | enddate | char(10) | √ |
| 7 | ffirstweekday | ffirstweekday | ffirstweekday | number(38, 0) |  |  | 1 |
| 8 | isdefaultcalendar | isdefaultcalendar | isdefaultcalendar | char(1) |  |  | 'N' |
| 9 | name | name | name | varchar2(300) | √ |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_holidayrule | pk_holidayrule | pk_holidayrule | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_workcalendrule | pk_workcalendrule | pk_workcalendrule | char(20) | √ |
| 19 | yearstartdate | yearstartdate | yearstartdate | char(10) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |