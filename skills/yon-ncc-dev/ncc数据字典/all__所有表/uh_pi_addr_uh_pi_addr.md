# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiaddr | pk_patiaddr | pk_patiaddr | char(20) | √ |
| 2 | addr | addr | addr | varchar2(256) |
| 3 | dt_addrtype | dt_addrtype | dt_addrtype | varchar2(50) |
| 4 | dt_country | dt_country | dt_country | varchar2(50) |
| 5 | dt_region | dt_region | dt_region | varchar2(50) |
| 6 | dt_region_city | dt_region_city | dt_region_city | varchar2(50) |
| 7 | dt_region_dist | dt_region_dist | dt_region_dist | varchar2(50) |
| 8 | dt_region_prov | dt_region_prov | dt_region_prov | varchar2(50) |
| 9 | dt_region_st | dt_region_st | dt_region_st | varchar2(50) |
| 10 | flag_use | flag_use | flag_use | char(1) |
| 11 | name_st | name_st | name_st | varchar2(50) |
| 12 | pk_addrtype | pk_addrtype | pk_addrtype | varchar2(20) |  |  | '~' |
| 13 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 17 | pk_region | pk_region | pk_region | varchar2(20) |  |  | '~' |
| 18 | pk_region_city | pk_region_city | pk_region_city | varchar2(20) |  |  | '~' |
| 19 | pk_region_dist | pk_region_dist | pk_region_dist | varchar2(20) |  |  | '~' |
| 20 | pk_region_prov | pk_region_prov | pk_region_prov | varchar2(20) |  |  | '~' |
| 21 | postcode | postcode | postcode | varchar2(50) |
| 22 | sortno | sortno | sortno | number(38, 0) |
| 23 | teleno | teleno | teleno | varchar2(50) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |