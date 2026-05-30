# |<<

**利润中心结构 (org_pfconstruct / nc.vo.pfgroup.PfCconstructVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfconstruct | 利润中心结构标识 | pk_pfconstruct | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_vid | 版本主键 | pk_vid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | vname | 版本名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 9 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期 (UFDate) |
| 11 | venddate | 版本失效日期 | venddate | char(19) |  | 日期 (UFDate) |
| 12 | islastversion | 是否最新版本 | islastversion | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | enablestate | 启用状态0 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |