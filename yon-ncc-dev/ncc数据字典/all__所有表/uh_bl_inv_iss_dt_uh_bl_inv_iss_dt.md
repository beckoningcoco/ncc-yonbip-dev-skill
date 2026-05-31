# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12396.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissdt | pk_invissdt | pk_invissdt | char(20) | √ |
| 2 | date_iss | date_iss | date_iss | char(19) |
| 3 | invcn | invcn | invcn | number(38, 0) |
| 4 | note | note | note | varchar2(50) |
| 5 | num_begin | num_begin | num_begin | varchar2(50) |
| 6 | num_end | num_end | num_end | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 9 | pk_inviss | pk_inviss | pk_inviss | varchar2(20) |  |  | '~' |
| 10 | pk_invissd_trans | pk_invissd_trans | pk_invissd_trans | varchar2(20) |
| 11 | pk_invregpk | pk_invregpk | pk_invregpk | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_psn_iss | pk_psn_iss | pk_psn_iss | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |