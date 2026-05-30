# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7266.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | pk_rule | pk_rule | varchar2(50) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | errorcode | errorcode | errorcode | varchar2(50) |  |  | '32000' |
| 5 | ischecknull | ischecknull | ischecknull | char(1) |  |  | 'N' |
| 6 | isdefault | isdefault | isdefault | char(1) |  |  | 'N' |
| 7 | mdclassid | mdclassid | mdclassid | varchar2(36) |  |  | '~' |
| 8 | rulecontent | rulecontent | rulecontent | varchar2(150) |
| 9 | rulecontent2 | rulecontent2 | rulecontent2 | varchar2(150) |
| 10 | rulecontent3 | rulecontent3 | rulecontent3 | varchar2(150) |
| 11 | rulecontent4 | rulecontent4 | rulecontent4 | varchar2(150) |
| 12 | rulecontent5 | rulecontent5 | rulecontent5 | varchar2(150) |
| 13 | rulecontent6 | rulecontent6 | rulecontent6 | varchar2(150) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |