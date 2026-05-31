# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobrank | pk_jobrank | pk_jobrank | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | jobrankcode | jobrankcode | jobrankcode | varchar2(28) |
| 5 | jobrankdesc | jobrankdesc | jobrankdesc | varchar2(1500) |
| 6 | jobrankname | jobrankname | jobrankname | varchar2(1536) |
| 7 | jobrankname2 | jobrankname2 | jobrankname2 | varchar2(1536) |
| 8 | jobrankname3 | jobrankname3 | jobrankname3 | varchar2(1536) |
| 9 | jobrankname4 | jobrankname4 | jobrankname4 | varchar2(1536) |
| 10 | jobrankname5 | jobrankname5 | jobrankname5 | varchar2(1536) |
| 11 | jobrankname6 | jobrankname6 | jobrankname6 | varchar2(1536) |
| 12 | jobrankorder | jobrankorder | jobrankorder | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | sealflag | sealflag | sealflag | char(1) |
| 16 | usedflag | usedflag | usedflag | char(1) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |