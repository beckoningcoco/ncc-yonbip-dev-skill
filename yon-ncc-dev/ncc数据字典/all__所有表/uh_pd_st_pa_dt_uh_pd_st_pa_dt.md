# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12680.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpadt | pk_pdpadt | pk_pdpadt | char(20) | √ |
| 2 | factor_sb | factor_sb | factor_sb | varchar2(50) |
| 3 | note | note | note | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_measdoc_sales | pk_measdoc_sales | pk_measdoc_sales | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 7 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 8 | pk_pdpa | pk_pdpa | pk_pdpa | varchar2(20) |  |  | '~' |
| 9 | pk_pdstpa | pk_pdstpa | pk_pdstpa | char(20) | √ |
| 10 | price_after_sales | price_after_sales | price_after_sales | number(28, 8) |
| 11 | price_before_sales | price_before_sales | price_before_sales | number(28, 8) |
| 12 | sortno | sortno | sortno | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |