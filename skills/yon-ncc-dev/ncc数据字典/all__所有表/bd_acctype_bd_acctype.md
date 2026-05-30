# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6733.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acctype | pk_acctype | pk_acctype | char(20) | √ |
| 2 | balangroup | balangroup | balangroup | char(20) |
| 3 | balanorient | balanorient | balanorient | number(38, 0) | √ |
| 4 | balanposition | balanposition | balanposition | number(38, 0) | √ |
| 5 | ccode | ccode | ccode | varchar2(50) | √ |  | '~' |
| 6 | code | code | code | number(38, 0) | √ |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_accsystem | pk_accsystem | pk_accsystem | char(20) | √ |
| 15 | type | type | type | number(38, 0) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |