# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12753.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvmdp | pk_pvmdp | pk_pvmdp | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | flag_canc | flag_canc | flag_canc | char(1) |
| 5 | flag_fin | flag_fin | flag_fin | char(1) |
| 6 | name_psn_begin | name_psn_begin | name_psn_begin | varchar2(50) |
| 7 | name_psn_end | name_psn_end | name_psn_end | varchar2(50) |
| 8 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 9 | pk_dept_mdp | pk_dept_mdp | pk_dept_mdp | varchar2(20) |  |  | '~' |
| 10 | pk_dept_mns | pk_dept_mns | pk_dept_mns | varchar2(20) |  |  | '~' |
| 11 | pk_dept_ns | pk_dept_ns | pk_dept_ns | varchar2(20) |  |  | '~' |
| 12 | pk_psn_begin | pk_psn_begin | pk_psn_begin | varchar2(20) |  |  | '~' |
| 13 | pk_psn_end | pk_psn_end | pk_psn_end | varchar2(20) |  |  | '~' |
| 14 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |