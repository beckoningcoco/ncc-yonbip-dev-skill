# |<<

**业务动作类型 (iufo_actiontype / nc.vo.iufo.action.ActionType)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3385.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_actiontype | 业务动作类型PK | pk_actiontype | char(20) | √ | 主键 (UFID) |
| 2 | name | 类型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 类型编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | pluginname | 插件类名 | pluginname | varchar(500) |  | 字符串 (String) |
| 5 | note | 备注 | note | varchar(1024) |  | 字符串 (String) |