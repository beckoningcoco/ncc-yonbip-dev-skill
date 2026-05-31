# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_careform | pk_careform | pk_careform | char(20) | √ |
| 2 | cre_datetime | cre_datetime | cre_datetime | char(19) |
| 3 | pk_dept | pk_dept | pk_dept | char(20) |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | pk_psn_cre | pk_psn_cre | pk_psn_cre | varchar2(20) |  |  | '~' |
| 7 | pk_pv | pk_pv | pk_pv | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |