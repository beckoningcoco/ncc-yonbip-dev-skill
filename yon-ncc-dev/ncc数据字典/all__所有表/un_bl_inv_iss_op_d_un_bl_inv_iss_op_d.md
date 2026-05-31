# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12824.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissd | pk_invissd | pk_invissd | char(20) | √ |
| 2 | date_iss | date_iss | date_iss | char(19) |
| 3 | date_op | date_op | date_op | char(19) |
| 4 | flag_wf | flag_wf | flag_wf | char(1) |
| 5 | invcn | invcn | invcn | number(38, 0) |
| 6 | note | note | note | varchar2(50) |
| 7 | num_begin | num_begin | num_begin | varchar2(50) |
| 8 | num_end | num_end | num_end | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 11 | pk_invissop | pk_invissop | pk_invissop | varchar2(20) |  |  | '~' |
| 12 | pk_invisspk | pk_invisspk | pk_invisspk | varchar2(20) |  |  | '~' |
| 13 | pk_invwriteoffiss | pk_invwriteoffiss | pk_invwriteoffiss | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_psn_inv | pk_psn_inv | pk_psn_inv | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |