# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflowcase | pk_cashflowcase | pk_cashflowcase | char(20) | √ |
| 2 | assid | assid | assid | char(20) |
| 3 | flag | flag | flag | number(38, 0) |
| 4 | memo | memo | memo | varchar2(150) |
| 5 | money | money | money | number(28, 8) |
| 6 | moneyglobal | moneyglobal | moneyglobal | number(28, 8) |
| 7 | moneygroup | moneygroup | moneygroup | number(28, 8) |
| 8 | moneymain | moneymain | moneymain | number(28, 8) |
| 9 | moneysetofbook | moneysetofbook | moneysetofbook | number(28, 8) |
| 10 | pk_accasoa | pk_accasoa | pk_accasoa | char(20) |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 12 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) |
| 13 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 14 | pk_detail | pk_detail | pk_detail | char(20) |
| 15 | pk_detail_opp | pk_detail_opp | pk_detail_opp | char(20) |
| 16 | pk_group | pk_group | pk_group | char(20) |
| 17 | pk_innercorp | pk_innercorp | pk_innercorp | char(20) |
| 18 | pk_liabilitycenter | pk_liabilitycenter | pk_liabilitycenter | char(20) |
| 19 | pk_manager | pk_manager | pk_manager | char(20) |
| 20 | pk_org | pk_org | pk_org | char(20) |
| 21 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 22 | pk_setofbook | pk_setofbook | pk_setofbook | char(20) |
| 23 | pk_unit | pk_unit | pk_unit | char(20) |
| 24 | pk_voucher | pk_voucher | pk_voucher | char(20) |
| 25 | prepareddate | prepareddate | prepareddate | char(19) |
| 26 | quickflag | quickflag | quickflag | char(1) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |