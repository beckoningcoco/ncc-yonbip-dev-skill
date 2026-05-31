# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicesrv | pk_invoicesrv | pk_invoicesrv | char(20) | √ |
| 2 | flag_ci | flag_ci | flag_ci | varchar2(50) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_invoice | pk_invoice | pk_invoice | char(20) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 7 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 8 | pk_srvcate | pk_srvcate | pk_srvcate | varchar2(50) |  |  | '~' |
| 9 | ratio | ratio | ratio | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |