# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stordoc | pk_stordoc | pk_stordoc | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | csflag | csflag | csflag | char(1) |  |  | 'N' |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 6 | gubflag | gubflag | gubflag | char(1) |  |  | 'N' |
| 7 | isagentstore | isagentstore | isagentstore | char(1) | √ |  | 'N' |
| 8 | isatpaffected | isatpaffected | isatpaffected | char(1) | √ |  | 'Y' |
| 9 | iscalculatedinvcost | iscalculatedinvcost | iscalculatedinvcost | char(1) |  |  | 'Y' |
| 10 | iscommissionout | iscommissionout | iscommissionout | char(1) |  |  | 'N' |
| 11 | isdirectstore | isdirectstore | isdirectstore | char(1) | √ |  | 'N' |
| 12 | isdrugwarehouse | isdrugwarehouse | isdrugwarehouse | char(1) |
| 13 | iskptaxstore | iskptaxstore | iskptaxstore | varchar2(1) |
| 14 | isobligate | isobligate | isobligate | char(1) |  |  | 'Y' |
| 15 | isretail | isretail | isretail | char(1) |  |  | 'N' |
| 16 | isshopstore | isshopstore | isshopstore | char(1) |  |  | 'N' |
| 17 | isstoreontheway | isstoreontheway | isstoreontheway | char(1) | √ |  | 'N' |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | mrpflag | mrpflag | mrpflag | char(1) |  |  | 'Y' |
| 20 | name | name | name | varchar2(200) | √ |
| 21 | name2 | name2 | name2 | varchar2(200) |
| 22 | name3 | name3 | name3 | varchar2(200) |
| 23 | name4 | name4 | name4 | varchar2(200) |
| 24 | name5 | name5 | name5 | varchar2(200) |
| 25 | name6 | name6 | name6 | varchar2(200) |
| 26 | operatesupplier | operatesupplier | operatesupplier | varchar2(20) |  |  | '~' |
| 27 | phone | phone | phone | varchar2(30) |
| 28 | pk_address | pk_address | pk_address | varchar2(20) |  |  | '~' |
| 29 | pk_belongdept | pk_belongdept | pk_belongdept | varchar2(20) |  |  | '~' |
| 30 | pk_group | pk_group | pk_group | char(20) | √ |
| 31 | pk_org | pk_org | pk_org | char(20) | √ |
| 32 | principalcode | principalcode | principalcode | varchar2(25) |
| 33 | profitcentre | profitcentre | profitcentre | varchar2(20) |  |  | '~' |
| 34 | proflag | proflag | proflag | char(1) |  |  | 'N' |
| 35 | storaddr | storaddr | storaddr | varchar2(20) |  |  | '~' |
| 36 | warehousebelong | warehousebelong | warehousebelong | varchar2(20) |  |  | '~' |
| 37 | def1 | def1 | def1 | varchar2(101) |
| 38 | def2 | def2 | def2 | varchar2(101) |
| 39 | def3 | def3 | def3 | varchar2(101) |
| 40 | def4 | def4 | def4 | varchar2(101) |
| 41 | def5 | def5 | def5 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |