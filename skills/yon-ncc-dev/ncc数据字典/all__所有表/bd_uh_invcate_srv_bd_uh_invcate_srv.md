# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcatesrv | pk_invcatesrv | pk_invcatesrv | char(20) | √ |
| 2 | factor | factor | factor | number(38, 0) |
| 3 | flag_cateitem | flag_cateitem | flag_cateitem | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_invcateitem | pk_invcateitem | pk_invcateitem | char(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 8 | pk_srvcate | pk_srvcate | pk_srvcate | varchar2(20) |  |  | '~' |
| 9 | rowno | rowno | rowno | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |