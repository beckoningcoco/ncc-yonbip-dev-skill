# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12668.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpl | pk_pdpl | pk_pdpl | char(20) | √ |
| 2 | code_pl | code_pl | code_pl | varchar2(50) |
| 3 | date_pl | date_pl | date_pl | char(19) |
| 4 | dt_pdtype | dt_pdtype | dt_pdtype | varchar2(50) |
| 5 | dt_plantype | dt_plantype | dt_plantype | varchar2(50) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_acpt | flag_acpt | flag_acpt | char(1) |
| 8 | flag_active | flag_active | flag_active | char(1) |
| 9 | name_pl | name_pl | name_pl | varchar2(50) |
| 10 | note | note | note | varchar2(50) |
| 11 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_plantype | pk_plantype | pk_plantype | varchar2(50) |
| 15 | pk_psn_pl | pk_psn_pl | pk_psn_pl | varchar2(20) |  |  | '~' |
| 16 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |