# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccosttypeid | ccosttypeid | ccosttypeid | char(20) | √ |
| 2 | accounttype | accounttype | accounttype | number(38, 0) |  |  | 2 |
| 3 | bcompute | bcompute | bcompute | char(1) |
| 4 | bcreatetable | bcreatetable | bcreatetable | char(1) |
| 5 | bdefault | bdefault | bdefault | char(1) |
| 6 | bdistribute | bdistribute | bdistribute | char(1) |
| 7 | bscrapfactor | bscrapfactor | bscrapfactor | char(1) |
| 8 | bshrinkfactor | bshrinkfactor | bshrinkfactor | char(1) |
| 9 | cbeginmonth | cbeginmonth | cbeginmonth | char(19) |
| 10 | ccosttypeid_src | ccosttypeid_src | ccosttypeid_src | char(20) |
| 11 | cendmonth | cendmonth | cendmonth | char(19) |
| 12 | enablestatus | enablestatus | enablestatus | char(1) |  |  | 'N' |
| 13 | org_src | org_src | org_src | varchar2(20) |
| 14 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 15 | pk_activitydocview | pk_activitydocview | pk_activitydocview | varchar2(20) |  |  | '~' |
| 16 | pk_elementsystem | pk_elementsystem | pk_elementsystem | varchar2(20) |  |  | '~' |
| 17 | pk_factorchart | pk_factorchart | pk_factorchart | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_materialdocview | pk_materialdocview | pk_materialdocview | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 22 | vcostpricesourcenum | vcostpricesourcenum | vcostpricesourcenum | varchar2(500) |
| 23 | vcosttypecode | vcosttypecode | vcosttypecode | varchar2(40) |
| 24 | vcosttypename | vcosttypename | vcosttypename | varchar2(300) |
| 25 | vcosttypename2 | vcosttypename2 | vcosttypename2 | varchar2(300) |
| 26 | vcosttypename3 | vcosttypename3 | vcosttypename3 | varchar2(300) |
| 27 | vcosttypename4 | vcosttypename4 | vcosttypename4 | varchar2(300) |
| 28 | vcosttypename5 | vcosttypename5 | vcosttypename5 | varchar2(300) |
| 29 | vcosttypename6 | vcosttypename6 | vcosttypename6 | varchar2(300) |
| 30 | vmaterialpricesourcenum | vmaterialpricesourcenum | vmaterialpricesourcenum | varchar2(500) |
| 31 | vnote | vnote | vnote | varchar2(1024) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |