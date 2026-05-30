# |<<

**成本资料关帐检查定义 (cm_checkdef / nc.vo.cm.costdataclose.entity.SelfCheckDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccheckdefid | 自定义检查 | ccheckdefid | char(20) | √ | 主键 (UFID) |
| 2 | vcode | 检查项编码 | vcode | varchar(40) |  | 字符串 (String) |
| 3 | vname | 检查项名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | vchecksql | sql语句 | vchecksql | varchar(300) |  | 字符串 (String) |
| 5 | vjavaclass | 自定义Java类 | vjavaclass | varchar(50) |  | 字符串 (String) |
| 6 | vnote | 备注 | vnote | varchar(1024) |  | 备注 (Memo) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 9 | pk_org_v | 工厂（多版本） | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 10 | bselected | 检查 | bselected | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | ichecklevel | 级别 | ichecklevel | int |  | 关账检查级别 (cdCloseCheckLevelEnum) | 2 | 1=错误; |