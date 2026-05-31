# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code_father | code_father | code_father | varchar2(50) |
| 2 | dt_system | dt_system | dt_system | varchar2(50) |
| 3 | flagh_enable | flagh_enable | flagh_enable | char(50) |
| 4 | flag_root | flag_root | flag_root | char(1) |
| 5 | infect_code | infect_code | infect_code | varchar2(50) |
| 6 | infect_cycle | infect_cycle | infect_cycle | varchar2(50) |
| 7 | infect_name | infect_name | infect_name | varchar2(150) |
| 8 | mnecode | mnecode | mnecode | varchar2(50) |
| 9 | note | note | note | varchar2(50) |
| 10 | pk_father | pk_father | pk_father | char(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_infect_diag | pk_infect_diag | pk_infect_diag | char(20) | √ |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_system | pk_system | pk_system | char(20) |
| 16 | sortno | sortno | sortno | varchar2(50) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |