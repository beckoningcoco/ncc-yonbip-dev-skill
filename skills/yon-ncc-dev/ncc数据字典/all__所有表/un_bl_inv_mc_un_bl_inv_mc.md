# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12827.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incmc | pk_incmc | pk_incmc | char(20) | √ |
| 2 | count_added | count_added | count_added | number(38, 0) |
| 3 | count_begin | count_begin | count_begin | number(38, 0) |
| 4 | count_end | count_end | count_end | number(38, 0) |
| 5 | count_reduced | count_reduced | count_reduced | number(38, 0) |
| 6 | date_begin | date_begin | date_begin | char(19) |
| 7 | date_end | date_end | date_end | char(19) |
| 8 | dt_mthclose | dt_mthclose | dt_mthclose | number(38, 0) |  |  | 1 |
| 9 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_invcate | pk_invcate | pk_invcate | varchar2(20) |  |  | '~' |
| 12 | pk_invcpkg | pk_invcpkg | pk_invcpkg | varchar2(20) |  |  | '~' |
| 13 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |