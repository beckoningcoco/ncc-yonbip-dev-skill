# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_netbankinftp | pk_netbankinftp | pk_netbankinftp | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | isdefault | isdefault | isdefault | char(1) |
| 6 | ispreparetp | ispreparetp | ispreparetp | char(1) |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | netbankinftpdes | netbankinftpdes | netbankinftpdes | varchar2(300) |
| 14 | netitfname | netitfname | netitfname | varchar2(300) |
| 15 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) | √ |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |