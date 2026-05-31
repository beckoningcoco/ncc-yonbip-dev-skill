# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8261.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relatedreports | pk_relatedreports | pk_relatedreports | char(20) | √ |
| 2 | pk_archivedcommonset | pk_archivedcommonset | pk_archivedcommonset | char(20) | √ |
| 3 | pk_report | pk_report | pk_report | varchar2(50) | √ |
| 4 | pk_task | pk_task | pk_task | varchar2(50) | √ |  | '~' |
| 5 | reportname | reportname | reportname | varchar2(50) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |