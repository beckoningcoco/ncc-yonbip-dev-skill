# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contractin_ext | pk_contractin_ext | pk_contractin_ext | char(20) | √ |
| 2 | contract_pay_flag | contract_pay_flag | contract_pay_flag | char(1) |
| 3 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 4 | framework_flag | framework_flag | framework_flag | char(1) |
| 5 | lease_alone_flag | lease_alone_flag | lease_alone_flag | char(1) |
| 6 | lease_in_flag | lease_in_flag | lease_in_flag | char(1) |
| 7 | lease_out_flag | lease_out_flag | lease_out_flag | char(1) |
| 8 | non_fixed_flag | non_fixed_flag | non_fixed_flag | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | settle_pay_flag | settle_pay_flag | settle_pay_flag | char(1) |
| 11 | transtypecode | transtypecode | transtypecode | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |