# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custaxes | pk_custaxes | pk_custaxes | char(20) | √ |
| 2 | custtaxescode | custtaxescode | custtaxescode | varchar2(40) |
| 3 | custtaxesname | custtaxesname | custtaxesname | varchar2(300) |
| 4 | custtaxesname2 | custtaxesname2 | custtaxesname2 | varchar2(300) |
| 5 | custtaxesname3 | custtaxesname3 | custtaxesname3 | varchar2(300) |
| 6 | custtaxesname4 | custtaxesname4 | custtaxesname4 | varchar2(300) |
| 7 | custtaxesname5 | custtaxesname5 | custtaxesname5 | varchar2(300) |
| 8 | custtaxesname6 | custtaxesname6 | custtaxesname6 | varchar2(300) |
| 9 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | remarks | remarks | remarks | varchar2(1024) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |