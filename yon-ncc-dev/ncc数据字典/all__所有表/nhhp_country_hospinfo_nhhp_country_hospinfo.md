# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hospinfo | pk_hospinfo | pk_hospinfo | char(20) | √ |
| 2 | contacter | contacter | contacter | varchar2(50) |
| 3 | hospitaladdress | hospitaladdress | hospitaladdress | varchar2(50) |
| 4 | hospitalareaid | hospitalareaid | hospitalareaid | varchar2(50) |
| 5 | hospitalid | hospitalid | hospitalid | varchar2(50) |
| 6 | hospitallevel | hospitallevel | hospitallevel | varchar2(50) |
| 7 | hospitalname | hospitalname | hospitalname | varchar2(50) |
| 8 | phone | phone | phone | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |