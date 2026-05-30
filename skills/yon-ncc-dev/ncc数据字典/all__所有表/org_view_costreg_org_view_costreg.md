# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costregionsub | pk_costregionsub | pk_costregionsub | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | costregioninfos | costregioninfos | costregioninfos | char(20) | √ |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | financeorg_name | financeorg_name | financeorg_name | varchar2(50) |
| 6 | innercode | innercode | innercode | varchar2(50) |
| 7 | iscostregion | iscostregion | iscostregion | char(1) |
| 8 | isfinanceorg | isfinanceorg | isfinanceorg | char(1) |
| 9 | isrepertoryorg | isrepertoryorg | isrepertoryorg | char(1) |
| 10 | isstockorg | isstockorg | isstockorg | char(1) |
| 11 | mnecode | mnecode | mnecode | varchar2(50) |
| 12 | name | name | name | varchar2(300) |
| 13 | orgvoclass | orgvoclass | orgvoclass | varchar2(200) |
| 14 | pk_busiorg | pk_busiorg | pk_busiorg | varchar2(50) |
| 15 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 16 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 19 | shortname | shortname | shortname | varchar2(50) |
| 20 | stockorg_name | stockorg_name | stockorg_name | varchar2(50) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |