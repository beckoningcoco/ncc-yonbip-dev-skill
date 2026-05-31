# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8193.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discalculate | pk_discalculate | pk_discalculate | char(20) | √ |
| 2 | auto_calculate | auto_calculate | auto_calculate | char(1) |
| 3 | delay_days | delay_days | delay_days | number(38, 0) |
| 4 | discount_date | discount_date | discount_date | char(19) |
| 5 | interest_date_year | interest_date_year | interest_date_year | number(28, 8) |
| 6 | interest_days | interest_days | interest_days | number(38, 0) |  |  | 360 |
| 7 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 8 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |