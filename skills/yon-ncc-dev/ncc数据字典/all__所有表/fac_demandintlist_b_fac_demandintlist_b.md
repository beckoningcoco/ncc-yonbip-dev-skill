# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8065.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intlist_b | pk_intlist_b | pk_intlist_b | char(20) | √ |
| 2 | aggregate | aggregate | aggregate | number(28, 8) |
| 3 | baseaggregate | baseaggregate | baseaggregate | number(28, 8) |
| 4 | baseint | baseint | baseint | number(28, 8) |
| 5 | begdate | begdate | begdate | char(19) |
| 6 | days | days | days | number(38, 0) |
| 7 | depositint | depositint | depositint | number(28, 8) |
| 8 | drate | drate | drate | number(28, 8) |
| 9 | enddate | enddate | enddate | char(19) |
| 10 | floatingpercent | floatingpercent | floatingpercent | number(28, 8) |
| 11 | glcbaseint | glcbaseint | glcbaseint | number(28, 8) |
| 12 | glcdepositint | glcdepositint | glcdepositint | number(28, 8) |
| 13 | glcoverdraftint | glcoverdraftint | glcoverdraftint | number(28, 8) |
| 14 | glcoverdueint | glcoverdueint | glcoverdueint | number(28, 8) |
| 15 | glcpreint | glcpreint | glcpreint | number(28, 8) |
| 16 | glcquotaint | glcquotaint | glcquotaint | number(28, 8) |
| 17 | glcrate | glcrate | glcrate | number(15, 8) |
| 18 | gllcbaseint | gllcbaseint | gllcbaseint | number(28, 8) |
| 19 | gllcdepositint | gllcdepositint | gllcdepositint | number(28, 8) |
| 20 | gllcoverdraftint | gllcoverdraftint | gllcoverdraftint | number(28, 8) |
| 21 | gllcoverdueint | gllcoverdueint | gllcoverdueint | number(28, 8) |
| 22 | gllcpreint | gllcpreint | gllcpreint | number(28, 8) |
| 23 | gllcquotaint | gllcquotaint | gllcquotaint | number(28, 8) |
| 24 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 25 | intlist_b | intlist_b | intlist_b | char(20) | √ |
| 26 | intmode | intmode | intmode | varchar2(50) |
| 27 | intobjversion | intobjversion | intobjversion | varchar2(50) |
| 28 | mrate | mrate | mrate | number(28, 8) |
| 29 | olcbaseint | olcbaseint | olcbaseint | number(28, 8) |
| 30 | olcdepositint | olcdepositint | olcdepositint | number(28, 8) |
| 31 | olcoverdraftint | olcoverdraftint | olcoverdraftint | number(28, 8) |
| 32 | olcoverdueint | olcoverdueint | olcoverdueint | number(28, 8) |
| 33 | olcpreint | olcpreint | olcpreint | number(28, 8) |
| 34 | olcquotaint | olcquotaint | olcquotaint | number(28, 8) |
| 35 | olcrate | olcrate | olcrate | number(15, 8) |
| 36 | overdraftaggregate | overdraftaggregate | overdraftaggregate | number(28, 8) |
| 37 | overdraftdays | overdraftdays | overdraftdays | varchar2(50) |
| 38 | overdraftint | overdraftint | overdraftint | number(28, 8) |
| 39 | overdraftlateaggregate | overdraftlateaggregate | overdraftlateaggregate | number(28, 8) |
| 40 | overdraftlateperiod | overdraftlateperiod | overdraftlateperiod | varchar2(50) |
| 41 | overdraftlimitamount | overdraftlimitamount | overdraftlimitamount | number(28, 8) |
| 42 | overdueint | overdueint | overdueint | number(28, 8) |
| 43 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 44 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 45 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 46 | pk_rateversion | pk_rateversion | pk_rateversion | varchar2(20) |  |  | '~' |
| 47 | preaggregate | preaggregate | preaggregate | number(28, 8) |
| 48 | preint | preint | preint | number(28, 8) |
| 49 | quotaaggregate | quotaaggregate | quotaaggregate | number(28, 8) |
| 50 | quotaint | quotaint | quotaint | number(28, 8) |
| 51 | quotarange | quotarange | quotarange | varchar2(50) |
| 52 | summary | summary | summary | number(38, 0) |
| 53 | yrate | yrate | yrate | number(28, 8) |
| 54 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 55 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 56 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 57 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 58 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 59 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 60 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 61 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 62 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 63 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |