# |<<

**账簿_核算账簿 (org_accbook / nc.vo.org.AccbookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbook | 核算账簿主键 | pk_accbook | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_relorg | 财务组织 | pk_relorg | varchar(20) | √ | 组织 (org) |
| 8 | pk_exratescheme | 外币汇率方案 | pk_exratescheme | varchar(20) |  | 外币汇率方案 (exratescheme) |
| 9 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 10 | isconvert | 允许折算 | isconvert | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |