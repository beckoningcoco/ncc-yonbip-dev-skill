# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_detail | pk_account_detail | pk_account_detail | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 3 | businesstype | businesstype | businesstype | varchar2(50) |
| 4 | deletedate | deletedate | deletedate | char(19) |
| 5 | deleteperson | deleteperson | deleteperson | varchar2(20) |  |  | '~' |
| 6 | deletetime | deletetime | deletetime | char(19) |
| 7 | detailno | detailno | detailno | varchar2(50) |
| 8 | fbmbillno | fbmbillno | fbmbillno | varchar2(200) |
| 9 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 10 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 11 | glcrate | glcrate | glcrate | number(15, 8) |
| 12 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 13 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 14 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 15 | inmoney | inmoney | inmoney | number(28, 8) |
| 16 | interestdate | interestdate | interestdate | char(19) |
| 17 | ischangeinaccdate | ischangeinaccdate | ischangeinaccdate | char(1) |
| 18 | ischeckbalance | ischeckbalance | ischeckbalance | char(1) |
| 19 | isenabledztz | isenabledztz | isenabledztz | char(1) |
| 20 | memo | memo | memo | varchar2(181) |
| 21 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 22 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 23 | olcrate | olcrate | olcrate | number(15, 8) |
| 24 | oppaccount | oppaccount | oppaccount | varchar2(100) |
| 25 | oppunitname | oppunitname | oppunitname | varchar2(100) |
| 26 | orginterestdate | orginterestdate | orginterestdate | char(10) |
| 27 | orgtallydate | orgtallydate | orgtallydate | char(10) |
| 28 | outmoney | outmoney | outmoney | number(28, 8) |
| 29 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 30 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_oppacc | pk_oppacc | pk_oppacc | varchar2(20) |  |  | '~' |
| 33 | pk_opporg | pk_opporg | pk_opporg | varchar2(20) |  |  | '~' |
| 34 | pk_oppunit | pk_oppunit | pk_oppunit | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 38 | pk_ownerorg_v | pk_ownerorg_v | pk_ownerorg_v | varchar2(20) |  |  | '~' |
| 39 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 40 | pk_sourcebill_b | pk_sourcebill_b | pk_sourcebill_b | varchar2(20) |  |  | '~' |
| 41 | reverseflag | reverseflag | reverseflag | char(1) |
| 42 | sfflag | sfflag | sfflag | number(38, 0) |
| 43 | sourcesystem | sourcesystem | sourcesystem | varchar2(50) |
| 44 | tallydate | tallydate | tallydate | char(19) |
| 45 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 46 | tallytime | tallytime | tallytime | char(19) |
| 47 | tradeaccount | tradeaccount | tradeaccount | varchar2(100) |
| 48 | tradeorgname | tradeorgname | tradeorgname | varchar2(100) |
| 49 | useflag | useflag | useflag | varchar2(21) |
| 50 | vbillno | vbillno | vbillno | varchar2(200) |
| 51 | def1 | def1 | def1 | varchar2(101) |
| 52 | def2 | def2 | def2 | varchar2(101) |
| 53 | def3 | def3 | def3 | varchar2(101) |
| 54 | def4 | def4 | def4 | varchar2(101) |
| 55 | def5 | def5 | def5 | varchar2(101) |
| 56 | def6 | def6 | def6 | varchar2(101) |
| 57 | def7 | def7 | def7 | varchar2(101) |
| 58 | def8 | def8 | def8 | varchar2(101) |
| 59 | def9 | def9 | def9 | varchar2(101) |
| 60 | def10 | def10 | def10 | varchar2(101) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |