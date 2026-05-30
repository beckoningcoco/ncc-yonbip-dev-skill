# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissappdt | pk_invissappdt | pk_invissappdt | char(20) | √ |
| 2 | appcnt | appcnt | appcnt | number(38, 0) |
| 3 | apppkgcnt | apppkgcnt | apppkgcnt | number(38, 0) |
| 4 | note | note | note | varchar2(256) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 7 | pk_invissapp | pk_invissapp | pk_invissapp | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |