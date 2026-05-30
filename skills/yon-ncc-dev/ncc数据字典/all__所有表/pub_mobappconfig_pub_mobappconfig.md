# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |
| 3 | appid | appid | appid | varchar2(50) |
| 4 | appname | appname | appname | varchar2(50) |
| 5 | appopenurl | appopenurl | appopenurl | varchar2(200) |
| 6 | domain | domain | domain | varchar2(20) |  |  | '~' |
| 7 | imageurl | imageurl | imageurl | varchar2(50) |
| 8 | ofline | ofline | ofline | char(1) |
| 9 | version | version | version | number(38, 0) |
| 10 | zipurl | zipurl | zipurl | varchar2(200) |
| 11 | def1 | def1 | def1 | varchar2(101) |
| 12 | def2 | def2 | def2 | varchar2(101) |
| 13 | def3 | def3 | def3 | varchar2(101) |
| 14 | def4 | def4 | def4 | varchar2(101) |
| 15 | def5 | def5 | def5 | varchar2(101) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |