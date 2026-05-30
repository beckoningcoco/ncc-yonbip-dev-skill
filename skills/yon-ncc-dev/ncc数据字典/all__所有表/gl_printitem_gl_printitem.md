# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printitem | pk_printitem | pk_printitem | char(20) | √ |
| 2 | glprintvo | glprintvo | glprintvo | blob |
| 3 | glqueryvo | glqueryvo | glqueryvo | blob |
| 4 | ispublic | ispublic | ispublic | char(1) |
| 5 | itemcode | itemcode | itemcode | varchar2(15) |
| 6 | itemname | itemname | itemname | varchar2(50) |
| 7 | memo | memo | memo | varchar2(300) |
| 8 | pk_creator | pk_creator | pk_creator | char(20) |
| 9 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 10 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 11 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 12 | printobjectcode | printobjectcode | printobjectcode | varchar2(16) |
| 13 | reserve1 | reserve1 | reserve1 | char(1) |
| 14 | reserve2 | reserve2 | reserve2 | varchar2(60) |
| 15 | reserve3 | reserve3 | reserve3 | varchar2(60) |
| 16 | reserve4 | reserve4 | reserve4 | varchar2(60) |
| 17 | reserve5 | reserve5 | reserve5 | varchar2(60) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |