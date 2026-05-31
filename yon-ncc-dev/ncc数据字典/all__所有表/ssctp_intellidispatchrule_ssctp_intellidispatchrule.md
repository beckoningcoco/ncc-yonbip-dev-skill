# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intellidispatchrule | pk_intellidispatchrule | pk_intellidispatchrule | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | dispatchlimit | dispatchlimit | dispatchlimit | char(1) | √ |
| 4 | dispatchtype | dispatchtype | dispatchtype | varchar2(20) | √ |  | '~' |
| 5 | enablecalendar | enablecalendar | enablecalendar | char(1) | √ |
| 6 | enablestate | enablestate | enablestate | number(38, 0) | √ |
| 7 | limitnumber | limitnumber | limitnumber | number(38, 0) | √ |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_managelevel | pk_managelevel | pk_managelevel | number(38, 0) |  |  | 0 |
| 15 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(20) | √ |  | '~' |
| 16 | pk_workcalendar | pk_workcalendar | pk_workcalendar | varchar2(20) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) | √ |
| 18 | creator | creator | creator | varchar2(20) | √ |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |