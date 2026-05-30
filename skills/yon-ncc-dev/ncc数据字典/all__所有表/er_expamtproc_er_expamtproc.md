# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expamtproc | pk_expamtproc | pk_expamtproc | char(20) | √ |
| 2 | accperiod | accperiod | accperiod | varchar2(50) |
| 3 | accu_amount | accu_amount | accu_amount | number(28, 8) |
| 4 | accu_globalamount | accu_globalamount | accu_globalamount | number(28, 8) |
| 5 | accu_groupamount | accu_groupamount | accu_groupamount | number(28, 8) |
| 6 | accu_orgamount | accu_orgamount | accu_orgamount | number(28, 8) |
| 7 | accu_period | accu_period | accu_period | number(38, 0) |
| 8 | accu_taxlessamount | accu_taxlessamount | accu_taxlessamount | number(28, 8) |
| 9 | amortize_date | amortize_date | amortize_date | char(19) |
| 10 | amortize_user | amortize_user | amortize_user | varchar2(20) |  |  | '~' |
| 11 | bbhl | bbhl | bbhl | number(15, 8) |
| 12 | bbje | bbje | bbje | number(28, 8) |
| 13 | bzbm | bzbm | bzbm | varchar2(20) |
| 14 | curr_amount | curr_amount | curr_amount | number(28, 8) |
| 15 | curr_globalamount | curr_globalamount | curr_globalamount | number(28, 8) |
| 16 | curr_groupamount | curr_groupamount | curr_groupamount | number(28, 8) |
| 17 | curr_orgamount | curr_orgamount | curr_orgamount | number(28, 8) |
| 18 | curr_taxlessamount | curr_taxlessamount | curr_taxlessamount | number(28, 8) |
| 19 | end_period | end_period | end_period | varchar2(50) |
| 20 | globalbbhl | globalbbhl | globalbbhl | number(15, 8) |
| 21 | globalbbje | globalbbje | globalbbje | number(28, 8) |
| 22 | groupbbhl | groupbbhl | groupbbhl | number(15, 8) |
| 23 | groupbbje | groupbbje | groupbbje | number(28, 8) |
| 24 | pk_expamtinfo | pk_expamtinfo | pk_expamtinfo | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | res_amount | res_amount | res_amount | number(28, 8) |
| 28 | res_globalamount | res_globalamount | res_globalamount | number(28, 8) |
| 29 | res_groupamount | res_groupamount | res_groupamount | number(28, 8) |
| 30 | res_orgamount | res_orgamount | res_orgamount | number(28, 8) |
| 31 | res_period | res_period | res_period | number(38, 0) |
| 32 | res_taxlessamount | res_taxlessamount | res_taxlessamount | number(28, 8) |
| 33 | start_period | start_period | start_period | varchar2(50) |
| 34 | total_amount | total_amount | total_amount | number(28, 8) |
| 35 | total_period | total_period | total_period | number(38, 0) |
| 36 | total_taxlessamount | total_taxlessamount | total_taxlessamount | number(28, 8) |
| 37 | creationtime | creationtime | creationtime | char(19) |
| 38 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 39 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 40 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 41 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |