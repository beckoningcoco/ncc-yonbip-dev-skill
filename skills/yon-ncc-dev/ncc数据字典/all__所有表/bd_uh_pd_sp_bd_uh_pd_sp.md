# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdsp | pk_pdsp | pk_pdsp | char(20) | √ |
| 2 | agreecode | agreecode | agreecode | varchar2(50) |
| 3 | date_begin | date_begin | date_begin | char(19) |
| 4 | date_end | date_end | date_end | char(19) |
| 5 | flag_active | flag_active | flag_active | char(1) |
| 6 | flag_def | flag_def | flag_def | char(1) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 10 | pk_psn_agree | pk_psn_agree | pk_psn_agree | varchar2(20) |  |  | '~' |
| 11 | pk_sp | pk_sp | pk_sp | varchar2(20) |  |  | '~' |
| 12 | price_saleunit | price_saleunit | price_saleunit | number(28, 4) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |