# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8424.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountrule | pk_accountrule | pk_accountrule | char(20) | √ |
| 2 | accrelation | accrelation | accrelation | number(38, 0) | √ |  | 1 |
| 3 | otheraccorint | otheraccorint | otheraccorint | number(38, 0) |
| 4 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 5 | pk_vouchkrule | pk_vouchkrule | pk_vouchkrule | char(20) | √ |
| 6 | selfaccorint | selfaccorint | selfaccorint | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |