# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouruleselfacct | pk_vouruleselfacct | pk_vouruleselfacct | char(20) | √ |
| 2 | assname | assname | assname | varchar2(2000) |
| 3 | assobj | assobj | assobj | blob |
| 4 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) | √ |  | '~' |
| 5 | pk_vouchkrule | pk_vouchkrule | pk_vouchkrule | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |