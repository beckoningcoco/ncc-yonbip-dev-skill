# |<<

**科目分布式数据状态 (bd_account_dist / nc.vo.bd.account.distribution.AccDistDataStatuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/312.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_dist | 主键 | pk_account_dist | char(20) | √ | 主键 (UFID) |
| 2 | pk_accchart | 科目表 | pk_accchart | varchar(20) | √ | 科目表 (accchart) |
| 3 | syscatalogcode | 分布式系统 | syscatalogcode | varchar(512) | √ | 字符串 (String) |
| 4 | pk_group | 科目表所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_accsystem | 科目表所属体系 | pk_accsystem | varchar(20) | √ | 科目体系 (accsystem) |
| 6 | iseditflag | 是否编辑 | iseditflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | isdeleted | 是否删除的数据 | isdeleted | char(1) | √ | 布尔类型 (UFBoolean) |