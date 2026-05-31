# |<<

**客户物料码子表 (bd_custmatersub / nc.vo.uapbd.custom.CustomVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custom | 客户表主键 | pk_custom | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | maincustom | 主客户 | maincustom | varchar(20) | √ | 客户基本信息 (customer) |
| 5 | subcustom | 子客户 | subcustom | varchar(20) | √ | 客户基本信息 (customer) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |