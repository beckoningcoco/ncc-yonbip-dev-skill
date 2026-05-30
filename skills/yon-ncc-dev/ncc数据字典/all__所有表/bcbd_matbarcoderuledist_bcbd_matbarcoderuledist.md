# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 2 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | varchar2(50) |
| 4 | isdefault | isdefault | isdefault | char(1) | √ |  | 'N' |
| 5 | matbarcoderule | matbarcoderule | matbarcoderule | varchar2(20) |  |  | '~' |
| 6 | matbarcoderule_v | matbarcoderule_v | matbarcoderule_v | varchar2(20) | √ |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_matbasclass | pk_matbasclass | pk_matbasclass | varchar2(20) |  |  | '~' |
| 9 | pk_matruledist | pk_matruledist | pk_matruledist | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |