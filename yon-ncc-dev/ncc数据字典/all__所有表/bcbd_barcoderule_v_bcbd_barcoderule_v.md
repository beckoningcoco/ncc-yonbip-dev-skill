# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6648.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_source | pk_source | pk_source | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | complement | complement | complement | number(38, 0) | √ |
| 4 | delivretail | delivretail | delivretail | char(1) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | fillcode | fillcode | fillcode | varchar2(1) |  |  | '@' |
| 7 | isdefault | isdefault | isdefault | char(1) |
| 8 | isgencode | isgencode | isgencode | char(1) |
| 9 | isretail | isretail | isretail | char(1) |
| 10 | length | length | length | number(38, 0) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | name | name | name | varchar2(300) |
| 13 | name2 | name2 | name2 | varchar2(300) |
| 14 | name3 | name3 | name3 | varchar2(300) |
| 15 | name4 | name4 | name4 | varchar2(300) |
| 16 | name5 | name5 | name5 | varchar2(300) |
| 17 | name6 | name6 | name6 | varchar2(300) |
| 18 | pk_barappobj | pk_barappobj | pk_barappobj | varchar2(20) |  |  | '~' |
| 19 | pk_barcoderule | pk_barcoderule | pk_barcoderule | char(20) | √ |
| 20 | pk_bartype | pk_bartype | pk_bartype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | preview | preview | preview | varchar2(50) |
| 24 | version | version | version | number(28, 8) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |