# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnpresview | pk_cnpresview | pk_cnpresview | char(20) | √ |
| 2 | date_doctreview | date_doctreview | date_doctreview | char(19) |
| 3 | date_pharreview | date_pharreview | date_pharreview | char(19) |
| 4 | flag_phar | flag_phar | flag_phar | char(1) |
| 5 | flag_review | flag_review | flag_review | char(1) |
| 6 | name_psn_docreview | name_psn_docreview | name_psn_docreview | varchar2(50) |
| 7 | name_psn_phar | name_psn_phar | name_psn_phar | varchar2(50) |
| 8 | note | note | note | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pres | pk_pres | pk_pres | varchar2(20) |  |  | '~' |
| 12 | pk_psn_docreview | pk_psn_docreview | pk_psn_docreview | varchar2(20) |  |  | '~' |
| 13 | pk_psn_phar | pk_psn_phar | pk_psn_phar | varchar2(20) |  |  | '~' |
| 14 | result_review | result_review | result_review | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |