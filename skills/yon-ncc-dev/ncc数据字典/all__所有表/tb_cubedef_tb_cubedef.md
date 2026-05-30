# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | busisystem | busisystem | busisystem | varchar2(30) |
| 3 | cubetype | cubetype | cubetype | varchar2(30) |
| 4 | description | description | description | varchar2(255) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 6 | objcode | objcode | objcode | varchar2(50) | √ |
| 7 | objname | objname | objname | varchar2(100) | √ |
| 8 | objname2 | objname2 | objname2 | varchar2(100) |
| 9 | objname3 | objname3 | objname3 | varchar2(100) |
| 10 | objname4 | objname4 | objname4 | varchar2(100) |
| 11 | objname5 | objname5 | objname5 | varchar2(100) |
| 12 | objname6 | objname6 | objname6 | varchar2(100) |
| 13 | pk_org | pk_org | pk_org | char(20) |
| 14 | recalculate | recalculate | recalculate | char(1) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |