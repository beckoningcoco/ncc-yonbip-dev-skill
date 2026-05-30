# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | fcreatetime | fcreatetime | fcreatetime | number(28, 8) |
| 3 | filedata | filedata | filedata | blob |
| 4 | filepath | filepath | filepath | varchar2(2000) |
| 5 | flastmodify | flastmodify | flastmodify | number(28, 8) |
| 6 | flength | flength | flength | number(28, 8) |
| 7 | isfolder | isfolder | isfolder | char(1) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |