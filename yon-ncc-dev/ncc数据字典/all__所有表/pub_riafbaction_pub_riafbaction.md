# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | cid | cid | char(20) | √ |
| 2 | mid | mid | mid | char(20) |
| 3 | pk | pk | pk | char(20) | √ |
| 4 | pk_action | pk_action | pk_action | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |