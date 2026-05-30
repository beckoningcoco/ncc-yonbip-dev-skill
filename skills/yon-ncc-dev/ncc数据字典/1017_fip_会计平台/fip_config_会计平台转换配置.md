# |<<

**会计平台转换配置 (fip_config / nc.vo.fip.config.ConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_config | 对象标识 | pk_config | char(20) | √ | 主键 (UFID) |
| 2 | src_billtype | 来源交易类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 3 | des_billtype | 目标交易类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 4 | pk_register | 转换规则类型 | pk_register | varchar(20) |  | 转换规则类型 (ruleregister) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | issum | 是否汇总 | issum | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | generatemode | 生成方式 | generatemode | int |  | 生成方式 (generatemode) |  | 0=推式; |