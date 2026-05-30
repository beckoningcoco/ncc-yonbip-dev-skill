# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_anydelte | pk_anydelte | pk_anydelte | char(20) | √ |
| 2 | delperson | delperson | delperson | varchar2(20) |  |  | '~' |
| 3 | deltime | deltime | deltime | char(19) |
| 4 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 5 | message | message | message | varchar2(1024) |
| 6 | pk_basdoc | pk_basdoc | pk_basdoc | char(20) |
| 7 | pk_task | pk_task | pk_task | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |