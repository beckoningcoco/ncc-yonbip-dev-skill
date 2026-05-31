# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlemap | pk_settlemap | pk_settlemap | char(20) | √ |
| 2 | controlflag | controlflag | controlflag | char(1) | √ |
| 3 | editflag | editflag | editflag | char(1) |
| 4 | funcode | funcode | funcode | varchar2(60) | √ |
| 5 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |
| 6 | pk_createcorp | pk_createcorp | pk_createcorp | varchar2(20) | √ |
| 7 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) | √ |
| 8 | pk_outerbook | pk_outerbook | pk_outerbook | char(20) |
| 9 | pk_outerorgbook | pk_outerorgbook | pk_outerorgbook | char(20) |
| 10 | pk_parent | pk_parent | pk_parent | char(20) |
| 11 | free1 | free1 | free1 | char(20) |
| 12 | free2 | free2 | free2 | char(20) |
| 13 | free3 | free3 | free3 | char(20) |
| 14 | free4 | free4 | free4 | char(20) |
| 15 | free5 | free5 | free5 | char(20) |
| 16 | free6 | free6 | free6 | char(20) |
| 17 | free7 | free7 | free7 | char(20) |
| 18 | free8 | free8 | free8 | char(20) |
| 19 | free9 | free9 | free9 | char(20) |
| 20 | free10 | free10 | free10 | char(20) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |