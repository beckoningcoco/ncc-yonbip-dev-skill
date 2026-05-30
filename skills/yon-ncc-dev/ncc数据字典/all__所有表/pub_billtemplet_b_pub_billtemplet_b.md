# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtemplet_b | pk_billtemplet_b | pk_billtemplet_b | char(20) | √ |
| 2 | cardflag | cardflag | cardflag | number(38, 0) |  |  | 1 |
| 3 | datatype | datatype | datatype | number(38, 0) |  |  | 0 |
| 4 | defaultshowname | defaultshowname | defaultshowname | varchar2(150) |
| 5 | defaultvalue | defaultvalue | defaultvalue | varchar2(1000) |
| 6 | editflag | editflag | editflag | number(38, 0) |  |  | 1 |
| 7 | editformula | editformula | editformula | varchar2(1000) |
| 8 | foreground | foreground | foreground | number(38, 0) |  |  | 0 |
| 9 | hyperlinkflag | hyperlinkflag | hyperlinkflag | char(1) |
| 10 | idcolname | idcolname | idcolname | varchar2(50) |
| 11 | inputlength | inputlength | inputlength | number(38, 0) |  |  | 20 |
| 12 | itemkey | itemkey | itemkey | varchar2(50) | √ |
| 13 | itemtype | itemtype | itemtype | number(38, 0) |  |  | 0 |
| 14 | leafflag | leafflag | leafflag | char(1) |  |  | 'N' |
| 15 | listflag | listflag | listflag | number(38, 0) |  |  | 1 |
| 16 | listhyperlinkflag | listhyperlinkflag | listhyperlinkflag | char(1) |
| 17 | listshowflag | listshowflag | listshowflag | char(1) |
| 18 | listshoworder | listshoworder | listshoworder | number(38, 0) |  |  | null |
| 19 | loadformula | loadformula | loadformula | varchar2(1000) |
| 20 | lockflag | lockflag | lockflag | number(38, 0) |  |  | 0 |
| 21 | metadatapath | metadatapath | metadatapath | varchar2(100) |
| 22 | metadataproperty | metadataproperty | metadataproperty | varchar2(100) |
| 23 | metadatarelation | metadatarelation | metadatarelation | varchar2(2000) |
| 24 | newlineflag | newlineflag | newlineflag | char(1) |  |  | 'N' |
| 25 | nullflag | nullflag | nullflag | number(38, 0) |  |  | 0 |
| 26 | options | options | options | varchar2(400) |
| 27 | pk_billtemplet | pk_billtemplet | pk_billtemplet | char(20) | √ |
| 28 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '@@@@' |
| 29 | pos | pos | pos | number(38, 0) |  |  | 0 |
| 30 | reftype | reftype | reftype | varchar2(1000) |
| 31 | resid | resid | resid | varchar2(30) |
| 32 | resid_tabname | resid_tabname | resid_tabname | varchar2(30) |
| 33 | reviseflag | reviseflag | reviseflag | char(1) |  |  | 'N' |
| 34 | showflag | showflag | showflag | number(38, 0) |  |  | 1 |
| 35 | showorder | showorder | showorder | number(38, 0) |  |  | 0 |
| 36 | table_code | table_code | table_code | varchar2(40) |
| 37 | table_name | table_name | table_name | varchar2(75) |
| 38 | totalflag | totalflag | totalflag | number(38, 0) |  |  | 0 |
| 39 | userdefflag | userdefflag | userdefflag | char(1) |
| 40 | userdefine1 | userdefine1 | userdefine1 | varchar2(50) |
| 41 | userdefine2 | userdefine2 | userdefine2 | varchar2(50) |
| 42 | userdefine3 | userdefine3 | userdefine3 | varchar2(50) |
| 43 | usereditflag | usereditflag | usereditflag | number(38, 0) |  |  | 0 |
| 44 | userflag | userflag | userflag | number(38, 0) |  |  | 1 |
| 45 | userreviseflag | userreviseflag | userreviseflag | char(1) |
| 46 | usershowflag | usershowflag | usershowflag | number(38, 0) |  |  | 0 |
| 47 | validateformula | validateformula | validateformula | varchar2(1000) |
| 48 | width | width | width | number(38, 0) |  |  | 1 |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |