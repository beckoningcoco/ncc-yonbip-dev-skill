# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convolution | pk_convolution | pk_convolution | char(20) | √ |
| 2 | convdate | convdate | convdate | char(19) |
| 3 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 4 | effectperiod | effectperiod | effectperiod | varchar2(20) |  |  | '~' |
| 5 | executetime | executetime | executetime | char(19) |
| 6 | execute_status | execute_status | execute_status | number(38, 0) |
| 7 | executor | executor | executor | varchar2(20) |  |  | '~' |
| 8 | isrestdcost | isrestdcost | isrestdcost | char(1) |
| 9 | material | material | material | number(38, 0) |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 11 | pk_convscheme | pk_convscheme | pk_convscheme | varchar2(20) |  |  | '~' |
| 12 | pk_costtype | pk_costtype | pk_costtype | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | char(20) |
| 14 | pk_historytask | pk_historytask | pk_historytask | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 18 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 19 | pricelist | pricelist | pricelist | number(38, 0) |
| 20 | pricelist_effectdate | pricelist_effectdate | pricelist_effectdate | char(19) |
| 21 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 22 | target_costtype | target_costtype | target_costtype | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |