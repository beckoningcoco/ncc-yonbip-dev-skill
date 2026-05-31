# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv_er | pk_pv_er | pk_pv_er | char(20) | √ |
| 2 | date_morbidity | date_morbidity | date_morbidity | char(19) |
| 3 | date_valid_begin | date_valid_begin | date_valid_begin | char(19) |
| 4 | date_valid_end | date_valid_end | date_valid_end | char(19) |
| 5 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 6 | flag_first | flag_first | flag_first | char(1) |
| 7 | flag_st | flag_st | flag_st | char(1) |
| 8 | name_dateslot | name_dateslot | name_dateslot | varchar2(50) |
| 9 | name_patriarch | name_patriarch | name_patriarch | varchar2(50) |
| 10 | name_psn_regist | name_psn_regist | name_psn_regist | varchar2(50) |
| 11 | name_srv | name_srv | name_srv | varchar2(50) |
| 12 | pk_cg | pk_cg | pk_cg | varchar2(50) |
| 13 | pk_dateslot | pk_dateslot | pk_dateslot | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_pati | pk_pati | pk_pati | varchar2(50) |  |  | '~' |
| 17 | pk_psn_regist | pk_psn_regist | pk_psn_regist | varchar2(20) |  |  | '~' |
| 18 | pk_pv | pk_pv | pk_pv | varchar2(50) |
| 19 | pk_pvopappt | pk_pvopappt | pk_pvopappt | varchar2(50) |
| 20 | pk_res | pk_res | pk_res | varchar2(20) |  |  | '~' |
| 21 | pk_sch | pk_sch | pk_sch | varchar2(20) |  |  | '~' |
| 22 | pk_schsrv | pk_schsrv | pk_schsrv | varchar2(50) |
| 23 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |  |  | '~' |
| 24 | pk_st | pk_st | pk_st | varchar2(50) |
| 25 | ticketno | ticketno | ticketno | number(38, 0) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |