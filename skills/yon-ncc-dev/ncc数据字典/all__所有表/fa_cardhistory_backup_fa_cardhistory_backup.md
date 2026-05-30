# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardhistory | pk_cardhistory | pk_cardhistory | char(20) | √ |
| 2 | accudep | accudep | accudep | number(28, 8) |
| 3 | accudep_cal | accudep_cal | accudep_cal | number(28, 8) |
| 4 | accudep_global | accudep_global | accudep_global | number(28, 8) |
| 5 | accudep_group | accudep_group | accudep_group | number(28, 8) |
| 6 | accuworkloan | accuworkloan | accuworkloan | number(28, 8) |
| 7 | accu_interest | accu_interest | accu_interest | number(28, 8) |
| 8 | accyear | accyear | accyear | varchar2(4) |
| 9 | allworkloan | allworkloan | allworkloan | number(28, 8) |
| 10 | asset_state | asset_state | asset_state | varchar2(20) |
| 11 | begin_period | begin_period | begin_period | char(19) |
| 12 | business_flag | business_flag | business_flag | char(1) |
| 13 | business_period | business_period | business_period | char(19) |
| 14 | card_num | card_num | card_num | number(38, 0) |
| 15 | curryeardep | curryeardep | curryeardep | number(28, 8) |
| 16 | curryeardep_global | curryeardep_global | curryeardep_global | number(28, 8) |
| 17 | curryeardep_group | curryeardep_group | curryeardep_group | number(28, 8) |
| 18 | depamount | depamount | depamount | number(28, 8) |
| 19 | depamount_global | depamount_global | depamount_global | number(28, 8) |
| 20 | depamount_group | depamount_group | depamount_group | number(28, 8) |
| 21 | deprate | deprate | deprate | number(28, 13) |
| 22 | depunit | depunit | depunit | number(28, 8) |
| 23 | depunit_global | depunit_global | depunit_global | number(28, 8) |
| 24 | depunit_group | depunit_group | depunit_group | number(28, 8) |
| 25 | dep_end_date | dep_end_date | dep_end_date | char(19) |
| 26 | dep_start_date | dep_start_date | dep_start_date | char(19) |
| 27 | expect_localliabilities | expect_localliabilities | expect_localliabilities | number(28, 8) |
| 28 | herit_flag | herit_flag | herit_flag | char(1) |
| 29 | isdepfornewcard | isdepfornewcard | isdepfornewcard | char(1) |
| 30 | laststate_flag | laststate_flag | laststate_flag | char(1) |
| 31 | localcurr_rate | localcurr_rate | localcurr_rate | number(28, 8) |
| 32 | localoriginvalue | localoriginvalue | localoriginvalue | number(28, 8) |
| 33 | localoriginvalue_global | localoriginvalue_global | localoriginvalue_global | number(28, 8) |
| 34 | localoriginvalue_group | localoriginvalue_group | localoriginvalue_group | number(28, 8) |
| 35 | localorigin_count | localorigin_count | localorigin_count | number(28, 8) |
| 36 | local_rent_before | local_rent_before | local_rent_before | number(28, 8) |
| 37 | local_total_interest | local_total_interest | local_total_interest | number(28, 8) |
| 38 | monthworkloan | monthworkloan | monthworkloan | number(28, 8) |
| 39 | naturemonth | naturemonth | naturemonth | number(38, 0) |
| 40 | newasset_flag | newasset_flag | newasset_flag | number(38, 0) |
| 41 | originvalue | originvalue | originvalue | number(28, 8) |
| 42 | originvalue_cal | originvalue_cal | originvalue_cal | number(28, 8) |
| 43 | paydept_flag | paydept_flag | paydept_flag | varchar2(40) |
| 44 | period | period | period | varchar2(2) |
| 45 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 46 | pk_account_subject | pk_account_subject | pk_account_subject | varchar2(20) |  |  | '~' |
| 47 | pk_card | pk_card | pk_card | char(20) | √ |
| 48 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 49 | pk_category_old | pk_category_old | pk_category_old | varchar2(20) |
| 50 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |
| 51 | pk_costcenter_old | pk_costcenter_old | pk_costcenter_old | varchar2(20) |
| 52 | pk_depmethod | pk_depmethod | pk_depmethod | varchar2(20) |  |  | '~' |
| 53 | pk_depmethod_old | pk_depmethod_old | pk_depmethod_old | varchar2(20) |
| 54 | pk_equiporg | pk_equiporg | pk_equiporg | varchar2(20) |  |  | '~' |
| 55 | pk_equiporg_v | pk_equiporg_v | pk_equiporg_v | varchar2(20) |  |  | '~' |
| 56 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 57 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 58 | pk_jobmngfil_old | pk_jobmngfil_old | pk_jobmngfil_old | varchar2(20) |
| 59 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 60 | pk_mandept_old | pk_mandept_old | pk_mandept_old | varchar2(20) |
| 61 | pk_mandept_v | pk_mandept_v | pk_mandept_v | varchar2(20) |  |  | '~' |
| 62 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 63 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 64 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |
| 65 | pk_ownerorg_v | pk_ownerorg_v | pk_ownerorg_v | varchar2(20) |
| 66 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 67 | pk_usedept_old | pk_usedept_old | pk_usedept_old | varchar2(20) |
| 68 | pk_usingstatus | pk_usingstatus | pk_usingstatus | varchar2(20) |  |  | '~' |
| 69 | pk_usingstatus_old | pk_usingstatus_old | pk_usingstatus_old | varchar2(20) |
| 70 | predevaluate | predevaluate | predevaluate | number(28, 8) |
| 71 | predevaluate_global | predevaluate_global | predevaluate_global | number(28, 8) |
| 72 | predevaluate_group | predevaluate_group | predevaluate_group | number(28, 8) |
| 73 | salvage | salvage | salvage | number(28, 8) |
| 74 | salvagerate | salvagerate | salvagerate | number(28, 8) |
| 75 | salvage_global | salvage_global | salvage_global | number(28, 8) |
| 76 | salvage_group | salvage_group | salvage_group | number(28, 8) |
| 77 | servicemonth | servicemonth | servicemonth | number(38, 0) |
| 78 | servicemonth_cal | servicemonth_cal | servicemonth_cal | number(38, 0) |
| 79 | taxinput_flag | taxinput_flag | taxinput_flag | char(1) |
| 80 | tax_input | tax_input | tax_input | number(28, 8) |
| 81 | tax_input_global | tax_input_global | tax_input_global | number(28, 8) |
| 82 | tax_input_group | tax_input_group | tax_input_group | number(28, 8) |
| 83 | totalrent_localorigina | totalrent_localorigina | totalrent_localorigina | number(28, 8) |
| 84 | total_localtax | total_localtax | total_localtax | number(28, 8) |
| 85 | usedept_display | usedept_display | usedept_display | varchar2(400) |
| 86 | usedept_display2 | usedept_display2 | usedept_display2 | varchar2(400) |
| 87 | usedept_display3 | usedept_display3 | usedept_display3 | varchar2(400) |
| 88 | usedept_display4 | usedept_display4 | usedept_display4 | varchar2(400) |
| 89 | usedept_display5 | usedept_display5 | usedept_display5 | varchar2(400) |
| 90 | usedept_display6 | usedept_display6 | usedept_display6 | varchar2(400) |
| 91 | usedep_flag | usedep_flag | usedep_flag | char(1) |
| 92 | usedmonth | usedmonth | usedmonth | number(38, 0) |
| 93 | usedmonth_cal | usedmonth_cal | usedmonth_cal | number(38, 0) |
| 94 | workloanunit | workloanunit | workloanunit | varchar2(80) |
| 95 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 96 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |