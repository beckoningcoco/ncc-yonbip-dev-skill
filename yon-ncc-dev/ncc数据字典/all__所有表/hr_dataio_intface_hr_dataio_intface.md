# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataio_intface | pk_dataio_intface | pk_dataio_intface | char(20) | √ |
| 2 | classid | classid | classid | char(20) |
| 3 | cperiod | cperiod | cperiod | char(2) |
| 4 | cyear | cyear | cyear | char(4) |
| 5 | date1 | date1 | date1 | char(10) |
| 6 | date2 | date2 | date2 | char(10) |
| 7 | idefault | idefault | idefault | char(1) |
| 8 | ifiletype | ifiletype | ifiletype | number(38, 0) | √ |  | 0 |
| 9 | iheadadjustbody | iheadadjustbody | iheadadjustbody | number(38, 0) |
| 10 | iifcaret | iifcaret | iifcaret | number(38, 0) | √ |  | 1 |
| 11 | iifdot | iifdot | iifdot | number(38, 0) | √ |  | 1 |
| 12 | iifkilobit | iifkilobit | iifkilobit | number(38, 0) | √ |  | 0 |
| 13 | iifseparator | iifseparator | iifseparator | number(38, 0) |
| 14 | iiftop | iiftop | iiftop | number(38, 0) | √ |  | 0 |
| 15 | iiftype | iiftype | iiftype | number(38, 0) | √ |  | 0 |
| 16 | iouthead | iouthead | iouthead | number(38, 0) | √ |  | 1 |
| 17 | iseparator | iseparator | iseparator | number(38, 0) |
| 18 | operatorid | operatorid | operatorid | char(20) |
| 19 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |
| 20 | pk_group | pk_group | pk_group | char(20) |
| 21 | pk_org | pk_org | pk_org | char(20) | √ |
| 22 | toplinenum | toplinenum | toplinenum | number(38, 0) | √ |  | 3 |
| 23 | toplineposition | toplineposition | toplineposition | number(38, 0) |
| 24 | vcol | vcol | vcol | varchar2(50) | √ |
| 25 | vfilename | vfilename | vfilename | varchar2(512) |
| 26 | vifname | vifname | vifname | varchar2(50) | √ |
| 27 | vifname2 | vifname2 | vifname2 | varchar2(50) |
| 28 | vifname3 | vifname3 | vifname3 | varchar2(50) |
| 29 | vifname4 | vifname4 | vifname4 | varchar2(50) |
| 30 | vifname5 | vifname5 | vifname5 | varchar2(50) |
| 31 | vifname6 | vifname6 | vifname6 | varchar2(50) |
| 32 | vmemo | vmemo | vmemo | varchar2(1024) |
| 33 | vtable | vtable | vtable | varchar2(50) | √ |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |