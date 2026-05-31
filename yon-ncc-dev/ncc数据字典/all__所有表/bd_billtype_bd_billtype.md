# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) | √ |
| 2 | accountclass | accountclass | accountclass | varchar2(50) |
| 3 | billcoderule | billcoderule | billcoderule | varchar2(20) |
| 4 | billstyle | billstyle | billstyle | number(38, 0) |
| 5 | billtypename | billtypename | billtypename | varchar2(120) |
| 6 | billtypename2 | billtypename2 | billtypename2 | varchar2(120) |
| 7 | billtypename3 | billtypename3 | billtypename3 | varchar2(120) |
| 8 | billtypename4 | billtypename4 | billtypename4 | varchar2(120) |
| 9 | billtypename5 | billtypename5 | billtypename5 | varchar2(120) |
| 10 | billtypename6 | billtypename6 | billtypename6 | varchar2(120) |
| 11 | canextendtransaction | canextendtransaction | canextendtransaction | char(1) |
| 12 | checkclassname | checkclassname | checkclassname | varchar2(100) |
| 13 | classname | classname | classname | varchar2(50) |
| 14 | comp | comp | comp | varchar2(50) |
| 15 | component | component | component | varchar2(128) |
| 16 | datafinderclz | datafinderclz | datafinderclz | varchar2(50) |
| 17 | emendenumclass | emendenumclass | emendenumclass | varchar2(50) |
| 18 | forwardbilltype | forwardbilltype | forwardbilltype | varchar2(2000) |
| 19 | isaccount | isaccount | isaccount | char(1) |
| 20 | isapprovebill | isapprovebill | isapprovebill | char(1) |
| 21 | isbizflowbill | isbizflowbill | isbizflowbill | char(1) |
| 22 | iseditableproperty | iseditableproperty | iseditableproperty | char(1) |
| 23 | isenablebutton | isenablebutton | isenablebutton | char(1) |
| 24 | isenabletranstypebcr | isenabletranstypebcr | isenabletranstypebcr | char(1) |
| 25 | islightbill | islightbill | islightbill | char(1) |  |  | 'Y' |
| 26 | islock | islock | islock | char(1) |
| 27 | isrejectuneditableproperty | isrejectuneditableproperty | isrejectuneditableproperty | char(1) |  |  | 'N' |
| 28 | isroot | isroot | isroot | char(1) |
| 29 | isshowtranstypename | isshowtranstypename | isshowtranstypename | char(1) |  |  | 'N' |
| 30 | issupportmobile | issupportmobile | issupportmobile | char(1) |  |  | 'Y' |
| 31 | istransaction | istransaction | istransaction | char(1) |  |  | 'N' |
| 32 | isworkflowcanautoapprove | isworkflowcanautoapprove | isworkflowcanautoapprove | char(1) |  |  | 'N' |
| 33 | ncbrcode | ncbrcode | ncbrcode | varchar2(20) |
| 34 | nodecode | nodecode | nodecode | varchar2(20) |
| 35 | parentbilltype | parentbilltype | parentbilltype | varchar2(20) |
| 36 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | referclassname | referclassname | referclassname | varchar2(50) |
| 40 | systemcode | systemcode | systemcode | varchar2(20) |
| 41 | transtype_class | transtype_class | transtype_class | varchar2(100) |
| 42 | webnodecode | webnodecode | webnodecode | varchar2(20) |
| 43 | wherestring | wherestring | wherestring | varchar2(256) |
| 44 | def1 | def1 | def1 | varchar2(50) |
| 45 | def2 | def2 | def2 | varchar2(50) |
| 46 | def3 | def3 | def3 | varchar2(50) |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |