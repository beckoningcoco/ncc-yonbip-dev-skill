# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msnapshot | pk_msnapshot | pk_msnapshot | char(20) | √ |
| 2 | chartcontent | chartcontent | chartcontent | blob |
| 3 | reportcontent | reportcontent | reportcontent | blob |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |