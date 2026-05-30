# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_controlmodedef | pk_controlmodedef | pk_controlmodedef | char(20) | √ |
| 2 | description | description | description | varchar2(80) | √ |
| 3 | impclass | impclass | impclass | varchar2(128) | √ |
| 4 | viewmsg | viewmsg | viewmsg | varchar2(1024) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |