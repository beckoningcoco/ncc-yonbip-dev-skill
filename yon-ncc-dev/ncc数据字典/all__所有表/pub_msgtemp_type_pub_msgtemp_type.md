# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_temptype | pk_temptype | pk_temptype | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | innercode | innercode | innercode | varchar2(200) |
| 4 | metaid | metaid | metaid | varchar2(36) |  |  | '~' |
| 5 | name | name | name | varchar2(300) |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | parentpk | parentpk | parentpk | varchar2(20) |  |  | '~' |
| 12 | tempcode | tempcode | tempcode | varchar2(50) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |