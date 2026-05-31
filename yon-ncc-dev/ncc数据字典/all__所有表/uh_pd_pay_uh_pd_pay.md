# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12667.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpay | pk_pdpay | pk_pdpay | char(20) | √ |
| 2 | amount | amount | amount | varchar2(50) |
| 3 | bankno | bankno | bankno | varchar2(50) |
| 4 | certno | certno | certno | varchar2(50) |
| 5 | code | code | code | varchar2(50) |
| 6 | date_pay | date_pay | date_pay | char(19) |
| 7 | dt_paymode | dt_paymode | dt_paymode | varchar2(50) |
| 8 | note | note | note | varchar2(50) |
| 9 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_paymode | pk_paymode | pk_paymode | varchar2(20) |  |  | '~' |
| 13 | pk_psn_pay | pk_psn_pay | pk_psn_pay | varchar2(50) |
| 14 | pk_sup | pk_sup | pk_sup | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |