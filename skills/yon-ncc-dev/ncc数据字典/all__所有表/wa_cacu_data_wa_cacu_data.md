# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cacu_data | pk_cacu_data | pk_cacu_data | char(20) | √ |
| 2 | addtype | addtype | addtype | char(1) |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | cacu_value | cacu_value | cacu_value | number(31, 8) |  |  | 0 |
| 5 | char_value | char_value | char_value | varchar2(256) |
| 6 | curmonthwage | curmonthwage | curmonthwage | number(31, 8) |  |  | 0 |
| 7 | currencyrate | currencyrate | currencyrate | number(31, 8) |
| 8 | deductionrate | deductionrate | deductionrate | number(31, 8) |
| 9 | derateptg | derateptg | derateptg | number(31, 8) |  |  | 0 |
| 10 | enddate | enddate | enddate | char(10) |
| 11 | expense_deduction | expense_deduction | expense_deduction | number(31, 8) |
| 12 | fstmonwagedays | fstmonwagedays | fstmonwagedays | number(38, 0) |
| 13 | fstmonwagedays4ta | fstmonwagedays4ta | fstmonwagedays4ta | number(38, 0) |
| 14 | iscacu | iscacu | iscacu | char(1) | √ |  | 'N' |
| 15 | iscacu4psnchg | iscacu4psnchg | iscacu4psnchg | char(1) |  |  | 'N' |
| 16 | isderate | isderate | isderate | char(1) |
| 17 | isndebuct | isndebuct | isndebuct | char(1) |
| 18 | lstmonwagedays | lstmonwagedays | lstmonwagedays | number(38, 0) |
| 19 | lstmonwagedays4ta | lstmonwagedays4ta | lstmonwagedays4ta | number(38, 0) |
| 20 | nquickdebuct | nquickdebuct | nquickdebuct | number(31, 8) |
| 21 | periodtimes | periodtimes | periodtimes | number(31, 8) |  |  | 12 |
| 22 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |
| 23 | pk_ta_org | pk_ta_org | pk_ta_org | char(20) |
| 24 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 25 | pk_wa_data | pk_wa_data | pk_wa_data | varchar2(20) | √ |
| 26 | preadjustdate | preadjustdate | preadjustdate | char(10) |
| 27 | psnage | psnage | psnage | number(38, 0) | √ |  | 0 |
| 28 | redata | redata | redata | number(31, 8) |
| 29 | redatalasttax | redatalasttax | redatalasttax | number(31, 8) |
| 30 | redatalasttaxbase | redatalasttaxbase | redatalasttaxbase | number(31, 8) |
| 31 | redatamode | redatamode | redatamode | number(38, 0) |
| 32 | retaxed | retaxed | retaxed | number(31, 8) |
| 33 | taperiod | taperiod | taperiod | char(2) |
| 34 | taxable_income | taxable_income | taxable_income | number(31, 8) |
| 35 | taxed | taxed | taxed | number(31, 8) |
| 36 | taxedbase | taxedbase | taxedbase | number(31, 8) |
| 37 | taxrate | taxrate | taxrate | number(31, 8) |
| 38 | taxtableid | taxtableid | taxtableid | varchar2(20) |
| 39 | taxtype | taxtype | taxtype | char(1) |
| 40 | tax_base | tax_base | tax_base | number(31, 8) |
| 41 | tayear | tayear | tayear | char(4) |
| 42 | unitage | unitage | unitage | number(38, 0) | √ |  | 0 |
| 43 | wagedays | wagedays | wagedays | number(38, 0) |  |  | 0 |
| 44 | workage | workage | workage | number(38, 0) | √ |  | 0 |
| 45 | workorg | workorg | workorg | char(20) |
| 46 | creator | creator | creator | varchar2(20) |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |