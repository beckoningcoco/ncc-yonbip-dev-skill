# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | pk_scheme | pk_scheme | char(20) | √ |
| 2 | bcalcscheme | bcalcscheme | bcalcscheme | char(1) |
| 3 | bdefault | bdefault | bdefault | char(1) |
| 4 | bdmoorder | bdmoorder | bdmoorder | char(1) |
| 5 | binapply | binapply | binapply | char(1) |
| 6 | bintoapply | bintoapply | bintoapply | char(1) |
| 7 | bintoorder | bintoorder | bintoorder | char(1) |
| 8 | binvapply | binvapply | binvapply | char(1) |
| 9 | bmatch | bmatch | bmatch | char(1) |
| 10 | bminusreq | bminusreq | bminusreq | char(1) |
| 11 | bminussup | bminussup | bminussup | char(1) |
| 12 | bmoorder | bmoorder | bmoorder | char(1) |
| 13 | bmtorder | bmtorder | bmtorder | char(1) |
| 14 | bonhand | bonhand | bonhand | char(1) |
| 15 | botheronhand | botheronhand | botheronhand | char(1) |
| 16 | bpuapply | bpuapply | bpuapply | char(1) |
| 17 | bpuorder | bpuorder | bpuorder | char(1) |
| 18 | bsafeonhand | bsafeonhand | bsafeonhand | char(1) |
| 19 | bsaleorder | bsaleorder | bsaleorder | char(1) |
| 20 | bscorder | bscorder | bscorder | char(1) |
| 21 | btoorder | btoorder | btoorder | char(1) |
| 22 | cplannerid | cplannerid | cplannerid | varchar2(20) |  |  | '~' |
| 23 | fconfirmrule | fconfirmrule | fconfirmrule | number(38, 0) |
| 24 | fdftreqrule | fdftreqrule | fdftreqrule | number(38, 0) |
| 25 | finvrange | finvrange | finvrange | number(38, 0) |
| 26 | fmethod | fmethod | fmethod | number(38, 0) |
| 27 | fproctype | fproctype | fproctype | number(38, 0) |
| 28 | fptfreqrule | fptfreqrule | fptfreqrule | number(38, 0) |
| 29 | ihistorydays | ihistorydays | ihistorydays | number(38, 0) |
| 30 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | vcode | vcode | vcode | varchar2(50) |
| 34 | vname | vname | vname | varchar2(200) |
| 35 | vname2 | vname2 | vname2 | varchar2(200) |
| 36 | vname3 | vname3 | vname3 | varchar2(200) |
| 37 | vname4 | vname4 | vname4 | varchar2(200) |
| 38 | vname5 | vname5 | vname5 | varchar2(200) |
| 39 | vname6 | vname6 | vname6 | varchar2(200) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |