# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_option | pk_option | pk_option | char(20) | √ |
| 2 | bdept | bdept | bdept | varchar2(1) |
| 3 | benablelog | benablelog | benablelog | char(1) |
| 4 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 5 | blanketorder | blanketorder | blanketorder | varchar2(1) |
| 6 | contractin | contractin | contractin | varchar2(1) |
| 7 | deliveryschedule | deliveryschedule | deliveryschedule | varchar2(1) |
| 8 | dmo | dmo | dmo | varchar2(1) |
| 9 | fdemandtype | fdemandtype | fdemandtype | number(38, 0) |
| 10 | historysupplynum | historysupplynum | historysupplynum | number(38, 0) |  |  | 0 |
| 11 | isdissipation | isdissipation | isdissipation | varchar2(1) |
| 12 | mps | mps | mps | char(1) |
| 13 | multiset | multiset | multiset | varchar2(1) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pmo | pmo | pmo | varchar2(1) |
| 18 | po | po | po | varchar2(1) |
| 19 | purschedule | purschedule | purschedule | varchar2(1) |
| 20 | scmpo | scmpo | scmpo | varchar2(1) |
| 21 | scmpray | scmpray | scmpray | varchar2(1) |
| 22 | singleset | singleset | singleset | varchar2(1) |
| 23 | stock | stock | stock | varchar2(1) |
| 24 | transa | transa | transa | varchar2(1) |
| 25 | transp | transp | transp | varchar2(1) |
| 26 | wwbill | wwbill | wwbill | varchar2(1) |
| 27 | creationtime | creationtime | creationtime | varchar2(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |