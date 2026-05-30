# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_org | pk_org | pk_org | char(20) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 6 | recordnum | recordnum | recordnum | number(38, 0) |
| 7 | spearea | spearea | spearea | varchar2(192) |
| 8 | spebegin | spebegin | spebegin | char(10) |
| 9 | speben | speben | speben | varchar2(192) |
| 10 | speend | speend | speend | char(10) |
| 11 | spename | spename | spename | varchar2(192) |
| 12 | spepart | spepart | spepart | varchar2(192) |
| 13 | spesort | spesort | spesort | varchar2(192) |
| 14 | speunit | speunit | speunit | varchar2(192) |
| 15 | speunitlev | speunitlev | speunitlev | varchar2(192) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |