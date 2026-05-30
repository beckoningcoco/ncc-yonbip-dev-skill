# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_detail | pk_route_detail | pk_route_detail | char(20) | √ |
| 2 | coordinate | coordinate | coordinate | varchar2(100) |
| 3 | coordinate_desc | coordinate_desc | coordinate_desc | varchar2(200) |
| 4 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 7 | pk_measpoint | pk_measpoint | pk_measpoint | varchar2(20) |  |  | '~' |
| 8 | pk_measpoint_b | pk_measpoint_b | pk_measpoint_b | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_route | pk_route | pk_route | char(20) | √ |
| 12 | pk_route_summary | pk_route_summary | pk_route_summary | varchar2(20) |  |  | '~' |
| 13 | pk_standard | pk_standard | pk_standard | varchar2(20) |  |  | '~' |
| 14 | pk_standard_b | pk_standard_b | pk_standard_b | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |