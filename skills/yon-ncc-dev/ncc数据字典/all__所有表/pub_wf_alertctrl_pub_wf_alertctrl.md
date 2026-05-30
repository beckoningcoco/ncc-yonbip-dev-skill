# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_alertctrl | pk_wf_alertctrl | pk_wf_alertctrl | char(20) | √ |
| 2 | exceptionclass | exceptionclass | exceptionclass | varchar2(200) | √ |
| 3 | module | module | module | varchar2(50) | √ |
| 4 | pluginclass | pluginclass | pluginclass | varchar2(200) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |