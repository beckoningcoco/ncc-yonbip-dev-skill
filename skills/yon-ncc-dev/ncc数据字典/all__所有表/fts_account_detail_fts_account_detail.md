# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8383.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_detail | pk_account_detail | pk_account_detail | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 3 | businesstype | businesstype | businesstype | varchar2(50) |
| 4 | customidentifier | customidentifier | customidentifier | varchar2(101) |
| 5 | detailno | detailno | detailno | varchar2(50) |
| 6 | fbmbillno | fbmbillno | fbmbillno | varchar2(200) |
| 7 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 8 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 9 | glcrate | glcrate | glcrate | number(15, 8) |
| 10 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 11 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 13 | inmoney | inmoney | inmoney | number(28, 8) |
| 14 | interestdate | interestdate | interestdate | char(19) |
| 15 | ischangeinaccdate | ischangeinaccdate | ischangeinaccdate | char(1) |
| 16 | ischeckbalance | ischeckbalance | ischeckbalance | char(1) |
| 17 | ischeckrepeat | ischeckrepeat | ischeckrepeat | char(1) |
| 18 | isenabledztz | isenabledztz | isenabledztz | char(1) |
| 19 | memo | memo | memo | varchar2(181) |
| 20 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 21 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 22 | olcrate | olcrate | olcrate | number(15, 8) |
| 23 | oppaccount | oppaccount | oppaccount | varchar2(300) |
| 24 | oppunitname | oppunitname | oppunitname | varchar2(300) |
| 25 | orginterestdate | orginterestdate | orginterestdate | char(10) |
| 26 | orgtallydate | orgtallydate | orgtallydate | char(10) |
| 27 | outmoney | outmoney | outmoney | number(28, 8) |
| 28 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_oppacc | pk_oppacc | pk_oppacc | varchar2(20) |  |  | '~' |
| 32 | pk_opporg | pk_opporg | pk_opporg | varchar2(20) |  |  | '~' |
| 33 | pk_opporg_v | pk_opporg_v | pk_opporg_v | varchar2(20) |  |  | '~' |
| 34 | pk_oppunit | pk_oppunit | pk_oppunit | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 38 | pk_ownerorg_v | pk_ownerorg_v | pk_ownerorg_v | varchar2(20) |  |  | '~' |
| 39 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 40 | pk_sourcebill_b | pk_sourcebill_b | pk_sourcebill_b | char(20) |  |  | '~' |
| 41 | pk_sourcedetail | pk_sourcedetail | pk_sourcedetail | varchar2(20) |  |  | '~' |
| 42 | reverseflag | reverseflag | reverseflag | char(1) |
| 43 | sfflag | sfflag | sfflag | number(38, 0) |
| 44 | sourcesystem | sourcesystem | sourcesystem | varchar2(50) |
| 45 | tallydate | tallydate | tallydate | char(19) |
| 46 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 47 | tallytime | tallytime | tallytime | char(19) |
| 48 | tradeaccount | tradeaccount | tradeaccount | varchar2(100) |
| 49 | tradeorgname | tradeorgname | tradeorgname | varchar2(100) |
| 50 | useflag | useflag | useflag | varchar2(21) |
| 51 | vbillno | vbillno | vbillno | varchar2(200) |
| 52 | def1 | def1 | def1 | varchar2(101) |
| 53 | def2 | def2 | def2 | varchar2(101) |
| 54 | def3 | def3 | def3 | varchar2(101) |
| 55 | def4 | def4 | def4 | varchar2(101) |
| 56 | def5 | def5 | def5 | varchar2(101) |
| 57 | def6 | def6 | def6 | varchar2(101) |
| 58 | def7 | def7 | def7 | varchar2(101) |
| 59 | def8 | def8 | def8 | varchar2(101) |
| 60 | def9 | def9 | def9 | varchar2(101) |
| 61 | def10 | def10 | def10 | varchar2(101) |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |