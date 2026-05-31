# |<<

**月结检查项类别 (org_checktype / nc.vo.org.closeaccbook.CheckTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4025.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checktype | 检查项类别主键 | pk_checktype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | moduleid | 所属模块 | moduleid | varchar(20) |  | 模块信息 (module) |
| 5 | code | 检查项类别编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 检查项类别名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | description | 备注 | description | varchar(200) |  | 备注 (Memo) |
| 8 | ispreset | 预置 | ispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |