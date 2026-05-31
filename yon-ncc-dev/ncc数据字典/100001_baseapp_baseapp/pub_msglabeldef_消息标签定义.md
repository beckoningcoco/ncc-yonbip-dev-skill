# |<<

**消息标签定义 (pub_msglabeldef / nc.message.vo.MessageLabelDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msglabeldef | 主键 | pk_msglabeldef | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | style | 样式 | style | varchar(200) |  | 字符串 (String) |
| 5 | priority | 优先级 | priority | int |  | 整数 (Integer) |