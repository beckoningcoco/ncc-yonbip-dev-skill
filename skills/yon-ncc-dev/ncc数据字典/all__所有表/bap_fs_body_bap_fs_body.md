# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | compressflag | compressflag | compressflag | number(38, 0) | √ |  | 0 |
| 3 | cryptoflag | cryptoflag | cryptoflag | number(38, 0) | √ |  | 0 |
| 4 | filesize | filesize | filesize | number(30, 0) |
| 5 | filetype | filetype | filetype | varchar2(30) |
| 6 | headid | headid | headid | varchar2(30) |
| 7 | secretkey | secretkey | secretkey | blob |
| 8 | storepath | storepath | storepath | varchar2(300) |
| 9 | version | version | version | number(38, 0) | √ |  | 1 |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |