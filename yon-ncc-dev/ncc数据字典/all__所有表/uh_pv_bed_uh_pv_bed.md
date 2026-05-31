# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12735.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvbed | pk_pvbed | pk_pvbed | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | flag_maj | flag_maj | flag_maj | char(2) |
| 5 | name_psn_begin | name_psn_begin | name_psn_begin | varchar2(50) |
| 6 | name_psn_end | name_psn_end | name_psn_end | varchar2(50) |
| 7 | pk_bed | pk_bed | pk_bed | varchar2(20) |  |  | '~' |
| 8 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_psn_begin | pk_psn_begin | pk_psn_begin | varchar2(20) |  |  | '~' |
| 12 | pk_psn_end | pk_psn_end | pk_psn_end | varchar2(20) |  |  | '~' |
| 13 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 14 | pk_pvdept | pk_pvdept | pk_pvdept | varchar2(20) |  |  | '~' |
| 15 | def1 | def1 | def1 | varchar2(50) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |