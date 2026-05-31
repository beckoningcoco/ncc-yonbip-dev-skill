# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffpricetype | pk_tariffpricetype | pk_tariffpricetype | char(20) | √ |
| 2 | bcanmodifyflag | bcanmodifyflag | bcanmodifyflag | char(1) |
| 3 | busedflag | busedflag | busedflag | char(1) |
| 4 | iindex | iindex | iindex | number(38, 0) |
| 5 | loadformula | loadformula | loadformula | varchar2(1000) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 7 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 8 | pk_pricetype | pk_pricetype | pk_pricetype | varchar2(20) |  |  | '~' |
| 9 | pk_tariffdef | pk_tariffdef | pk_tariffdef | varchar2(20) |
| 10 | validateformula | validateformula | validateformula | varchar2(1000) |
| 11 | vpricekey | vpricekey | vpricekey | varchar2(10) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |