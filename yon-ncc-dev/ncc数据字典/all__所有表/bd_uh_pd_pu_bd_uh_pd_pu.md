# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpu | pk_pdpu | pk_pdpu | char(20) | √ |
| 2 | dt_pdputype | dt_pdputype | dt_pdputype | varchar2(50) |
| 3 | factor_bp | factor_bp | factor_bp | number(14, 2) |
| 4 | name_pdpu | name_pdpu | name_pdpu | varchar2(50) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_pd | pk_pd | pk_pd | varchar2(50) |  |  | '~' |
| 8 | pt_pdputype | pt_pdputype | pt_pdputype | varchar2(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |