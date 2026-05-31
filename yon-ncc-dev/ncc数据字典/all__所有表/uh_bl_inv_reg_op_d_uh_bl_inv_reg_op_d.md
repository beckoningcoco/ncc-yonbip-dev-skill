# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invopd | pk_invopd | pk_invopd | char(20) | √ |
| 2 | invcn | invcn | invcn | number(38, 0) |
| 3 | note | note | note | varchar2(256) |
| 4 | num_begin | num_begin | num_begin | varchar2(30) |
| 5 | num_end | num_end | num_end | varchar2(30) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 8 | pk_invregop | pk_invregop | pk_invregop | char(20) | √ |
| 9 | pk_invregpk | pk_invregpk | pk_invregpk | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_psn_inv | pk_psn_inv | pk_psn_inv | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |