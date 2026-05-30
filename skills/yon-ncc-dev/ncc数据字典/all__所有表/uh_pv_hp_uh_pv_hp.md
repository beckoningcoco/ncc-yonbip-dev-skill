# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv_hp | pk_pv_hp | pk_pv_hp | char(20) | √ |
| 2 | flag_maj | flag_maj | flag_maj | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_pv | pk_pv | pk_pv | char(20) | √ |
| 7 | sortno | sortno | sortno | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |