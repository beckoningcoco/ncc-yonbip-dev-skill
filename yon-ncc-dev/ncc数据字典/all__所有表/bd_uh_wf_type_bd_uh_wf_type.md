# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wftype | pk_wftype | pk_wftype | char(20) | √ |
| 2 | dt_depttype | dt_depttype | dt_depttype | varchar2(50) |
| 3 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 4 | flag_sys | flag_sys | flag_sys | char(1) |
| 5 | pk_depttype | pk_depttype | pk_depttype | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 9 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(50) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |