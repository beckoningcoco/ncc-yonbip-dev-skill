# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12722.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiprepaydt | pk_patiprepaydt | pk_patiprepaydt | char(20) | √ |
| 2 | amt_prepay | amt_prepay | amt_prepay | number(14, 2) |
| 3 | balc_prepay | balc_prepay | balc_prepay | number(14, 2) |
| 4 | date_prepay | date_prepay | date_prepay | char(19) |
| 5 | eu_credtype | eu_credtype | eu_credtype | number(38, 0) |
| 6 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 7 | note | note | note | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 11 | pk_patiacc | pk_patiacc | pk_patiacc | char(20) | √ |
| 12 | pk_paypati | pk_paypati | pk_paypati | varchar2(50) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |