# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_synctrans | pk_synctrans | pk_synctrans | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | creatorclass | creatorclass | creatorclass | varchar2(200) |
| 4 | memo | memo | memo | varchar2(300) |
| 5 | processclass | processclass | processclass | varchar2(200) |
| 6 | receiptclass | receiptclass | receiptclass | varchar2(200) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |