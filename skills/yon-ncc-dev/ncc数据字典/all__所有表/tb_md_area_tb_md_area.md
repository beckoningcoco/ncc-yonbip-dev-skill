# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | areaid | areaid | areaid | varchar2(50) | √ |
| 3 | areainfo | areainfo | areainfo | varchar2(512) |
| 4 | celldv | celldv | celldv | blob |
| 5 | celldvname | celldvname | celldvname | blob |
| 6 | checkvalue | checkvalue | checkvalue | blob |
| 7 | coldimname | coldimname | coldimname | blob |
| 8 | colheader | colheader | colheader | blob |
| 9 | cubecode | cubecode | cubecode | varchar2(50) |
| 10 | cubename | cubename | cubename | varchar2(100) |
| 11 | paradim | paradim | paradim | varchar2(512) |
| 12 | pdname | pdname | pdname | varchar2(1024) |
| 13 | pk_dataset | pk_dataset | pk_dataset | varchar2(20) |
| 14 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 15 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 16 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) | √ |
| 17 | readonlydv | readonlydv | readonlydv | blob |
| 18 | rowdimname | rowdimname | rowdimname | blob |
| 19 | rowheader | rowheader | rowheader | blob |
| 20 | varareadef | varareadef | varareadef | blob |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |