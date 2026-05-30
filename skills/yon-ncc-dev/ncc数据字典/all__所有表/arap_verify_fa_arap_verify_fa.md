# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_fa | pk_verify_fa | pk_verify_fa | varchar2(20) | √ |
| 2 | bf_transtype | bf_transtype | bf_transtype | varchar2(36) |  |  | '~' |
| 3 | cytj | cytj | cytj | varchar2(2000) |
| 4 | descripe | descripe | descripe | varchar2(512) |
| 5 | df_transtype | df_transtype | df_transtype | varchar2(36) |  |  | '~' |
| 6 | isinit | isinit | isinit | char(1) |  |  | '~' |
| 7 | name | name | name | varchar2(128) |
| 8 | node_code | node_code | node_code | varchar2(40) |
| 9 | pcltj | pcltj | pcltj | varchar2(1024) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 13 | zdytj | zdytj | zdytj | varchar2(4000) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |