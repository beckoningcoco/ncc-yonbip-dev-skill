# |<<

**利润中心结构版本信息 (org_pfconstructversion / nc.vo.pfgoup.PfConstructVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 利润中心版本标识 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_pfconstruct | 利润中心结构 | pk_pfconstruct | char(20) | √ | 利润中心结构 (pfconstruct) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | vname | 版本名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 7 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期 (UFDate) |
| 9 | venddate | 版本失效日期 | venddate | char(19) |  | 日期 (UFDate) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestatus) |  | 0=已启用; |