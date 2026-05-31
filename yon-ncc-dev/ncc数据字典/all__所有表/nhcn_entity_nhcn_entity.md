# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddt | pk_ordpddt | pk_ordpddt | char(20) | √ |
| 2 | batch_pd | batch_pd | batch_pd | varchar2(50) |
| 3 | batch_quan | batch_quan | batch_quan | number(14, 2) |
| 4 | pk_batch_pd | pk_batch_pd | pk_batch_pd | varchar2(50) |
| 5 | pk_bill | pk_bill | pk_bill | varchar2(50) |
| 6 | pk_fac | pk_fac | pk_fac | varchar2(50) |
| 7 | pk_sp | pk_sp | pk_sp | varchar2(50) |
| 8 | purprice_sp | purprice_sp | purprice_sp | number(14, 8) |
| 9 | sale_price | sale_price | sale_price | number(14, 8) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |