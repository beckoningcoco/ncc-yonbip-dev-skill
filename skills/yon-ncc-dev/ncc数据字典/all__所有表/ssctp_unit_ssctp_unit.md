# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11926.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unit | pk_unit | pk_unit | char(20) | √ |
| 2 | code | code | code | varchar2(255) |
| 3 | enablecalendar | enablecalendar | enablecalendar | char(1) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 5 | manager | manager | manager | varchar2(20) |  |  | '~' |
| 6 | name | name | name | varchar2(383) |
| 7 | name2 | name2 | name2 | varchar2(383) |
| 8 | name3 | name3 | name3 | varchar2(383) |
| 9 | name4 | name4 | name4 | varchar2(383) |
| 10 | name5 | name5 | name5 | varchar2(383) |
| 11 | name6 | name6 | name6 | varchar2(383) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_workcalendar | pk_workcalendar | pk_workcalendar | varchar2(20) |  |  | '~' |
| 15 | remark | remark | remark | varchar2(1000) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |