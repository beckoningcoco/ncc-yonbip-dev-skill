# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auditdef | pk_auditdef | pk_auditdef | char(20) | √ |
| 2 | apsubj | apsubj | apsubj | varchar2(50) |
| 3 | arsubj | arsubj | arsubj | varchar2(50) |
| 4 | auditmodules | auditmodules | auditmodules | varchar2(255) |
| 5 | cuserid | cuserid | cuserid | varchar2(20) |  |  | '~' |
| 6 | endmonth | endmonth | endmonth | varchar2(50) |
| 7 | exportpath | exportpath | exportpath | varchar2(255) |
| 8 | fasubj | fasubj | fasubj | varchar2(50) |  |  | '~' |
| 9 | pk_bdinfo | pk_bdinfo | pk_bdinfo | blob |
| 10 | pk_corp | pk_corp | pk_corp | blob |
| 11 | pk_glorgbook | pk_glorgbook | pk_glorgbook | varchar2(20) |  |  | '~' |
| 12 | pk_waitems | pk_waitems | pk_waitems | blob |
| 13 | predevsubj | predevsubj | predevsubj | varchar2(50) |  |  | '~' |
| 14 | reportobj | reportobj | reportobj | blob |
| 15 | reporttext | reporttext | reporttext | varchar2(50) |
| 16 | reporttextnew | reporttextnew | reporttextnew | blob |
| 17 | startmonth | startmonth | startmonth | varchar2(50) |
| 18 | sumdepsubj | sumdepsubj | sumdepsubj | varchar2(50) |  |  | '~' |
| 19 | waitems | waitems | waitems | varchar2(50) |
| 20 | year | year | year | varchar2(50) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |