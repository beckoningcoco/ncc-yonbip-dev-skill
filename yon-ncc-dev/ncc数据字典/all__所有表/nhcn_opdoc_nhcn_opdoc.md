# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opdoc | pk_opdoc | pk_opdoc | char(20) | √ |
| 2 | dt_anti | dt_anti | dt_anti | varchar2(50) |
| 3 | dt_pharm | dt_pharm | dt_pharm | varchar2(50) |
| 4 | dt_pois | dt_pois | dt_pois | varchar2(50) |
| 5 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 6 | flag_set | flag_set | flag_set | char(1) |
| 7 | pk_anti | pk_anti | pk_anti | varchar2(50) |  |  | '~' |
| 8 | pk_freq_def | pk_freq_def | pk_freq_def | varchar2(20) |  |  | '~' |
| 9 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 10 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 11 | pk_measdocsell | pk_measdocsell | pk_measdocsell | varchar2(20) |  |  | '~' |
| 12 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 13 | pk_pharm | pk_pharm | pk_pharm | varchar2(50) |  |  | '~' |
| 14 | pk_pois | pk_pois | pk_pois | varchar2(50) |  |  | '~' |
| 15 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 16 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(50) |  |  | '~' |
| 17 | pk_usage_def | pk_usage_def | pk_usage_def | varchar2(20) |  |  | '~' |
| 18 | pk_usegenote | pk_usegenote | pk_usegenote | varchar2(20) |  |  | '~' |
| 19 | price | price | price | varchar2(50) |
| 20 | quan_def | quan_def | quan_def | varchar2(50) |
| 21 | spec_pd | spec_pd | spec_pd | varchar2(50) |
| 22 | srv_status | srv_status | srv_status | varchar2(50) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |