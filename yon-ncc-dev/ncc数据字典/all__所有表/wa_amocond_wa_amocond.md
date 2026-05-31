# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_amocond | pk_wa_amocond | pk_wa_amocond | char(20) | √ |
| 2 | formula | formula | formula | varchar2(4000) |
| 3 | formulastr | formulastr | formulastr | varchar2(4000) |
| 4 | fratio | fratio | fratio | number(9, 6) |  |  | 0 |
| 5 | itemkey | itemkey | itemkey | varchar2(20) |
| 6 | pk_amoscheme | pk_amoscheme | pk_amoscheme | char(20) | √ |
| 7 | pk_amo_org | pk_amo_org | pk_amo_org | char(20) | √ |
| 8 | pk_wa_item | pk_wa_item | pk_wa_item | char(20) |
| 9 | priority | priority | priority | number(38, 0) |
| 10 | type | type | type | number(38, 0) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |