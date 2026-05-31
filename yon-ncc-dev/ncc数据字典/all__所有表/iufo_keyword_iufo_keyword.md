# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9651.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_keyword | pk_keyword | pk_keyword | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | detailtable | detailtable | detailtable | varchar2(40) |
| 5 | isbuiltin | isbuiltin | isbuiltin | char(1) | √ |
| 6 | isprivate | isprivate | isprivate | char(1) |
| 7 | isseal | isseal | isseal | char(1) | √ |
| 8 | isv5basedoc | isv5basedoc | isv5basedoc | char(1) |
| 9 | len | len | len | number(38, 0) |
| 10 | name | name | name | varchar2(300) | √ |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | note | note | note | varchar2(300) |
| 17 | note2 | note2 | note2 | varchar2(300) |
| 18 | note3 | note3 | note3 | varchar2(300) |
| 19 | note4 | note4 | note4 | varchar2(300) |
| 20 | note5 | note5 | note5 | varchar2(300) |
| 21 | note6 | note6 | note6 | varchar2(300) |
| 22 | ref_pk | ref_pk | ref_pk | varchar2(50) |  |  | '~' |
| 23 | repidofprivate | repidofprivate | repidofprivate | varchar2(20) |
| 24 | time_div | time_div | time_div | blob |
| 25 | type | type | type | number(38, 0) | √ |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |