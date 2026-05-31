# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busioperation | pk_busioperation | pk_busioperation | char(20) | √ |
| 2 | beginstate | beginstate | beginstate | varchar2(20) |  |  | '~' |
| 3 | displayname | displayname | displayname | varchar2(300) |
| 4 | displayname2 | displayname2 | displayname2 | varchar2(300) |
| 5 | displayname3 | displayname3 | displayname3 | varchar2(300) |
| 6 | displayname4 | displayname4 | displayname4 | varchar2(300) |
| 7 | displayname5 | displayname5 | displayname5 | varchar2(300) |
| 8 | displayname6 | displayname6 | displayname6 | varchar2(300) |
| 9 | endstate | endstate | endstate | varchar2(20) |  |  | '~' |
| 10 | opclassname | opclassname | opclassname | varchar2(200) |
| 11 | opcode | opcode | opcode | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |