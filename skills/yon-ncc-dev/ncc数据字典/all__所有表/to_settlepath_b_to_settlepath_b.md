# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettlepath_bid | csettlepath_bid | csettlepath_bid | char(20) | √ |
| 2 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 3 | cdowncostregionid | cdowncostregionid | cdowncostregionid | varchar2(20) |  |  | '~' |
| 4 | cdownfinanceorgid | cdownfinanceorgid | cdownfinanceorgid | varchar2(20) |  |  | '~' |
| 5 | crowno | crowno | crowno | varchar2(20) |
| 6 | csettlepathid | csettlepathid | csettlepathid | char(20) | √ |
| 7 | cupcostregionid | cupcostregionid | cupcostregionid | varchar2(20) |  |  | '~' |
| 8 | cupfinanceorgid | cupfinanceorgid | cupfinanceorgid | varchar2(20) |  |  | '~' |
| 9 | ndiscountrate | ndiscountrate | ndiscountrate | number(20, 8) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |