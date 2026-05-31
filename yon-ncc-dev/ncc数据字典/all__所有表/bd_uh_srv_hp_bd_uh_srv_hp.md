# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvhp | pk_srvhp | pk_srvhp | char(20) | √ |
| 2 | dt_hptype | dt_hptype | dt_hptype | varchar2(50) |
| 3 | eu_itemlevel | eu_itemlevel | eu_itemlevel | number(38, 0) |
| 4 | name_hptype | name_hptype | name_hptype | varchar2(50) |
| 5 | name_itemlevel | name_itemlevel | name_itemlevel | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_hptype | pk_hptype | pk_hptype | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |