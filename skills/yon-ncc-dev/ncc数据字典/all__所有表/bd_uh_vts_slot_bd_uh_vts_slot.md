# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vts_slot | pk_vts_slot | pk_vts_slot | char(20) | √ |
| 2 | pk_cnslot | pk_cnslot | pk_cnslot | varchar2(20) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_srv_vts | pk_srv_vts | pk_srv_vts | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |