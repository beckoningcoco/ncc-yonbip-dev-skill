# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sn | pk_sn | pk_sn | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | sn | sn | sn | varchar2(100) |
| 6 | sn_flag | sn_flag | sn_flag | varchar2(1) |  |  | 'N' |
| 7 | sn_type | sn_type | sn_type | varchar2(5) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |