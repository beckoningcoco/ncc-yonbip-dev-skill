# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_ext | pk_contract_ext | pk_contract_ext | char(20) | √ |
| 2 | lease_alone_flag | lease_alone_flag | lease_alone_flag | char(1) |
| 3 | lease_in_flag | lease_in_flag | lease_in_flag | char(1) |
| 4 | lease_out_flag | lease_out_flag | lease_out_flag | char(1) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 7 | transtypecode | transtypecode | transtypecode | varchar2(30) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |