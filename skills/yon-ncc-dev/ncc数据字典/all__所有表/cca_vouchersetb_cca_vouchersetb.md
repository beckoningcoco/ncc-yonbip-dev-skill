# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchersetb | pk_vouchersetb | pk_vouchersetb | char(20) | √ |
| 2 | accrualvoucherabs | accrualvoucherabs | accrualvoucherabs | varchar2(50) |
| 3 | accuraldire | accuraldire | accuraldire | number(38, 0) |
| 4 | heagedire | heagedire | heagedire | number(38, 0) |
| 5 | hedgevoucherabs | hedgevoucherabs | hedgevoucherabs | varchar2(50) |
| 6 | needcover | needcover | needcover | char(1) |
| 7 | pk_accrualasscount | pk_accrualasscount | pk_accrualasscount | varchar2(20) |  |  | '~' |
| 8 | pk_accrualbal | pk_accrualbal | pk_accrualbal | varchar2(20) |  |  | '~' |
| 9 | pk_accrualbalass | pk_accrualbalass | pk_accrualbalass | varchar2(20) |  |  | '~' |
| 10 | pk_accrualfactor | pk_accrualfactor | pk_accrualfactor | varchar2(20) |  |  | '~' |
| 11 | pk_accrualsubject | pk_accrualsubject | pk_accrualsubject | varchar2(20) |  |  | '~' |
| 12 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 13 | pk_expenseaccrual | pk_expenseaccrual | pk_expenseaccrual | varchar2(50) |
| 14 | pk_heageasscount | pk_heageasscount | pk_heageasscount | varchar2(20) |  |  | '~' |
| 15 | pk_heagebalass | pk_heagebalass | pk_heagebalass | varchar2(20) |  |  | '~' |
| 16 | pk_heagecountobj | pk_heagecountobj | pk_heagecountobj | varchar2(20) |  |  | '~' |
| 17 | pk_heagefactor | pk_heagefactor | pk_heagefactor | varchar2(20) |  |  | '~' |
| 18 | pk_hedgebal | pk_hedgebal | pk_hedgebal | varchar2(20) |  |  | '~' |
| 19 | pk_hedgetype | pk_hedgetype | pk_hedgetype | varchar2(20) |  |  | '~' |
| 20 | pk_liabilitybook | pk_liabilitybook | pk_liabilitybook | varchar2(20) |  |  | '~' |
| 21 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | varchar2(20) |  |  | '~' |
| 22 | pk_unitorg | pk_unitorg | pk_unitorg | varchar2(20) |  |  | '~' |
| 23 | pk_vouchertype | pk_vouchertype | pk_vouchertype | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |