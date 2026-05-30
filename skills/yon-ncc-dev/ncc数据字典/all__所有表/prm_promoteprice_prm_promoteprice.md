# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_promoteprice | pk_promoteprice | pk_promoteprice | char(20) | √ |
| 2 | areaclinnercode | areaclinnercode | areaclinnercode | varchar2(230) |
| 3 | bclosedflag | bclosedflag | bclosedflag | char(1) |
| 4 | brelatebaseflag | brelatebaseflag | brelatebaseflag | char(1) |
| 5 | caskunicode | caskunicode | caskunicode | varchar2(27) |
| 6 | cbelongsaleorgid | cbelongsaleorgid | cbelongsaleorgid | varchar2(20) |  |  | '~' |
| 7 | customerinnercode | customerinnercode | customerinnercode | varchar2(230) |
| 8 | dbegindate | dbegindate | dbegindate | varchar2(19) |
| 9 | denddate | denddate | denddate | varchar2(19) |
| 10 | dmodifydate | dmodifydate | dmodifydate | varchar2(19) |
| 11 | fbasediscountflag | fbasediscountflag | fbasediscountflag | number(38, 0) |
| 12 | flimitmodelflag | flimitmodelflag | flimitmodelflag | number(38, 0) |
| 13 | materialinnercode | materialinnercode | materialinnercode | varchar2(230) |
| 14 | ngarbexenum | ngarbexenum | ngarbexenum | number(28, 8) |
| 15 | ngarblimitnum | ngarblimitnum | ngarblimitnum | number(28, 8) |
| 16 | nprice | nprice | nprice | number(28, 8) |
| 17 | npriceadd | npriceadd | npriceadd | number(28, 8) |
| 18 | npricefactor | npricefactor | npricefactor | number(28, 8) |
| 19 | nsinglelimitnum | nsinglelimitnum | nsinglelimitnum | number(28, 8) |
| 20 | pk_adjpromote | pk_adjpromote | pk_adjpromote | varchar2(20) |
| 21 | pk_adjpromote_b | pk_adjpromote_b | pk_adjpromote_b | varchar2(20) |
| 22 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 23 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 24 | pk_brand | pk_brand | pk_brand | varchar2(20) |  |  | '~' |
| 25 | pk_channeltype | pk_channeltype | pk_channeltype | varchar2(20) |  |  | '~' |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_custclass | pk_custclass | pk_custclass | varchar2(20) |  |  | '~' |
| 28 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 29 | pk_custsaleclass | pk_custsaleclass | pk_custsaleclass | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 31 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 32 | pk_marsaleclass | pk_marsaleclass | pk_marsaleclass | varchar2(20) |  |  | '~' |
| 33 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 35 | pk_pricetype | pk_pricetype | pk_pricetype | varchar2(20) |  |  | '~' |
| 36 | pk_prodline | pk_prodline | pk_prodline | varchar2(20) |  |  | '~' |
| 37 | pk_qualitylevel | pk_qualitylevel | pk_qualitylevel | varchar2(20) |  |  | '~' |
| 38 | pk_sendtype | pk_sendtype | pk_sendtype | varchar2(20) |  |  | '~' |
| 39 | pk_tariffdef | pk_tariffdef | pk_tariffdef | varchar2(20) |  |  | '~' |
| 40 | pk_unit | pk_unit | pk_unit | varchar2(20) |  |  | '~' |
| 41 | tbegintime | tbegintime | tbegintime | varchar2(19) |
| 42 | tclosedtime | tclosedtime | tclosedtime | varchar2(19) |
| 43 | tendtime | tendtime | tendtime | varchar2(19) |
| 44 | vnote | vnote | vnote | varchar2(181) |
| 45 | vsaleorgtype | vsaleorgtype | vsaleorgtype | varchar2(20) |  |  | '~' |
| 46 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 47 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 48 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 49 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 50 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 51 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 52 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 53 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 54 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 55 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |