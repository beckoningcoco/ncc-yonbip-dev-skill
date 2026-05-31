# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | castunitid | castunitid | castunitid | varchar2(20) |
| 3 | changerate | changerate | changerate | varchar2(20) |  |  | '~' |
| 4 | confirmed_num | confirmed_num | confirmed_num | number(28, 8) |
| 5 | delivered_num | delivered_num | delivered_num | number(28, 8) |
| 6 | delivered_time | delivered_time | delivered_time | varchar2(19) |
| 7 | if_arrive_close | if_arrive_close | if_arrive_close | char(1) |  |  | 'N' |
| 8 | if_stockin_close | if_stockin_close | if_stockin_close | char(1) |  |  | 'N' |
| 9 | mainnum | mainnum | mainnum | number(28, 8) |
| 10 | materialspec | materialspec | materialspec | varchar2(200) |
| 11 | materialtype | materialtype | materialtype | varchar2(200) |
| 12 | material_code | material_code | material_code | varchar2(200) |
| 13 | material_name | material_name | material_name | varchar2(200) |
| 14 | measdoc | measdoc | measdoc | varchar2(200) |
| 15 | pk_arrvstoorg | pk_arrvstoorg | pk_arrvstoorg | varchar2(20) |
| 16 | pk_delivery | pk_delivery | pk_delivery | varchar2(20) |
| 17 | pk_material | pk_material | pk_material | varchar2(20) |
| 18 | pk_needdeliver_b | pk_needdeliver_b | pk_needdeliver_b | varchar2(20) |
| 19 | pk_order | pk_order | pk_order | varchar2(20) |
| 20 | pk_order_b | pk_order_b | pk_order_b | varchar2(20) |
| 21 | userid | userid | userid | varchar2(20) |
| 22 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |