# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custmerge | pk_custmerge | pk_custmerge | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | operatetime | operatetime | operatetime | char(19) |
| 4 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | char(20) | √ |
| 6 | pk_org | pk_org | pk_org | char(20) | √ |
| 7 | pk_source | pk_source | pk_source | varchar2(20) |  |  | '~' |
| 8 | pk_target | pk_target | pk_target | varchar2(20) |  |  | '~' |
| 9 | sourcecust | sourcecust | sourcecust | blob |
| 10 | source_code | source_code | source_code | varchar2(50) |
| 11 | source_name | source_name | source_name | varchar2(300) |
| 12 | source_name2 | source_name2 | source_name2 | varchar2(300) |
| 13 | source_name3 | source_name3 | source_name3 | varchar2(300) |
| 14 | source_name4 | source_name4 | source_name4 | varchar2(300) |
| 15 | source_name5 | source_name5 | source_name5 | varchar2(300) |
| 16 | source_name6 | source_name6 | source_name6 | varchar2(300) |
| 17 | source_org | source_org | source_org | varchar2(20) |  |  | '~' |
| 18 | target_code | target_code | target_code | varchar2(40) |
| 19 | target_name | target_name | target_name | varchar2(300) |
| 20 | target_name2 | target_name2 | target_name2 | varchar2(300) |
| 21 | target_name3 | target_name3 | target_name3 | varchar2(300) |
| 22 | target_name4 | target_name4 | target_name4 | varchar2(300) |
| 23 | target_name5 | target_name5 | target_name5 | varchar2(300) |
| 24 | target_name6 | target_name6 | target_name6 | varchar2(300) |
| 25 | target_org | target_org | target_org | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |