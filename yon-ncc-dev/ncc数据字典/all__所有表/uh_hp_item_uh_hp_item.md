# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12631.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpitem | pk_hpitem | pk_hpitem | char(20) | √ |
| 2 | apprcode | apprcode | apprcode | varchar2(30) |
| 3 | code | code | code | varchar2(30) |
| 4 | code_org | code_org | code_org | varchar2(30) |
| 5 | date_begin | date_begin | date_begin | char(19) |
| 6 | date_end | date_end | date_end | char(19) |
| 7 | date_op | date_op | date_op | char(19) |
| 8 | days | days | days | number(38, 0) |
| 9 | diseasetype | diseasetype | diseasetype | varchar2(30) |
| 10 | diseasetype_spec | diseasetype_spec | diseasetype_spec | varchar2(30) |
| 11 | dosage | dosage | dosage | number(14, 2) |
| 12 | dosageform | dosageform | dosageform | varchar2(50) |
| 13 | drugtype | drugtype | drugtype | varchar2(30) |
| 14 | ename | ename | ename | varchar2(50) |
| 15 | eu_bedlevel | eu_bedlevel | eu_bedlevel | number(38, 0) |
| 16 | eu_hptype | eu_hptype | eu_hptype | varchar2(20) |  |  | '~' |
| 17 | eu_itemlevel | eu_itemlevel | eu_itemlevel | number(38, 0) |
| 18 | eu_itemtype | eu_itemtype | eu_itemtype | varchar2(50) |
| 19 | factory | factory | factory | varchar2(50) |
| 20 | flag_active | flag_active | flag_active | char(1) |
| 21 | flag_chk | flag_chk | flag_chk | char(1) |
| 22 | flag_recp | flag_recp | flag_recp | char(1) |
| 23 | flag_refund | flag_refund | flag_refund | char(1) |
| 24 | flag_self | flag_self | flag_self | char(1) |
| 25 | freq | freq | freq | varchar2(30) |
| 26 | itemcate | itemcate | itemcate | varchar2(30) |
| 27 | junxiu_ip | junxiu_ip | junxiu_ip | number(14, 2) |
| 28 | junxiu_op | junxiu_op | junxiu_op | number(14, 2) |
| 29 | junxiu_price | junxiu_price | junxiu_price | number(28, 8) |
| 30 | level_org | level_org | level_org | varchar2(50) |
| 31 | mnecode | mnecode | mnecode | varchar2(30) |
| 32 | mnecode_pd | mnecode_pd | mnecode_pd | varchar2(30) |
| 33 | name | name | name | varchar2(50) |
| 34 | name_pd | name_pd | name_pd | varchar2(50) |
| 35 | note | note | note | varchar2(256) |
| 36 | operator | operator | operator | varchar2(50) |
| 37 | orgcode | orgcode | orgcode | varchar2(30) |
| 38 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | price | price | price | number(14, 8) |
| 41 | price_city | price_city | price_city | number(14, 8) |
| 42 | price_county | price_county | price_county | number(14, 8) |
| 43 | price_ey | price_ey | price_ey | number(14, 8) |
| 44 | price_pd | price_pd | price_pd | number(14, 8) |
| 45 | price_rt | price_rt | price_rt | number(14, 8) |
| 46 | price_town | price_town | price_town | number(14, 8) |
| 47 | ratio_be | ratio_be | ratio_be | number(14, 2) |
| 48 | ratio_ey | ratio_ey | ratio_ey | number(14, 2) |
| 49 | ratio_ip | ratio_ip | ratio_ip | number(14, 2) |
| 50 | ratio_oi | ratio_oi | ratio_oi | number(14, 2) |
| 51 | ratio_op | ratio_op | ratio_op | number(14, 2) |
| 52 | ratio_rd | ratio_rd | ratio_rd | number(14, 2) |
| 53 | ratio_rt | ratio_rt | ratio_rt | number(14, 2) |
| 54 | sortno | sortno | sortno | number(38, 0) |
| 55 | spec | spec | spec | varchar2(4000) |
| 56 | std_pay | std_pay | std_pay | number(14, 2) |
| 57 | strcode | strcode | strcode | varchar2(30) |
| 58 | strcode_pd | strcode_pd | strcode_pd | varchar2(30) |
| 59 | unit | unit | unit | varchar2(4000) |
| 60 | unit_med | unit_med | unit_med | varchar2(4000) |
| 61 | useage | useage | useage | varchar2(30) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |