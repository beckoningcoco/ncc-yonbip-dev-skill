# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemtotal | pk_systemtotal | pk_systemtotal | char(20) | √ |
| 2 | company_code | company_code | company_code | varchar2(50) |
| 3 | company_name | company_name | company_name | varchar2(50) |
| 4 | isconstitutionabnomal | isconstitutionabnomal | isconstitutionabnomal | varchar2(50) |
| 5 | isdirectorabnomal | isdirectorabnomal | isdirectorabnomal | varchar2(50) |
| 6 | isimplementationabnomal | isimplementationabnomal | isimplementationabnomal | varchar2(50) |
| 7 | ismanageabnomal | ismanageabnomal | ismanageabnomal | varchar2(50) |
| 8 | ispartyruleabnomal | ispartyruleabnomal | ispartyruleabnomal | varchar2(50) |
| 9 | meet_director | meet_director | meet_director | number(38, 0) |
| 10 | meet_manage | meet_manage | meet_manage | number(38, 0) |
| 11 | meet_party | meet_party | meet_party | number(38, 0) |
| 12 | system_constitution | system_constitution | system_constitution | number(38, 0) |
| 13 | system_implementation | system_implementation | system_implementation | number(38, 0) |
| 14 | system_manage | system_manage | system_manage | number(38, 0) |
| 15 | system_total | system_total | system_total | number(38, 0) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |