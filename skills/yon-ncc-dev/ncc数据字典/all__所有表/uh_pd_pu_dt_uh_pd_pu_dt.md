# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpudt | pk_pdpudt | pk_pdpudt | char(20) | √ |
| 2 | date_acpt | date_acpt | date_acpt | char(19) |
| 3 | date_reqr | date_reqr | date_reqr | char(19) |
| 4 | factor_bc | factor_bc | factor_bc | varchar2(50) |
| 5 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 6 | factor_fb | factor_fb | factor_fb | varchar2(50) |
| 7 | flag_acpt | flag_acpt | flag_acpt | char(1) |
| 8 | flag_active | flag_active | flag_active | char(1) |
| 9 | flag_pay | flag_pay | flag_pay | char(1) |
| 10 | materialspec | materialspec | materialspec | varchar2(50) |
| 11 | pk_dept_acpt | pk_dept_acpt | pk_dept_acpt | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_acpt | pk_org_acpt | pk_org_acpt | varchar2(20) |  |  | '~' |
| 16 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 17 | pk_pdpldt | pk_pdpldt | pk_pdpldt | varchar2(20) |  |  | '~' |
| 18 | pk_pdpu | pk_pdpu | pk_pdpu | varchar2(20) |  |  | '~' |
| 19 | pk_psn_acpt | pk_psn_acpt | pk_psn_acpt | varchar2(20) |  |  | '~' |
| 20 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 21 | quan_acpt_base | quan_acpt_base | quan_acpt_base | number(28, 8) |
| 22 | quan_pu_base | quan_pu_base | quan_pu_base | number(28, 8) |
| 23 | quan_pu_cur | quan_pu_cur | quan_pu_cur | number(28, 8) |
| 24 | sortno | sortno | sortno | number(38, 0) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |