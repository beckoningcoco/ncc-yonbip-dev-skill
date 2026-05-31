# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sourcebillitemkey | sourcebillitemkey | sourcebillitemkey | char(20) | √ |
| 2 | beforecost | beforecost | beforecost | number(28, 8) |  |  | 0 |
| 3 | centernum | centernum | centernum | number(28, 8) |
| 4 | cynum | cynum | cynum | number(28, 8) |
| 5 | diffcost | diffcost | diffcost | number(28, 8) |  |  | 0 |
| 6 | factcost | factcost | factcost | number(28, 8) |  |  | 0 |
| 7 | measdocname | measdocname | measdocname | varchar2(50) |
| 8 | moneyscale | moneyscale | moneyscale | number(38, 0) |  |  | 8 |
| 9 | numscale | numscale | numscale | number(38, 0) |  |  | 8 |
| 10 | pk_center | pk_center | pk_center | varchar2(20) |  |  | '~' |
| 11 | pk_co | pk_co | pk_co | varchar2(20) |  |  | '~' |
| 12 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 13 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 14 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |
| 16 | pk_usedcenter | pk_usedcenter | pk_usedcenter | varchar2(20) |  |  | '~' |
| 17 | pk_usedco | pk_usedco | pk_usedco | varchar2(20) |  |  | '~' |
| 18 | pk_usedmaterial | pk_usedmaterial | pk_usedmaterial | varchar2(20) |  |  | '~' |
| 19 | plancost | plancost | plancost | number(28, 8) |  |  | 0 |
| 20 | price | price | price | number(28, 8) |  |  | 0 |
| 21 | pricescale | pricescale | pricescale | number(38, 0) |  |  | 8 |
| 22 | servicecode | servicecode | servicecode | varchar2(50) |
| 23 | servicename | servicename | servicename | varchar2(50) |
| 24 | sourcebillkey | sourcebillkey | sourcebillkey | char(20) |
| 25 | sumnum | sumnum | sumnum | number(28, 8) |  |  | 0 |
| 26 | usenum | usenum | usenum | number(28, 8) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |