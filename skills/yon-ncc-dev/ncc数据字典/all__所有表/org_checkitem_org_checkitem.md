# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkitem | pk_checkitem | pk_checkitem | char(20) | √ |
| 2 | associappid | associappid | associappid | varchar2(20) |  |  | '~' |
| 3 | associpoint | associpoint | associpoint | varchar2(20) |  |  | '~' |
| 4 | checkattr | checkattr | checkattr | number(38, 0) |  |  | 1 |
| 5 | checkclass | checkclass | checkclass | varchar2(200) |
| 6 | checkitem_url | checkitem_url | checkitem_url | varchar2(500) |
| 7 | checklinkpoint | checklinkpoint | checklinkpoint | number(38, 0) |  |  | 0 |
| 8 | checkonclose | checkonclose | checkonclose | char(1) |  |  | 'Y' |
| 9 | checkpanel | checkpanel | checkpanel | varchar2(200) |
| 10 | checkstrategy | checkstrategy | checkstrategy | number(38, 0) |  |  | 1 |
| 11 | code | code | code | varchar2(50) |
| 12 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 13 | isexecute | isexecute | isexecute | char(1) |  |  | 'Y' |
| 14 | ispreset | ispreset | ispreset | char(1) |
| 15 | memo | memo | memo | varchar2(400) |
| 16 | moduleid | moduleid | moduleid | varchar2(20) |  |  | '~' |
| 17 | name | name | name | varchar2(300) |
| 18 | name2 | name2 | name2 | varchar2(300) |
| 19 | name3 | name3 | name3 | varchar2(300) |
| 20 | name4 | name4 | name4 | varchar2(300) |
| 21 | name5 | name5 | name5 | varchar2(300) |
| 22 | name6 | name6 | name6 | varchar2(300) |
| 23 | pk_checktype | pk_checktype | pk_checktype | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |