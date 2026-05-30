# |<<

**业务规则扩展 (pub_pluginitem / nc.vo.pubapp.plugin.RuleExtendItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4752.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pluginitem | 扩展条目主键 | pk_pluginitem | char(20) | √ | 主键 (UFID) |
| 2 | vextendmodule | 扩展点模块 | vextendmodule | varchar(20) | √ | 模块信息 (module) |
| 3 | vmodulename | 模块名称 | vmodulename | varchar(20) | √ | 模块信息 (module) |
| 4 | vcomponentname | 业务组件名称 | vcomponentname | varchar(100) | √ | 字符串 (String) |
| 5 | vextendpointname | 扩展点名称 | vextendpointname | varchar(100) | √ | 字符串 (String) |
| 6 | vextendtype | 扩展类型 | vextendtype | varchar(50) | √ | 扩展类型 (vextendtype) |  | 1=指定规则后; |