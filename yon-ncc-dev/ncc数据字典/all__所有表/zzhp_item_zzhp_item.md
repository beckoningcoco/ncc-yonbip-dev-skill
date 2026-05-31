# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpitem | pk_hpitem | pk_hpitem | char(20) | √ |
| 2 | apprcode | apprcode | apprcode | varchar2(30) |
| 3 | bgrq | bgrq | bgrq | varchar2(50) |
| 4 | bzyxbz | bzyxbz | bzyxbz | varchar2(5) |
| 5 | code | code | code | varchar2(30) |
| 6 | code_hp | code_hp | code_hp | varchar2(50) |
| 7 | code_org | code_org | code_org | varchar2(30) |
| 8 | date_begin | date_begin | date_begin | char(19) |
| 9 | date_end | date_end | date_end | char(19) |
| 10 | date_op | date_op | date_op | char(19) |
| 11 | days | days | days | number(38, 0) |
| 12 | dh | dh | dh | varchar2(50) |
| 13 | diseasetype | diseasetype | diseasetype | varchar2(30) |
| 14 | diseasetype_spec | diseasetype_spec | diseasetype_spec | varchar2(30) |
| 15 | dosage | dosage | dosage | number(14, 2) |
| 16 | dosageform | dosageform | dosageform | varchar2(50) |
| 17 | drugtype | drugtype | drugtype | varchar2(30) |
| 18 | ename | ename | ename | varchar2(50) |
| 19 | eu_bedlevel | eu_bedlevel | eu_bedlevel | number(38, 0) |
| 20 | eu_hptype | eu_hptype | eu_hptype | varchar2(20) |  |  | '~' |
| 21 | eu_itemlevel | eu_itemlevel | eu_itemlevel | number(38, 0) |
| 22 | eu_itemtype | eu_itemtype | eu_itemtype | number(38, 0) |
| 23 | factory | factory | factory | varchar2(50) |
| 24 | flag_active | flag_active | flag_active | char(1) |
| 25 | flag_chk | flag_chk | flag_chk | char(1) |
| 26 | flag_recp | flag_recp | flag_recp | char(1) |
| 27 | flag_refund | flag_refund | flag_refund | char(1) |
| 28 | flag_self | flag_self | flag_self | char(1) |
| 29 | freq | freq | freq | varchar2(30) |
| 30 | hp_hpcate | hp_hpcate | hp_hpcate | varchar2(10) |
| 31 | hp_itemcate | hp_itemcate | hp_itemcate | varchar2(10) |
| 32 | itemcate | itemcate | itemcate | varchar2(30) |
| 33 | level_org | level_org | level_org | varchar2(50) |
| 34 | mnecode | mnecode | mnecode | varchar2(30) |
| 35 | mnecode_pd | mnecode_pd | mnecode_pd | varchar2(30) |
| 36 | name | name | name | varchar2(50) |
| 37 | name_hpcate | name_hpcate | name_hpcate | varchar2(10) |
| 38 | name_pd | name_pd | name_pd | varchar2(50) |
| 39 | note | note | note | varchar2(256) |
| 40 | operator | operator | operator | varchar2(50) |
| 41 | orgcode | orgcode | orgcode | varchar2(30) |
| 42 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 43 | pk_hp | pk_hp | pk_hp | varchar2(5) |
| 44 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 45 | price | price | price | number(14, 8) |
| 46 | price_city | price_city | price_city | number(14, 8) |
| 47 | price_county | price_county | price_county | number(14, 8) |
| 48 | price_ey | price_ey | price_ey | number(14, 8) |
| 49 | price_pd | price_pd | price_pd | number(14, 8) |
| 50 | price_rt | price_rt | price_rt | number(14, 8) |
| 51 | price_town | price_town | price_town | number(14, 8) |
| 52 | ratio_be | ratio_be | ratio_be | number(14, 2) |
| 53 | ratio_ey | ratio_ey | ratio_ey | number(14, 2) |
| 54 | ratio_ip | ratio_ip | ratio_ip | number(14, 2) |
| 55 | ratio_oi | ratio_oi | ratio_oi | number(14, 2) |
| 56 | ratio_op | ratio_op | ratio_op | number(14, 2) |
| 57 | ratio_rd | ratio_rd | ratio_rd | number(14, 2) |
| 58 | ratio_rt | ratio_rt | ratio_rt | number(14, 2) |
| 59 | sortno | sortno | sortno | number(38, 0) |
| 60 | spec | spec | spec | varchar2(4000) |
| 61 | std_pay | std_pay | std_pay | number(14, 2) |
| 62 | strcode | strcode | strcode | varchar2(30) |
| 63 | strcode_pd | strcode_pd | strcode_pd | varchar2(30) |
| 64 | unit | unit | unit | varchar2(4000) |
| 65 | unit_med | unit_med | unit_med | varchar2(4000) |
| 66 | useage | useage | useage | varchar2(30) |
| 67 | ybxj | ybxj | ybxj | number(38, 0) |
| 68 | ysjb | ysjb | ysjb | varchar2(3) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |