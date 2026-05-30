# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invisspk | pk_invisspk | pk_invisspk | char(20) | √ |
| 2 | computer_use | computer_use | computer_use | varchar2(30) |
| 3 | date_iss | date_iss | date_iss | char(19) |
| 4 | eu_invisstype | eu_invisstype | eu_invisstype | number(38, 0) |
| 5 | eu_invmana | eu_invmana | eu_invmana | number(38, 0) |
| 6 | flag_active | flag_active | flag_active | char(1) |
| 7 | flag_curuse | flag_curuse | flag_curuse | char(1) |
| 8 | invbox_no | invbox_no | invbox_no | varchar2(50) |
| 9 | invch_iss_use | invch_iss_use | invch_iss_use | number(38, 0) |
| 10 | invcn_canc | invcn_canc | invcn_canc | number(38, 0) |
| 11 | invcn_iss | invcn_iss | invcn_iss | number(38, 0) |
| 12 | invcn_ret | invcn_ret | invcn_ret | number(38, 0) |
| 13 | invcn_trans | invcn_trans | invcn_trans | number(38, 0) |
| 14 | invcn_wf | invcn_wf | invcn_wf | number(38, 0) |
| 15 | invno_begin | invno_begin | invno_begin | varchar2(50) |  |  | '~' |
| 16 | invno_cur | invno_cur | invno_cur | varchar2(50) |
| 17 | invno_end | invno_end | invno_end | varchar2(256) |
| 18 | invno_prefix | invno_prefix | invno_prefix | varchar2(50) |
| 19 | note | note | note | varchar2(256) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 22 | pk_invissdt | pk_invissdt | pk_invissdt | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_psn_inv | pk_psn_inv | pk_psn_inv | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |