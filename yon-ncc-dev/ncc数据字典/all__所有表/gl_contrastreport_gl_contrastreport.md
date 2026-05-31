# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastreport | pk_contrastreport | pk_contrastreport | char(20) | √ |
| 2 | accperiod | accperiod | accperiod | char(20) |
| 3 | bselect | bselect | bselect | char(1) |
| 4 | buildtime | buildtime | buildtime | char(19) |
| 5 | contrastarea | contrastarea | contrastarea | varchar2(50) |
| 6 | contrastcontent | contrastcontent | contrastcontent | char(5) |
| 7 | contrastmoney | contrastmoney | contrastmoney | char(1) |
| 8 | isbuilded | isbuilded | isbuilded | number(38, 0) |
| 9 | isconfirmed | isconfirmed | isconfirmed | char(1) |
| 10 | isfinished | isfinished | isfinished | char(1) |
| 11 | otheraccountbook | otheraccountbook | otheraccountbook | char(20) |
| 12 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) |
| 13 | pk_checked | pk_checked | pk_checked | varchar2(20) |
| 14 | pk_contrastrule | pk_contrastrule | pk_contrastrule | char(20) |
| 15 | pk_currtype | pk_currtype | pk_currtype | char(20) |
| 16 | rowno | rowno | rowno | number(38, 0) |
| 17 | selfaccountbook | selfaccountbook | selfaccountbook | char(20) |
| 18 | self_accountingbook | self_accountingbook | self_accountingbook | char(20) |
| 19 | smonth | smonth | smonth | char(2) |
| 20 | syear | syear | syear | char(4) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |