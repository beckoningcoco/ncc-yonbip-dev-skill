# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12488.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrseccont | pk_emrseccont | pk_emrseccont | char(20) | √ |
| 2 | flag_compress | flag_compress | flag_compress | char(1) |
| 3 | pk_emrsec | pk_emrsec | pk_emrsec | varchar2(20) |  |  | '~' |
| 4 | pk_emrtempsec | pk_emrtempsec | pk_emrtempsec | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 7 | secfs | secfs | secfs | blob |
| 8 | secfs_print | secfs_print | secfs_print | blob |
| 9 | secxml | secxml | secxml | blob |
| 10 | timestamp | timestamp | timestamp | blob |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |