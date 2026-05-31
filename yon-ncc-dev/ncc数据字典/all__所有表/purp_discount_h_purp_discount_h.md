# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_h | pk_discount_h | pk_discount_h | char(20) | √ |
| 2 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 3 | denddate | denddate | denddate | varchar2(19) |
| 4 | dstartdate | dstartdate | dstartdate | varchar2(19) |
| 5 | fcondition | fcondition | fcondition | number(38, 0) |
| 6 | fpriorityrule | fpriorityrule | fpriorityrule | number(38, 0) |
| 7 | ftype | ftype | ftype | number(38, 0) |
| 8 | fuserange | fuserange | fuserange | number(38, 0) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 13 | vdiscountcode | vdiscountcode | vdiscountcode | varchar2(50) |
| 14 | vdiscountname | vdiscountname | vdiscountname | varchar2(300) |
| 15 | vdiscountname2 | vdiscountname2 | vdiscountname2 | varchar2(300) |
| 16 | vdiscountname3 | vdiscountname3 | vdiscountname3 | varchar2(300) |
| 17 | vdiscountname4 | vdiscountname4 | vdiscountname4 | varchar2(300) |
| 18 | vdiscountname5 | vdiscountname5 | vdiscountname5 | varchar2(300) |
| 19 | vdiscountname6 | vdiscountname6 | vdiscountname6 | varchar2(300) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |