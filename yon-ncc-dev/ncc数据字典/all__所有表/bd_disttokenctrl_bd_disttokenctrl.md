# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenctrl | pk_disttokenctrl | pk_disttokenctrl | char(20) | √ |
| 2 | busiparam | busiparam | busiparam | varchar2(500) |
| 3 | callbacktime | callbacktime | callbacktime | char(19) |
| 4 | createsyscode | createsyscode | createsyscode | varchar2(100) |
| 5 | createtime | createtime | createtime | char(19) |
| 6 | reclaimer | reclaimer | reclaimer | varchar2(20) |  |  | '~' |
| 7 | releaser | releaser | releaser | varchar2(20) |  |  | '~' |
| 8 | releasetime | releasetime | releasetime | char(19) |
| 9 | releatime | releatime | releatime | char(19) |
| 10 | tokencode | tokencode | tokencode | varchar2(50) | √ |
| 11 | tokennum | tokennum | tokennum | varchar2(40) |
| 12 | tokenparam | tokenparam | tokenparam | blob |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |