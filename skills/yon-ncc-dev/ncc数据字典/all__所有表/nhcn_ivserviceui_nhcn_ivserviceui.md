# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivsrv | pk_ivsrv | pk_ivsrv | char(20) | √ |
| 2 | code_srv | code_srv | code_srv | varchar2(50) |
| 3 | date_num | date_num | date_num | number(38, 0) |
| 4 | drip_speed | drip_speed | drip_speed | number(38, 0) |
| 5 | dt_frequnit | dt_frequnit | dt_frequnit | varchar2(50) |
| 6 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 7 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 8 | dt_usegenote | dt_usegenote | dt_usegenote | varchar2(50) |
| 9 | eu_abrd | eu_abrd | eu_abrd | varchar2(50) |
| 10 | eu_settype | eu_settype | eu_settype | number(38, 0) |
| 11 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 12 | factor_mb | factor_mb | factor_mb | varchar2(50) |
| 13 | flag_pati | flag_pati | flag_pati | char(1) |
| 14 | flag_pd | flag_pd | flag_pd | char(1) |
| 15 | flag_srvset | flag_srvset | flag_srvset | char(1) |
| 16 | freqct | freqct | freqct | number(28, 8) |
| 17 | hpnote | hpnote | hpnote | varchar2(256) |
| 18 | isdefault | isdefault | isdefault | char(1) |
| 19 | measrate | measrate | measrate | varchar2(50) |
| 20 | name_fac | name_fac | name_fac | varchar2(50) |
| 21 | name_freq | name_freq | name_freq | varchar2(50) |
| 22 | name_measdoc_med | name_measdoc_med | name_measdoc_med | varchar2(50) |
| 23 | name_measdoc_salse | name_measdoc_salse | name_measdoc_salse | varchar2(50) |
| 24 | name_pd | name_pd | name_pd | varchar2(50) |
| 25 | name_qu_measdoc | name_qu_measdoc | name_qu_measdoc | varchar2(50) |
| 26 | name_srv | name_srv | name_srv | varchar2(50) |
| 27 | name_usage | name_usage | name_usage | varchar2(50) |
| 28 | name_usegenote | name_usegenote | name_usegenote | varchar2(50) |
| 29 | note | note | note | varchar2(50) |
| 30 | pk_fac | pk_fac | pk_fac | varchar2(50) |
| 31 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 32 | pk_freq_def | pk_freq_def | pk_freq_def | varchar2(20) |  |  | '~' |
| 33 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 34 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | varchar2(20) |  |  | '~' |
| 35 | pk_measdoc_qu | pk_measdoc_qu | pk_measdoc_qu | varchar2(50) |
| 36 | pk_measdoc_sale | pk_measdoc_sale | pk_measdoc_sale | varchar2(20) |  |  | '~' |
| 37 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(50) |
| 38 | pk_ordsrvpd | pk_ordsrvpd | pk_ordsrvpd | varchar2(50) |
| 39 | pk_pd | pk_pd | pk_pd | varchar2(50) |  |  | '~' |
| 40 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 41 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(50) |
| 42 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 43 | pk_usegenote | pk_usegenote | pk_usegenote | varchar2(20) |  |  | '~' |
| 44 | price | price | price | number(28, 8) |
| 45 | quan | quan | quan | number(28, 8) |
| 46 | quan_cur | quan_cur | quan_cur | number(28, 8) |
| 47 | spec_pd | spec_pd | spec_pd | varchar2(50) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |