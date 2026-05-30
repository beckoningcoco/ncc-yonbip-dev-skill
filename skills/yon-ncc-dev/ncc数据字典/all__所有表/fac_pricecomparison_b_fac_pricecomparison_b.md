# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricecomparison_b | pk_pricecomparison_b | pk_pricecomparison_b | char(20) | √ |
| 2 | businesscategory | businesscategory | businesscategory | number(38, 0) |
| 3 | depositperiod | depositperiod | depositperiod | number(38, 0) |
| 4 | enddate | enddate | enddate | char(19) |
| 5 | interestamount | interestamount | interestamount | number(28, 8) |
| 6 | isenter | isenter | isenter | char(1) |
| 7 | periodunit | periodunit | periodunit | varchar2(50) |
| 8 | pk_branch | pk_branch | pk_branch | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_largebanks | pk_largebanks | pk_largebanks | varchar2(20) |  |  | '~' |
| 11 | pk_pricecomparison | pk_pricecomparison | pk_pricecomparison | char(20) | √ |
| 12 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 13 | totalamount | totalamount | totalamount | number(28, 8) |
| 14 | varcode | varcode | varcode | varchar2(20) |  |  | '~' |
| 15 | varname | varname | varname | varchar2(200) |
| 16 | varname2 | varname2 | varname2 | varchar2(200) |
| 17 | varname3 | varname3 | varname3 | varchar2(200) |
| 18 | varname4 | varname4 | varname4 | varchar2(200) |
| 19 | varname5 | varname5 | varname5 | varchar2(200) |
| 20 | varname6 | varname6 | varname6 | varchar2(200) |
| 21 | yrate | yrate | yrate | number(28, 8) |
| 22 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 23 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 24 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 25 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 26 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 27 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 28 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 29 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 30 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 31 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |