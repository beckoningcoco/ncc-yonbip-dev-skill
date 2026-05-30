# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemprice | pk_itemprice | pk_itemprice | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | eu_pricetype | eu_pricetype | eu_pricetype | number(38, 0) |
| 5 | flag_stop | flag_stop | flag_stop | char(1) |
| 6 | pk_group | pk_group | pk_group | char(20) |
| 7 | pk_item | pk_item | pk_item | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | price | price | price | number(28, 8) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |