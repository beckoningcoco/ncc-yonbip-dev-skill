# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbarcoderulhid | cbarcoderulhid | cbarcoderulhid | char(20) | √ |
| 2 | bexport | bexport | bexport | char(1) |
| 3 | bparseflag | bparseflag | bparseflag | char(1) |
| 4 | bparsefloatflag | bparsefloatflag | bparsefloatflag | char(1) |
| 5 | bretail | bretail | bretail | char(1) |
| 6 | corpoid | corpoid | corpoid | varchar2(20) |  |  | '~' |
| 7 | corpvid | corpvid | corpvid | varchar2(50) |
| 8 | ibarcodetype | ibarcodetype | ibarcodetype | varchar2(50) | √ |
| 9 | ilength | ilength | ilength | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | vcode | vcode | vcode | varchar2(30) |
| 12 | vmemo | vmemo | vmemo | varchar2(200) |
| 13 | vname | vname | vname | varchar2(300) |
| 14 | vname2 | vname2 | vname2 | varchar2(300) |
| 15 | vname3 | vname3 | vname3 | varchar2(300) |
| 16 | vname4 | vname4 | vname4 | varchar2(300) |
| 17 | vname5 | vname5 | vname5 | varchar2(300) |
| 18 | vname6 | vname6 | vname6 | varchar2(300) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |