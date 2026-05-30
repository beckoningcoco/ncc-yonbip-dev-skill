# |<<

**组织_信用控制域 (org_crectlregion / nc.vo.corg.CreditCtlRegionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccregion | 信用控制域主键 | pk_ccregion | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | memo | 说明 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |