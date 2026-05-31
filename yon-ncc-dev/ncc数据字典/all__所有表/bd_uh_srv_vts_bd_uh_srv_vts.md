# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvvts | pk_srvvts | pk_srvvts | char(20) | √ |
| 2 | dt_vtscoll | dt_vtscoll | dt_vtscoll | varchar2(20) |
| 3 | dt_vtstype | dt_vtstype | dt_vtstype | varchar2(20) |
| 4 | flag_ext | flag_ext | flag_ext | char(1) |
| 5 | lab1_ext | lab1_ext | lab1_ext | varchar2(50) |
| 6 | lab_ext | lab_ext | lab_ext | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_srv | pk_srv | pk_srv | char(20) |
| 11 | pk_vtscoll | pk_vtscoll | pk_vtscoll | varchar2(20) |  |  | '~' |
| 12 | pk_vtstype | pk_vtstype | pk_vtstype | varchar2(20) |  |  | '~' |
| 13 | std_hi | std_hi | std_hi | number(28, 8) |
| 14 | std_lo | std_lo | std_lo | number(28, 8) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |